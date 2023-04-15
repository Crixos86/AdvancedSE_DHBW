package com.dhbw.ase.simpsons.application;

import com.dhbw.ase.simpsons.domain.document.Document;

import java.io.IOException;

public interface DocumentRepository {
    void save(Document document) throws IOException;
    Document findById(String id) throws IOException;
}

