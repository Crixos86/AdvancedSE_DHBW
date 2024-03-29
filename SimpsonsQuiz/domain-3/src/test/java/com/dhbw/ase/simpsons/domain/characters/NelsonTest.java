package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class NelsonTest {

    @Test
    public void testIntroduce() {
        Nelson nelson = new Nelson();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        nelson.giveQuote();
        String expectedOutput = "Famous Quote: \"Ha ha!\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
