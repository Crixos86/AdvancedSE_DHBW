package com.dhbw.ase.simpsons.adapters;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class GameTerminal {

    public static void printBanner() {
        String[] Banner = {
                " # #####  ##  ##  #######            #####    ######  ##   ##  ######    #####    #####   ##   ##   #####",
                "## ## ##  ##  ##   ##   #           ##   ##     ##    ### ###   ##  ##  ##   ##  ### ###  ###  ##  ##   ##",
                "   ##     ##  ##   ##               ##          ##    #######   ##  ##  ##       ##   ##  #### ##  ##",
                "   ##     ######   ####              #####      ##    ## # ##   #####    #####   ##   ##  #######   #####",
                "   ##     ##  ##   ##                    ##     ##    ##   ##   ##           ##  ##   ##  ## ####       ##",
                "   ##     ##  ##   ##   #           ##   ##     ##    ##   ##   ##      ##   ##  ### ###  ##  ###  ##   ##",
                "  ####    ##  ##  #######            #####    ######  ### ###  ####      #####    #####   ##   ##   #####"
        };
        for (String line : Banner) {
            System.out.println(line);
        }
        greeting();
    }

    public static void greeting() {
        System.out.println("\nWelcome to the Simpsons Game!\nLet me ask you some questions to verify which Simpsons Character you are alike.\n");
    }

    public static void printOutput() {
        String filename = "YourCharacter.txt";
        try {
            // Save the original standard output
            PrintStream standardOut = System.out;

            // Redirecting the output to the terminal and to a file
            PrintStream fileOut = new PrintStream(new FileOutputStream(filename));
            MultiOutputStream multiOut = new MultiOutputStream(standardOut, fileOut);
            PrintStream out = new PrintStream(multiOut);

            // Setting of PrintStreams as System.out
            System.setOut(out);

            // Call User Build method and close file
            UserBuild.performActionBasedOnAnswers();

            fileOut.close();

        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben der Datei: " + e);
        }
    }

}
