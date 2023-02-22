package de.dhbw.ase.simpsons.domain.charakters;

public class Ned {
    private final String name = "Ned";
    private final int age = 42;
    private final String job = "Homer's Neighbor and Prayer";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void praying() {
        System.out.println(name + " is praying.");
    }

    public void beFriendly() {
        System.out.println(name + " is being friendly.");
    }
}