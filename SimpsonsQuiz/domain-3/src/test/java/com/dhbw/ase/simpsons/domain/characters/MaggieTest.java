package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MaggieTest {

    @Test
    public void testIntroduce() {
        Maggie maggie = new Maggie();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        maggie.giveQuote();
        String expectedOutput = "Famous Quote: \"Tschop Tschop\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
