package de.dhbw.ase.simpsons.adapters;

public class GameTerminal {
    String[] Banner = {
            " # #####  ##  ##  #######            #####    ######  ##   ##  ######    #####    #####   ##   ##   #####",
            "## ## ##  ##  ##   ##   #           ##   ##     ##    ### ###   ##  ##  ##   ##  ### ###  ###  ##  ##   ##",
            "   ##     ##  ##   ##               ##          ##    #######   ##  ##  ##       ##   ##  #### ##  ##",
            "   ##     ######   ####              #####      ##    ## # ##   #####    #####   ##   ##  #######   #####",
            "   ##     ##  ##   ##                    ##     ##    ##   ##   ##           ##  ##   ##  ## ####       ##",
            "   ##     ##  ##   ##   #           ##   ##     ##    ##   ##   ##      ##   ##  ### ###  ##  ###  ##   ##",
            "  ####    ##  ##  #######            #####    ######  ### ###  ####      #####    #####   ##   ##   #####"
    };
    public void printBanner() {
        for (String line : Banner) {
            System.out.println(line);
        }
    }

    public void greeting() {
        System.out.println("\nWelcome to the Simpsons Game!\nLet me ask you some questions to verify which Simpsons Character you are alike.\n");
    }

}
