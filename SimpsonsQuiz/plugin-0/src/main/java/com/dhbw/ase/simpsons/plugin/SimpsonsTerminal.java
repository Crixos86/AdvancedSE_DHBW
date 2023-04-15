package com.dhbw.ase.simpsons.plugin;


import com.dhbw.ase.simpsons.adapters.GameTerminal;
import com.dhbw.ase.simpsons.adapters.Output;

public class SimpsonsTerminal {
    public static void main(String[] args) {
        Output output = new GameTerminal();
        ConsoleOutput consoleOutput = new ConsoleOutput(output);
        consoleOutput.startGame();

    }
}
