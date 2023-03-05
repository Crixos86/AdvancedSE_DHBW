package de.dhbw.ase.simpsons.plugin;

import de.dhbw.ase.simpsons.adapters.GameTerminal;
import de.dhbw.ase.simpsons.adapters.UserBuild;
import de.dhbw.ase.simpsons.domain.charakters.Apu;
import de.dhbw.ase.simpsons.domain.charakters.ComicBookGuy;

public class SimpsonsTerminal {
    public static void main(String[] args) {
        GameTerminal terminal = new GameTerminal();
        terminal.printBanner();
        terminal.greeting();

    }
}
