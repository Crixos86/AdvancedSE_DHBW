package de.dhbw.ase.simpsons.domain.charakters;

public class Marge {
    private final String name = "Marge";
    private final int age = 34;
    private final String job = "Housewife";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void bakeCake() {
        System.out.println(name + " is baking a cake.");
    }

    public void careForChildren() {
        System.out.println(name + " is caring for the children.");
    }
}
