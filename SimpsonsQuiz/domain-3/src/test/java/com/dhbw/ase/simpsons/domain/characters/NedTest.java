package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class NedTest {

    @Test
    public void testIntroduce() {
        Ned ned = new Ned();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ned.giveQuote();
        String expectedOutput = "Famous Quote: \"Hi diddly ho neighborino.\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
