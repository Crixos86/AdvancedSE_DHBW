package de.dhbw.ase.simpsons.domain.charakters;

public class ComicBookGuy extends Character implements CharacterAction{
    private String name = "Comic Book Guy";
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
}
