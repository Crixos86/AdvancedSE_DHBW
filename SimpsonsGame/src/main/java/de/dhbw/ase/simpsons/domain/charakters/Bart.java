package de.dhbw.ase.simpsons.domain.charakters;

public class Bart {
    private final String name = "Bart";
    private final int age = 10;
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

    public void playPranks() {
        System.out.println(name + " is playing pranks.");
    }

    public void skateboard() {
        System.out.println(name + " is skateboarding.");
    }
}
