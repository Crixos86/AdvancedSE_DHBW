package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MargeTest {

    @Test
    public void testIntroduce() {
        Marge marge = new Marge();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        marge.giveQuote();
        String expectedOutput = "Famous Quote: \"They just Made A Terrible Life Choice.\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
