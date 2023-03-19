package de.dhbw.ase.simpsons.domain.characters;
import de.dhbw.ase.simpsons.domain.charakters.Apu;
import de.dhbw.ase.simpsons.domain.charakters.Bart;
import de.dhbw.ase.simpsons.domain.charakters.Homer;
import de.dhbw.ase.simpsons.domain.charakters.Lisa;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class LisaTest {

    @Test
    public void testIntroduce() {
        Lisa lisa = new Lisa();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        lisa.giveQuote();
        String expectedOutput = "Famous Quote: \"My interests include music, science, justice, animals, shapes, feelings...\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
