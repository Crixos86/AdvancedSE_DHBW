package de.dhbw.ase.simpsons.domain.charakters;

public class Apu extends Character implements CharacterAction{
    private String name = "Apu";
    private int age = 36;
    private String job = "Convenience Store Owner";

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
}

