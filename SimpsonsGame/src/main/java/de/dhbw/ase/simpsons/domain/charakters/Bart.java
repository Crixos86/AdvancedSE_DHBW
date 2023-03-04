package de.dhbw.ase.simpsons.domain.charakters;

public class Bart extends Character implements CharacterAction{
    private String name = "Bart";
    private int age = 10;
    private String job = "Student";

    public Bart() {
        super("Bart", 10, "Student");
    }

    public void playPranks() {
        System.out.println(name + " is playing pranks.");
    }

    public void skateboard() {
        System.out.println(name + " is skateboarding.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }
}
