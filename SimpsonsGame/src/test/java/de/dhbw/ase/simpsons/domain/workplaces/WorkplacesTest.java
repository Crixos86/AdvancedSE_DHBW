package de.dhbw.ase.simpsons.domain.workplaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkplacesTest {

    @Test
    void testGettersAndSetters() {
        Workplaces wp = new Workplaces("Nuclear Power Plant", "Springfield", 100, "Mr. Burns");

        assertEquals("Nuclear Power Plant", wp.getName());
        assertEquals("Springfield", wp.getLocation());
        assertEquals(100, wp.getNumberOfEmployees());
        assertEquals("Mr. Burns", wp.getOwner());

        wp.setName("Krusty Burger");
        wp.setLocation("Downtown");
        wp.setNumberOfEmployees(20);
        wp.setOwner("Krusty the Clown");

        assertEquals("Krusty Burger", wp.getName());
        assertEquals("Downtown", wp.getLocation());
        assertEquals(20, wp.getNumberOfEmployees());
        assertEquals("Krusty the Clown", wp.getOwner());
    }

}
