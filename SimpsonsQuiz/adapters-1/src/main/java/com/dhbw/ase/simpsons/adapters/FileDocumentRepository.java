package com.dhbw.ase.simpsons.adapters;

import com.dhbw.ase.simpsons.application.DocumentRepository;
import com.dhbw.ase.simpsons.domain.document.Document;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDocumentRepository implements DocumentRepository {
    private final String storagePath;

    public FileDocumentRepository(String storagePath) {
        this.storagePath = storagePath;
    }

    @Override
    public void save(Document document) throws IOException {
        Path filePath = Paths.get(storagePath, document.getId() + ".txt");
        Files.write(filePath, document.getContent().getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public Document findById(String id) throws IOException {
        Path filePath = Paths.get(storagePath, id + ".txt");
        if (Files.exists(filePath)) {
            String content = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
            return new Document(id, content);
        } else {
            return null;
        }
    }
}
