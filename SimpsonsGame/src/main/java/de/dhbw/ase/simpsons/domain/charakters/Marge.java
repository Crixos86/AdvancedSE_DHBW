package de.dhbw.ase.simpsons.domain.charakters;

public class Marge extends Character implements CharacterAction{
    private String name = "Marge";
    private int age = 34;
    private String job = "Housewife";

    public Marge() {
        super("Marge", 34, "Housewife");
    }

    public void bakeCake() {
        System.out.println(name + " is baking a cake.");
    }

    public void careForChildren() {
        System.out.println(name + " is caring for the children.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }
}
