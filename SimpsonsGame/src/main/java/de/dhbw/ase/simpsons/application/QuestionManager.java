package de.dhbw.ase.simpsons.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionManager {

    private List<String> excludedWorkplaces;
    private List<Question> questions;

    public QuestionManager(List<Question> questions) {
        this.questions = questions;
        this.excludedWorkplaces = new ArrayList<>();
    }

    public void start() {
        for (Question question : questions) {
            String answer = question.askQuestion();
            excludedWorkplaces.addAll(question.getExcludedWorkplaces(answer));
        }
    }

}
