package de.dhbw.ase.simpsons.application;


import de.dhbw.ase.simpsons.adapters.Question;

import java.util.Scanner;

public class QuestionManager implements Question {

    private final Scanner scanner;

    public QuestionManager() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String ask(String question) {
        System.out.println(question + "");
        return scanner.nextLine();
    }
}
