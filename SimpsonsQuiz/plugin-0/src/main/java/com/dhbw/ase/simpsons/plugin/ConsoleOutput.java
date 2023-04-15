package com.dhbw.ase.simpsons.plugin;

import com.dhbw.ase.simpsons.adapters.Output;

public class ConsoleOutput {

    private Output output;

    public ConsoleOutput(Output output) {
        this.output = output;
    }

    public void startGame() {
        output.printBanner();
        output.printOutput();
    }
}
