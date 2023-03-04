package de.dhbw.ase.simpsons.domain.charakters;

public class Skinner extends Character implements CharacterAction{
    private final String name = "Skinner";
    private final int age = 54;
    private final String job = "School Principal";

    public Skinner() {
        super("Skinner", 54, "School Principal");
    }
    public void workAsPrincipal() {
        System.out.println(name + " is working as the school principal.");
    }

    public void disciplineStudents() {
        System.out.println(name + " is disciplining students.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }
}
