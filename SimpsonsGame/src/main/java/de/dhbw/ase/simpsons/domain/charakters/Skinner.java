package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class Skinner extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Skinner";
    private int age = 54;
    private String job = "School Principal";

    public Skinner() {
        super("Skinner", 54, "School Principal");
    }
    public void workAsPrincipal() {
        System.out.println(name + " is working as the school principal.");
    }

    public void disciplineStudents() {
        System.out.println(name + " is disciplining students.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("Science has it all.");
    }
}
