package de.dhbw.ase.simpsons.application;


import de.dhbw.ase.simpsons.adapters.Question;

import java.util.*;

public class QuestionManager implements Question {

    private Scanner scanner;


    private Map<String, Character> questionToChar = new HashMap<>();
    private Map<Character, String> charToName = new HashMap<>();

    public QuestionManager() {
        scanner = new Scanner(System.in);
        questionToChar.put("Magst du Donuts?", 'H');
        questionToChar.put("Magst du Kunst?", 'M');
        questionToChar.put("Gehst du gerne zur Schule?", 'L');
        questionToChar.put("Schreibst du gute Noten?", 'L');
        questionToChar.put("Magst du das Meer?", 'M');

        charToName.put('H', "Homer Simpson");
        charToName.put('M', "Marge Simpson");
        charToName.put('L', "Lisa Simpson");

    }

    @Override
    public Character askQuestions() {
        List<Character> answers = new ArrayList<>();

        for (String question : questionToChar.keySet()) {
            System.out.println(question);

            String answer;
            while (true) {
                answer = scanner.nextLine().toLowerCase();
                if (answer.equals("ja") || answer.equals("nein")) {
                    break;
                }
                System.out.println("Bitte antworte mit Ja oder Nein.");
            }

            if (answer.equals("ja")) {
                answers.add(questionToChar.get(question));
            }
        }

        if (answers.isEmpty()) {
            System.out.println("Du hast keine Fragen beantwortet.");
            return null;
        } else {
            return getMostCommonCharacter(answers);
        }

    }

    private Character getMostCommonCharacter(List<Character> characters) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (Character nametag : characters) {
            charCounts.put(nametag, charCounts.getOrDefault(nametag, 0) + 1);
        }
        char mostCommonChar = ' ';
        int mostCommonCharCount = 0;
        for (Character nametag : charCounts.keySet()) {
            int count = charCounts.get(nametag);
            if (count > mostCommonCharCount) {
                mostCommonChar = nametag;
                mostCommonCharCount = count;
            }
        }
        return mostCommonChar;

    }


}
