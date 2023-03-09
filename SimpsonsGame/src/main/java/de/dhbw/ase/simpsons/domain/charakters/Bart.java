package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

import javax.swing.*;

public class Bart extends SimpsonsCharacter implements CharacterAction {
    private final String name = "Bart";
    private int age = 10;
    private String job = "Student";

    public Bart() {
        super("Bart", 10, "Student");
    }

    public void playPranks() {
        System.out.println(name + " is playing pranks.");
    }

    public void skateboard() {
        System.out.println(name + " is skateboarding.");
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
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();
        System.out.println("I have to go to: \n");
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();
    }

    @Override
    public void giveQuote() {
        System.out.println("I didn't do it, nobody saw me do it, there's no way you can prove anything!");
    }

    String[] BartPicture = {
            "              .#+: .*#  .=.",
            "              =*-#**-#=+*=% .++",
            "              %---=--=*=--%**-++=*#:  .",
            "             =*-----------=----#=-=#=**#",
            "             %---------------------+=--#+**#.",
            "            =*-------------------------+=--*+++*",
            "            %------------------------------=+--#.",
            "           ++----------------------------------#+**%",
            "          .%-------------------------------------+*.",
            "          #+------------------------------------+*",
            "         =#------------------------------------+*",
            "        **------------------------------------=#",
            "       #====---------------------------------=#",
            "     =++=---+**=-----------------------------%.",
            "   -*:        .+*+*+=====+*+----------------#:",
            "  :*           :#-         :*+-------------#-",
            "  +-    #     -*.            +*-----------++",
            "  -%%:        %.              %=---------=#",
            "   *%+===-:. .@*+    #        #+---------%.",
            "  =*-----=+**+@@#.           .%---------#-",
            "  *+-----------#-           :#=--------+*",
            "   %*=----------+*=.     .-**----------%",
            "  =*-+***---------=+*+++++=-----------#:",
            " :%-------------------------------***##",
            " #=--------------------------------=+++*",
            "++--------------------------------*+*#-%",
            "+*------------------------------=*=-==*+",
            " .=**=---------------------------=*%+-.",
            "    .-=+*+=--------------*+-------=#",
            "         .:=+#***********+**------*=",
            "            -*+=-----------------#:",
            "               *=----------------#:",
            "               *#----------------%*:"
};

    public void printBart() {
        for (String line : BartPicture) {
            System.out.println(line);
        }
    }

}
