package de.dhbw.ase.simpsons.domain.charakters;

public class ComicBookGuy {
    private final String name = "Comic Book Guy";
    private final int age = 45;
    private final String job = "Comic Book Store Owner";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void workAtComicBookStore() {
        System.out.println(name + " is working at the comic book store.");
    }

    public void makeSnarkyComments() {
        System.out.println(name + " is making snarky comments.");
    }
}
