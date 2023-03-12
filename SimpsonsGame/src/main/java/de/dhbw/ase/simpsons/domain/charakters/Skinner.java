package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.homes.SkinnersHome;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Skinner extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Skinner";
    private int age = 54;
    private String job = "School Principal";

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
        giveQuote();
    }

    @Override
    public void printPicture() {
        String[] Picture = {
"\n",
"                                    .:--======-:.                               ",
"                                  .-=++++++++++++++*+-:                         ",
"                               .=*+++++++++++++++++++++*=:   :-==.              ",
"                             .=*+++++++++++++++++++++++++++=**+:                ",
"                            -+*+++++++++++++++++++++++++++++++++#*-             ",
"                       .-=*++++++++++++++++++++++++++++++++++++*==.             ",
"                    :=++++++++++++++++++++++++++++++++**+*#*+++*-               ",
"                     .:-==+++++*+***++++++++++++++**++==**++++++++:             ",
"                              +-----=+++********++=--=*+++++++++++++            ",
"                             ------------------------*++++++++++++++=           ",
"                             +-----------------------=**++++++++++++=           ",
"                            ----------------=+===------=#++++++++++*.           ",
"                          .==-------------=+------------*+++++++++*-            ",
"                          -==-::::-=-------=--:::-=-----*++++++++*:             ",
"                          .-  .    .+-----+.       ==--**+++*++*+               ",
"                          -   -    -=------   :.    +-*+++*+----=-              ",
"                           =:.    ==------=:      .=-=*++*+-=+=--=-             ",
"                           ======*=--------+=----==--=*++*-=*----=:             ",
"                            ==--+=---------=++===-----***+--=+--=:              ",
"                            ---=+--------------==------------+-+.               ",
"                            =--*--------==--------------------+.                ",
"                           .=--+---------*-------------------=:                 ",
"                          .=---===========--==----------=---=-                  ",
"                         .=------------------=+----------+:.                    ",
"                        -=--------------------==----------                      ",
"                       .+----------------------+--------+.                      ",
"                        +----------------------+=-------+                       ",
"                         :---===================+=------+                       ",
"                                =--===------------=+-----+                      ",
"                                :==----------------------=:                     ",
"                                 :=----------------------+.                     ",
"                                .-*----------------------*#+-                   ",
"                              :+*+%=-------------------+++*+++-.                ",
"                           :-+*++##+---------------=+++===*+++***+=-.           ",
"                      .-=+***+++**=++=--------==++++======#++++#+++++*+=-.      "
        };
        for (String line : Picture) {
            System.out.println(line);
            try {
                Thread.sleep(500); // Pause von einer Sekunde zwischen jeder Zeile
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beatiful home at: \n");
        SkinnersHome skinnersHome = new SkinnersHome();
        skinnersHome.listFeatures();
        skinnersHome.takeTour();
        System.out.println("I like to teach pupils at: \n");
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Science has it all.\"");
    }
}
