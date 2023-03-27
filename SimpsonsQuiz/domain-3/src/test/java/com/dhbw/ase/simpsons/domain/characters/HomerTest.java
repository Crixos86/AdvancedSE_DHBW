package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.Homer;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class HomerTest {

    @Test
    public void testIntroduce() {
        Homer homer = new Homer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        homer.giveQuote();
        String expectedOutput = "Famous Quote: \"D'oh!\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
