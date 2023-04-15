package com.dhbw.ase.simpsons.domain.characters;
import com.dhbw.ase.simpsons.domain.charakters.ComicBookGuy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


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
