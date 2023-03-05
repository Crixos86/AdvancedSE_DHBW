package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class Nelson extends Character implements CharacterAction {
    private final String name = "Nelson";
    private int age = 11;
    private String job = "School Bully";

    public Nelson() {
        super("Nelson", 11, "School Bully");
    }
    public void bullyStudents() {
        System.out.println(name + " is bullying students.");
    }

    public void laugh() {
        System.out.println(name + " is laughing.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("Ha ha!");
    }
}

