package de.dhbw.ase.simpsons.adapters;

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

}
