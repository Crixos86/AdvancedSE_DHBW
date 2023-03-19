package de.dhbw.ase.simpsons.domain.characters;
import de.dhbw.ase.simpsons.domain.charakters.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

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
