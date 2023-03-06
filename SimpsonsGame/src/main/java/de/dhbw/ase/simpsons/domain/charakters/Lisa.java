package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class Lisa extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Lisa";
    private int age = 8;
    private String job = "Student";

    public Lisa() {
        super("Lisa", 8, "Student");
    }

    public void playSaxophone() {
        System.out.println(name + " is playing the saxophone.");
    }

    public void solveProblems() {
        System.out.println(name + " is solving problems.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("My interests include music, science, justice, animals, shapes, feelings...");
    }
}
