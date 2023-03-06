package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;

public class ComicBookGuy extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Comic Book Guy";
    private int age = 45;
    private String job = "Comic Book Store Owner";

    public ComicBookGuy() {
        super("Comic Book Guy", 45, "Comic Book Store Owner"  );
    }

    public void workAtComicBookStore() {
        System.out.println(name + " is working at the comic book store.");
    }

    public void makeSnarkyComments() {
        System.out.println(name + " is making snarky comments.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public void giveQuote() {
        System.out.println("I'm not a nerd, I'm a collector of rare and valuable things.");
    }
}
