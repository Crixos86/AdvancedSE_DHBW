package de.dhbw.ase.simpsons.domain.charakters;

public class Homer {
    private final String name = "Homer";
    private final int age = 36;
    private final String job = "Safety Inspector";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void eatDonut() {
        System.out.println(name + " is eating a donut.");
    }

    public void drinkDuff() {
        System.out.println(name + " is drinking Duff beer.");
    }
}
