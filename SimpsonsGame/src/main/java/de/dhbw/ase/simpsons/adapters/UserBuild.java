package de.dhbw.ase.simpsons.adapters;
import de.dhbw.ase.simpsons.application.QuestionManager;
import de.dhbw.ase.simpsons.domain.charakters.Bart;
import de.dhbw.ase.simpsons.domain.charakters.Homer;
import de.dhbw.ase.simpsons.domain.charakters.Lisa;
import de.dhbw.ase.simpsons.domain.charakters.Marge;


import java.util.Map;


public class UserBuild  {

    private static final Map<Character, Runnable> actions = Map.of(
            'H', () -> new Homer().giveQuote(),
            'M', () -> new Marge().giveQuote(),
            'L', () -> new Lisa().giveQuote()
    );

    public static void performActionBasedOnAnswers() {
        Character mostCommonChar = new QuestionManager().askQuestions();

        if (mostCommonChar == null) {
            // keine Antwort
            return;
        }

        Runnable action = actions.get(mostCommonChar);
        if (action != null) {
            action.run();
        } else {
            // ungültiger Charakter-Code
        }
    }

}

