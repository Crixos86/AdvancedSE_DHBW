package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.charakters.pictures.ApuPicture;
import de.dhbw.ase.simpsons.domain.charakters.pictures.NelsonPicture;
import de.dhbw.ase.simpsons.domain.charakters.pictures.SkinnerPicture;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.homes.SkinnersHome;
import de.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import de.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Skinner extends SimpsonsCharacter implements CharacterAction {
    public Skinner() {
        super("Skinner", 54, "School Principal");
    }
    public void workAsPrincipal() {
        System.out.println(name + " is working as the school principal.");
    }

    public void disciplineStudents() {
        System.out.println(name + " is disciplining students.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        disciplineStudents();
        giveQuote();
        skinnerFood();
        skinnerTransport();
    }

    @Override
    public void printPicture() {
        printPicture(SkinnerPicture.Picture);
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beatiful home at: \n");
        SkinnersHome skinnersHome = new SkinnersHome();
        skinnersHome.listFeatures();
        skinnersHome.takeTour();
        workAsPrincipal();
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Science has it all.\"");
    }

    public void skinnerFood() {
        ConsumerGood skinnerFood = ConsumerGood.BURGER;
        favoriteFood(skinnerFood);

    }

    public void skinnerTransport() {
        PersonalTransport skinnerTransport = PersonalTransport.SKINNERCAR;
        personalTransport(skinnerTransport);
    }
}
