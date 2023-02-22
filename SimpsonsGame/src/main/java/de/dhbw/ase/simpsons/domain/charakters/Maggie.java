package de.dhbw.ase.simpsons.domain.charakters;

public class Maggie {
    private final String name = "Maggie";
    private final int age = 1;
    private final String job = "Infant";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void suckThumb() {
        System.out.println(name + " is sucking her thumb.");
    }

    public void playWithRattle() {
        System.out.println(name + " is playing with a rattle.");
    }
}

