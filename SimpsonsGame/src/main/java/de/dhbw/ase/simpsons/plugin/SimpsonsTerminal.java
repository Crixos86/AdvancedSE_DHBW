package de.dhbw.ase.simpsons.plugin;

import de.dhbw.ase.simpsons.adapters.GameTerminal;
import de.dhbw.ase.simpsons.adapters.UserBuild;


public class SimpsonsTerminal {
    public static void main(String[] args) {
        GameTerminal.printBanner();
        //UserBuild.performActionBasedOnAnswers();
        GameTerminal.printOutput();

    }
}
