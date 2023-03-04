package de.dhbw.ase.simpsons.domain.charakters;

public class Maggie extends Character implements CharacterAction{
    private String name = "Maggie";
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
    }
}

