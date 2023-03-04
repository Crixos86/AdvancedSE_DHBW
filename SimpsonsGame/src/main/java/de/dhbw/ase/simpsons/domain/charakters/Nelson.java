package de.dhbw.ase.simpsons.domain.charakters;

public class Nelson extends Character implements CharacterAction{
    private final String name = "Nelson";
    private final int age = 11;
    private final String job = "School Bully";

    public Nelson() {
        super("Nelson", 11, "School Bully");
    }
    public void bullyStudents() {
        System.out.println(name + " is bullying students.");
    }

    public void laugh() {
        System.out.println(name + " is laughing.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }
}

