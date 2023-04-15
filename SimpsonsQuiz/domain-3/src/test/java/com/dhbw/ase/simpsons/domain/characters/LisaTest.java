package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.Lisa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class LisaTest {

    @Test
    public void testIntroduce() {
        Lisa lisa = new Lisa();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        lisa.giveQuote();
        String expectedOutput = "Famous Quote: \"My interests include music, science, justice, animals, shapes, feelings...\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
