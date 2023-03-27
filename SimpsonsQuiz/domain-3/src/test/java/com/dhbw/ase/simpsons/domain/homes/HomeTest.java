package com.dhbw.ase.simpsons.domain.homes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeTest {

    @Test
    void testConstructor() {
        Home home = new Home("123 Main St", 3, 2, 1500);

        assertEquals("123 Main St", home.getAddress());
        assertEquals(3, home.getNumberOfRooms());
        assertEquals(2, home.getNumberOfBathrooms());
        assertEquals(1500, home.getSquareFootage());
    }

    @Test
    void testSetterMethods() {
        Home home = new Home("123 Main St", 3, 2, 1500);

        home.setAddress("456 Elm St");
        home.setNumberOfRooms(4);
        home.setNumberOfBathrooms(3);
        home.setSquareFootage(2000);

        assertEquals("456 Elm St", home.getAddress());
        assertEquals(4, home.getNumberOfRooms());
        assertEquals(3, home.getNumberOfBathrooms());
        assertEquals(2000, home.getSquareFootage());
    }

}
