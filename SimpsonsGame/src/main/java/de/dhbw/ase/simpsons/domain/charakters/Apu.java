package de.dhbw.ase.simpsons.domain.charakters;

public class Apu {
    private final String name = "Apu";
    private final int age = 36;
    private final String job = "Convenience Store Owner";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void workAtKwikEMart() {
        System.out.println(name + " is working at the Kwik-E-Mart.");
    }

    public void tellJokes() {
        System.out.println(name + " is telling jokes.");
    }
}

