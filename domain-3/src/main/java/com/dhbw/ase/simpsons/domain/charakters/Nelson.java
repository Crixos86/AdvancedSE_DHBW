package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.NelsonPicture;
import com.dhbw.ase.simpsons.domain.homes.NelsonsTrailer;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import com.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Nelson extends SimpsonsCharacter implements CharacterAction {

    public Nelson() {
        super("Nelson", 11, "School Bully");
    }
    public void bullyStudents() {
        System.out.println(name + " is bullying students.");
    }

    public void laugh() {
        System.out.println(name + " is laughing.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        bullyStudents();
        laugh();
        giveQuote();
        nelsonFood();
        nelsonTransport();
    }

    @Override
    public void printPicture() {
        printPicture(NelsonPicture.Picture);
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in my humble home at: \n");
        NelsonsTrailer nelsonsTrailer = new NelsonsTrailer();
        nelsonsTrailer.listFeatures();
        nelsonsTrailer.takeTour();
        System.out.println("I have to go to: \n");
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Ha ha!\"");
    }

    public void nelsonFood() {
        ConsumerGood nelsonFood = ConsumerGood.TEARS;
        favoriteFood(nelsonFood);

    }

    public void nelsonTransport() {
        PersonalTransport nelsonTransport = PersonalTransport.NELSONCAR;
        personalTransport(nelsonTransport);
    }
}

