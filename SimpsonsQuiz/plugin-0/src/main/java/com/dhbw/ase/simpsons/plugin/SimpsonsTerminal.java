package com.dhbw.ase.simpsons.plugin;

import com.dhbw.ase.simpsons.adapters.GameTerminal;
import com.dhbw.ase.simpsons.adapters.UserBuild;


public class SimpsonsTerminal {
    public static void main(String[] args) {
        GameTerminal.printBanner();
        //UserBuild.performActionBasedOnAnswers();
        GameTerminal.printOutput();

    }
}
