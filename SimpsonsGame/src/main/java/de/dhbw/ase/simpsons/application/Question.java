package de.dhbw.ase.simpsons.application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Question {

    String askQuestion();
    List<String> getExcludedWorkplaces(String answer);
    List<String> getAnswers();


}

