package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.Homer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


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
