package com.dhbw.ase.simpsons.application;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class QuestionManagerTest {
    @Test
    public void testAskQuestions() {

        // Create a new instance of QuestionManager
        QuestionManager questionManager = new QuestionManager();
        // Prepare input stream with mock user input
        int size = questionManager.charToName.size() * 2; // Größe der Map * 2 (jede Antwort hat 2 Zeichen)
        StringBuilder mockInputBuilder = new StringBuilder(size); // StringBuilder mit der Größe der Map initialisieren
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            char c = random.nextBoolean() ? 'y' : 'n'; // zufällig 'y' oder 'n' wählen
            mockInputBuilder.append(c).append('\n'); // Zeichen und \n zum StringBuilder hinzufügen
        }

        String mockInput = mockInputBuilder.toString();
        System.out.println(size);
        System.out.println(mockInput);
        System.setIn(new ByteArrayInputStream(mockInput.getBytes()));

        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        QuestionManager questionManager2 = new QuestionManager();
        // Call the method to be tested
        Character result = questionManager2.askQuestions();


        // Assert that the result is one of the expected characters
        List<Character> validChars = Arrays.asList('H', 'M', 'L', 'B', 'A', 'N', 'C', 'X', 'Y', 'S');
        assertTrue(validChars.contains(result));
    }
}
