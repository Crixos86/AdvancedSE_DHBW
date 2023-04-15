package com.dhbw.ase.simpsons.adapters;

import com.dhbw.ase.simpsons.application.DocumentRepository;
import com.dhbw.ase.simpsons.domain.document.Document;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class GameTerminal implements Output{



    public void printBanner() {
        String[] Banner = {
                " # #####  ##  ##  #######            #####    ######  ##   ##  ######    #####    #####   ##   ##   #####",
                "## ## ##  ##  ##   ##   #           ##   ##     ##    ### ###   ##  ##  ##   ##  ### ###  ###  ##  ##   ##",
                "   ##     ##  ##   ##               ##          ##    #######   ##  ##  ##       ##   ##  #### ##  ##",
                "   ##     ######   ####              #####      ##    ## # ##   #####    #####   ##   ##  #######   #####",
                "   ##     ##  ##   ##                    ##     ##    ##   ##   ##           ##  ##   ##  ## ####       ##",
                "   ##     ##  ##   ##   #           ##   ##     ##    ##   ##   ##      ##   ##  ### ###  ##  ###  ##   ##",
                "  ####    ##  ##  #######            #####    ######  ### ###  ####      #####    #####   ##   ##   #####"
        };
        for (String line : Banner) {
            System.out.println(line);
        }
        greeting();
    }

    public static void greeting() {
        System.out.println("\nWelcome to the Simpsons Game!\nLet me ask you some questions to verify which Simpsons Character you are alike.\n");
    }


    public void printOutput() {
        try {
            // Call UserBuild.performActionBasedOnAnswers() and get the content as a String
            ByteArrayOutputStream contentStream = new ByteArrayOutputStream();
            PrintStream contentOut = new PrintStream(contentStream);
            PrintStream standardOut = System.out;

            // Redirecting the output to the terminal and to contentOut
            MultiOutputStream multiOut = new MultiOutputStream(standardOut, contentOut);
            PrintStream out = new PrintStream(multiOut);
            System.setOut(out);

            // Call UserBuild.performActionBasedOnAnswers() and close contentOut
            UserBuild.performActionBasedOnAnswers();
            contentOut.close();

            // Restore the original standard output
            System.setOut(standardOut);

            // Create a Document instance with the generated content
            String content = contentStream.toString("UTF-8");
            Document document = new Document("YourCharacter", content);

            // Save the document using the repository
            String storagePath = System.getProperty("user.dir");
            DocumentRepository documentRepository = new FileDocumentRepository(storagePath);
            documentRepository.save(document);

        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben der Datei: " + e);
        }
    }


}
