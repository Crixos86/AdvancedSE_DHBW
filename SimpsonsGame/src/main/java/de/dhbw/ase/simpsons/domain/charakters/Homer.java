package de.dhbw.ase.simpsons.domain.charakters;

public class Homer extends Character implements CharacterAction{
    private String name = "Homer";
    private int age = 36;
    private String job = "Safety Inspector";

    public Homer() {
        super("Homer", 36, "Safety Inspector");
    }

    public void eatDonut() {
        System.out.println(name + " is eating a donut.");
    }

    public void drinkDuff() {
        System.out.println(name + " is drinking Duff beer.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
    }
}
