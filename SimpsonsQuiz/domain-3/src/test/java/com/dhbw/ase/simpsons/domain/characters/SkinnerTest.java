package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class SkinnerTest {

    @Test
    public void testIntroduce() {
        Skinner skinner = new Skinner();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        skinner.giveQuote();
        String expectedOutput = "Famous Quote: \"Science has it all.\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
