package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.Apu;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class ApuTest {

    @Test
    public void testIntroduce() {
        Apu apu = new Apu();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        apu.giveQuote();
        String expectedOutput = "Famous Quote: \"Never have I seen you look so unhappy while purchasing such a large quantity of ice cream!\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}