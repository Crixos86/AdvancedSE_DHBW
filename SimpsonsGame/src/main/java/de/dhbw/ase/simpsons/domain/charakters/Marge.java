package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Marge extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Marge";
    private int age = 34;
    private String job = "Artist and Housewife";

    public Marge() {
        super("Marge", 34, "Housewife");
    }

    public void bakeCake() {
        System.out.println(name + " is baking a cake.");
    }

    public void careForChildren() {
        System.out.println(name + " is caring for the children.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        presentHomeAndWorkplace();
        giveQuote();
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live and work in a beatiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();

    }

    @Override
    public void giveQuote() {
        System.out.println("They just Made A Terrible Life Choice.");
    }
}
