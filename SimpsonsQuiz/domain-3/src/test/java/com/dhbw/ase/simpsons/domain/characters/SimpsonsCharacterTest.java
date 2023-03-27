package com.dhbw.ase.simpsons.domain.characters;

import com.dhbw.ase.simpsons.domain.charakters.SimpsonsCharacter;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpsonsCharacterTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void testFavoriteFood() {
        SimpsonsCharacter character = new SimpsonsCharacter("Homer", 39, "Nuclear Safety Inspector");
        character.favoriteFood(ConsumerGood.DONUT);

        String expectedOutput = "Homers' favourite food is: Donuts\n".trim();
        String actualOutput = outputStreamCaptor.toString();
        assertEquals(expectedOutput.strip(), actualOutput.strip());
    }

    @Test
    void testPersonalTransport() {
        SimpsonsCharacter character = new SimpsonsCharacter("Bart", 10, "Student");
        character.personalTransport(PersonalTransport.BARTBOARD);

        String expectedOutput = "Barts' preferred method of transportation is: a skateboard, ride or die man!\n".trim();
        String actualOutput = outputStreamCaptor.toString();
        System.out.println(actualOutput);
        assertEquals(expectedOutput.strip(), actualOutput.strip());
    }




}

