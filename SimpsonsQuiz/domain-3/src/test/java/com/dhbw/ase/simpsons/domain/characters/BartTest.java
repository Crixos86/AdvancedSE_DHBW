package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.Bart;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class BartTest {

    @Test
    public void testIntroduce() {
        Bart bart = new Bart();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bart.giveQuote();
        String expectedOutput = "Famous Quote: \"I didn't do it, nobody saw me do it, there's no way you can prove anything!\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
