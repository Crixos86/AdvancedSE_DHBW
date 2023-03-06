package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

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
    }

    @Override
    public void giveQuote() {
        System.out.println("They just Made A Terrible Life Choice.");
    }
}
