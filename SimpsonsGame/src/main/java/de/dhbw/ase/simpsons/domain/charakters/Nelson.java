package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.application.CharacterAction;
import de.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import de.dhbw.ase.simpsons.domain.homes.NelsonsTrailer;
import de.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import de.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Nelson extends SimpsonsCharacter implements CharacterAction {

    public Nelson() {
        super("Nelson", 11, "School Bully");
    }
    public void bullyStudents() {
        System.out.println(name + " is bullying students.");
    }

    public void laugh() {
        System.out.println(name + " is laughing.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        bullyStudents();
        laugh();
        giveQuote();
        nelsonFood();
    }

    @Override
    public void printPicture() {
        String[] Picture = {
"\n",
"                                                  :-++**####*+=:                          ",
"                                               :+#*+++++++++++***=                        ",
"                                ..:::-:::.   .**+++++++++++++++++**=                      ",
"                       .:-=+**#**************%*++++++++++++++++++++**.                    ",
"                   :=+***+++++++++++++++++++++++++++++++++++++++++++*#.                   ",
"                -+**++++++++++++++++++++++++++++++*####*+++++++++++++*#                   ",
"             .+#*++++++++++++++++++++++++++++++*#*+++*##*+++++++++*%#**=                  ",
"            =#*++++++++++++++++++++++++++++++*#+-::::::-+*#*++++++*%:=**                  ",
"           **+++++++++++++++++++++++++++++++*#-:::::::::::-*#*+++++%-                     ",
"          **+++++++++++++++++++++++++++++++**-::::::::::::::-#*+++*%=.                    ",
"        +#+++++++++++++++++++++++++++++++*#-:::::::::::::=+=-+#*+#=-=++:                  ",
"        :%*+++++++++++++++++++++++++++++++#=::::::::::::::::-+==#*=:::::*-                ",
"        **+++++++++++++++++++++++++++++++*#:::::-::::::::::::-*:::::::::+=                ",
"        #++++++++++++++++++++++++++++++++%=::=+==%%%++++++++##+++###++=*=                 ",
"       :#++++++++++++++++++++++++##+++++*%-:++   -*+         +-  *#=    *                 ",
"       =#+++++++++++++++++++++++#**#++++#+::+=               .#         *                 ",
"       +*++++++++++++++++++++++#*:-%*++*#-:::++-.          .:#*------:-+:                 ",
"       +*++++++++++++*****%*++*#-:-%*+*#-::::::-=+++==+**++===--------=+++=               ",
"       +*+++++++++*#*+===+*#*+*+::-%*#*-::::::::::::::*+::::::::::::::::::-*.             ",
"       :#++++++++**-:=+*=-:-+*%=::-*+-::::::::::::::::=*=-::::::::::::::--=+.             ",
"       .#++++++++#=:::*=-+::::-:::::::::::::::::::::::::=++++=::::::::=+*#+:              ",
"       .#++++++++**-::-:::::::::::::::::::::::::::::::::::::::::::::::::::-=++=.          ",
"       =#+++++++++*%*++++=:::::::::::::::::-=:::::::::::::::::::::::::::::::::-+*-        ",
"       **++++*++++*#----::::::::::::::::::-*=-------:::::::::::::::::::::::::::::++       ",
"      -#+++*#%++*#+-:::::::::::::::::::::-*+====#+---====+++=--:::::::::::::::::::-*      ",
"     -#++*#%##+##-:::::::::::::::::::::::--:::::-*=.   .-:  .-=++**++=--::::::::::-#.     ",
"   .+#*##*=:####+-::::::::::::::::::::::::::::::::=++++=*-      := .:-==#*==++++==-       ",
"   ::-#+:..:=-..-+=::::::::::::::::::::::::::::::::::::::=++=*--:-=-:---:                 ",
"::..:*-...........++-:::::::::::::::::::::::::::::::::::::::+=                            ",
"===+**++-:.........+%+=-:::::::::::::::::::::::::::::::::::+=                             ",
"--------=**-........+=-+++=-:::::::::::::::::::::::::::::-+-                              ",
"-----------+*-......:#----=+*++=--::::::::::::::::::::::+*:                               ",
"-------------+=......-#--------=+++++++====--------==+**:                                 ",
"--------------*-......++----------------==+++++**++=*-:*=-:.                              "
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
        System.out.println("I live in my humble home at: \n");
        NelsonsTrailer nelsonsTrailer = new NelsonsTrailer();
        nelsonsTrailer.listFeatures();
        nelsonsTrailer.takeTour();
        System.out.println("I have to go to: \n");
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Ha ha!\"");
    }

    public void nelsonFood() {
        ConsumerGood nelsonFood = ConsumerGood.TEARS;
        favoriteFood(nelsonFood);

    }
}

