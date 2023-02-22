package de.dhbw.ase.simpsons.domain.charakters;

public class Lisa {
    private final String name = "Lisa";
    private final int age = 8;
    private final String job = "Student";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void playSaxophone() {
        System.out.println(name + " is playing the saxophone.");
    }

    public void solveProblems() {
        System.out.println(name + " is solving problems.");
    }
}
