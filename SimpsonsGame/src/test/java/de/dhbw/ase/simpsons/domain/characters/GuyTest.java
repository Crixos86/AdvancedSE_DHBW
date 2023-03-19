package de.dhbw.ase.simpsons.domain.characters;
import de.dhbw.ase.simpsons.domain.charakters.Apu;
import de.dhbw.ase.simpsons.domain.charakters.Bart;
import de.dhbw.ase.simpsons.domain.charakters.ComicBookGuy;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class GuyTest {

    @Test
    public void testIntroduce() {
        ComicBookGuy guy = new ComicBookGuy();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        guy.giveQuote();
        String expectedOutput = "Famous Quote: \"I'm not a nerd, I'm a collector of rare and valuable things.\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
