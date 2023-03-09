package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.homes.FlandersHome;
import de.dhbw.ase.simpsons.domain.workplaces.Leftorium;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Ned extends SimpsonsCharacter implements CharacterAction {
    private  final String name = "Ned";
    private  int age = 42;
    private  String job = "Homer's Neighbor and Prayer";

    public Ned() {
        super("Ned", 42, "Homer's Neighbor and Prayer");
    }

    public void praying() {
        System.out.println(name + " is praying.");
    }

    public void beFriendly() {
        System.out.println(name + " is being friendly.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        presentHomeAndWorkplace();
        giveQuote();
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beatiful home at: \n");
        FlandersHome flandersHome = new FlandersHome();
        flandersHome.listFeatures();
        flandersHome.takeTour();
        System.out.println("I work at a diddely lovely store: \n");
        Leftorium leftorium = new Leftorium();
        leftorium.listInformation();
        leftorium.takeATour();
    }

    @Override
    public void giveQuote() {
        System.out.println("Hi diddly ho neighborino.");
    }
}