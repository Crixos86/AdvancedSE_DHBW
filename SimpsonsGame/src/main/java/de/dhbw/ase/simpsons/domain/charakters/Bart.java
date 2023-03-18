package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

import javax.swing.*;

public class Bart extends SimpsonsCharacter implements CharacterAction {

    public Bart() {
        super("Bart", 10, "Student");
    }

    public void playPranks() {
        System.out.println(name + " favourite hobby is playing pranks.");
    }


    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        playPranks();
        printPicture();
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
        System.out.println("Famous Quote: \"I didn't do it, nobody saw me do it, there's no way you can prove anything!\"");
    }

    @Override
    public void printPicture() {
        String[] Picture = {
                "\n",
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
        for (String line : Picture) {
            System.out.println(line);
            try {
                Thread.sleep(500); // pause for 1 second while printing the picture
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
