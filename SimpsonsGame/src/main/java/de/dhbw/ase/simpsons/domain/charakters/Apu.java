package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class Apu extends Character implements CharacterAction {
    private final String name = "Apu";
    private int age = 36;
    private final String job = "Convenience Store Owner";

    public Apu() {
        super("Apu", 36, "Convenience Store Owner");
    }

    public void workAtKwikEMart() {
        System.out.println(name + " is working at the Kwik-E-Mart.");
    }

    public void tellJokes() {
        System.out.println(name + " is telling jokes.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("Never have I seen you look so unhappy while purchasing such a large quantity of ice cream!");
    }


}

