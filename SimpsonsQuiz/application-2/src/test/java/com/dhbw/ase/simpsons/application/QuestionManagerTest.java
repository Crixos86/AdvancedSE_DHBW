package com.dhbw.ase.simpsons.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class QuestionManagerTest {
    @Test
    public void testAskQuestions() {
        // Create a new instance of QuestionManager
        QuestionManager questionManager = new QuestionManager();
        // Prepare input stream with mock user input
        int size = questionManager.charToName.size() * 2;
        MockInputGenerator mockInputGenerator = new MockInputGenerator(size, 42L);
        String mockInput = mockInputGenerator.generateMockInput();
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
