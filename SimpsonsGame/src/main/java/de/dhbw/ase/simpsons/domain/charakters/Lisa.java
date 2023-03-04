package de.dhbw.ase.simpsons.domain.charakters;

public class Lisa extends Character implements CharacterAction{
    private String name = "Lisa";
    private int age = 8;
    private String job = "Student";

    public Lisa() {
        super("Lisa", 8, "Student");
    }

    public void playSaxophone() {
        System.out.println(name + " is playing the saxophone.");
    }

    public void solveProblems() {
        System.out.println(name + " is solving problems.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }
}
