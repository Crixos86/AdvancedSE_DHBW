package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.ApusHome;
import de.dhbw.ase.simpsons.domain.workplaces.KwikEMart;

public class Apu extends SimpsonsCharacter implements CharacterAction {

    public Apu() {
        super("Apu", 40, "Kwik-E-Mart Owner");
    }

    public void workAtKwikEMart() {
        System.out.println(name + " is working at the Kwik-E-Mart.");
    }



    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        giveQuote();


    }

    @Override
    public void printPicture() {String[] Picture = {
            "\n",
"            ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::::::::::=++*#####**+-::::::::::::::::::::::::::::::::::::::::",
"::::::::::::::::::::::::::::::::::-*##############*-::::::::::::::::::::::::::::::::::::::",
"::::::::::::::::::::::::::::::::-*##################::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::---*######*******######=:::::::::::::::::::::::::::::::::::::",
"::::::::::::::::::::::::::::*#######*+=========+###=::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::+#######*============*+-:::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::=########*===========+=::::::::::::::::::::::::::::::::::::::::",
"::::::::::::::::::::::::::::+########==:::-+==:--=::::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::-*++*###==.: .+=+:-:-::::::::::::::::::::::::::::::::::::::::",
"::::::::::::::::::::::::::::::=++*###+=+=+++==+++-::::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::::-=+###====++++++++==-::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::::::::+=++==++++==+++==-:::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::::::::++==-.-:-==---:::::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::::::::+===+=+=++=::::::::::::::::::::::::::::::::::::::::::::",
"::::::::::::::::::::::::::::::::::*+========#-::::::::::::::::::::::::::::::::::::::::::::",
":::::::::::::::::::::::::::::::::#@*========%@+:::::::::::::::::::::::::::::::::::::::::::"
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
        System.out.println("I live in a beautiful home at: \n");
        ApusHome apusHome = new ApusHome();
        apusHome.listFeatures();
        apusHome.takeTour();
        workAtKwikEMart();
        KwikEMart kwikEMart = new KwikEMart();
        kwikEMart.listInformation();
        kwikEMart.takeATour();
    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Never have I seen you look so unhappy while purchasing such a large quantity of ice cream!\"");
    }


}

