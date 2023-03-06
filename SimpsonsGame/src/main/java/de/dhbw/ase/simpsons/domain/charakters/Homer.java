package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class Homer extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Homer";
    private int age = 36;
    private String job = "Safety Inspector";

    public Homer() {
        super("Homer", 36, "Safety Inspector");
    }

    public void eatDonut() {
        System.out.println(name + " is eating a donut.");
    }

    public void drinkDuff() {
        System.out.println(name + " is drinking Duff beer.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("D'oh!");
    }
}
