package de.dhbw.ase.simpsons.plugin;

import de.dhbw.ase.simpsons.domain.charakters.ComicBookGuy;

public class SimpsonsTerminal {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ComicBookGuy comicBookGuy = new ComicBookGuy();
        System.out.println(comicBookGuy.getJob());
    }
}
