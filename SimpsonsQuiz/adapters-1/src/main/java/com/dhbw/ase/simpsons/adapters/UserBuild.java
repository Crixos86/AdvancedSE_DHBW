package com.dhbw.ase.simpsons.adapters;

import com.dhbw.ase.simpsons.application.QuestionManager;
import com.dhbw.ase.simpsons.domain.charakters.*;

import java.util.Map;


public class UserBuild  extends QuestionManager{

    protected static final Map<Character, Runnable> actions = Map.of(
            'H', () -> new Homer().introduce(),
            'M', () -> new Marge().introduce(),
            'L', () -> new Lisa().introduce(),
            'B', () -> new Bart().introduce(),
            'A', () -> new Apu().introduce(),
            'N', () -> new Ned().introduce(),
            'C', () -> new ComicBookGuy().introduce(),
            'X', () -> new Nelson().introduce(),
            'Y', () -> new Maggie().introduce(),
            'S', () -> new Skinner().introduce()
    );

    public static void performActionBasedOnAnswers() {
        Character mostCommonChar = new QuestionManager().askQuestions();
        String ChosenCharacter = charToName.get(mostCommonChar);
        System.out.printf("The Simpsons character you are most like is %s %n", ChosenCharacter );
        if (mostCommonChar == null) {
            // no Answer
            return;
        }

        Runnable action = actions.get(mostCommonChar);
        if (action != null) {
            action.run();
        } else {
            // invalid nametag
        }

    }

}

