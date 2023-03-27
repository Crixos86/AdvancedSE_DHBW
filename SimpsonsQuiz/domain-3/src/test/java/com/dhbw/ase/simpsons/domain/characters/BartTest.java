package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.Bart;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

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
