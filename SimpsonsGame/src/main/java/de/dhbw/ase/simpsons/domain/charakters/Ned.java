package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class Ned extends Character implements CharacterAction {
    private  final String name = "Ned";
    private  int age = 42;
    private  String job = "Homer's Neighbor and Prayer";

    public Ned() {
        super("Ned", 42, "Homer's Neighbor and Prayer");
    }

    public void praying() {
        System.out.println(name + " is praying.");
    }

    public void beFriendly() {
        System.out.println(name + " is being friendly.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("Hi diddly ho neighborino.");
    }
}