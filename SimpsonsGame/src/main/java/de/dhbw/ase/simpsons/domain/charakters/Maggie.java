package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;

public class Maggie extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Maggie";
    private int age = 1;
    private String job = "Infant";

    public Maggie() {
        super("Maggie", 1, "Infant");
    }
    public void suckThumb() {
        System.out.println(name + " is sucking her thumb.");
    }

    public void playWithRattle() {
        System.out.println(name + " is playing with a rattle.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        presentHomeAndWorkplace();
        giveQuote();
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beatiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();
        System.out.println("I do nothing besides playing with my rattle and sucking my thumb.");
    }

    @Override
    public void giveQuote() {
        System.out.println("Tschop Tschop");
    }
}

