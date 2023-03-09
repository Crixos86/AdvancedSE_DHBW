package de.dhbw.ase.simpsons.application;


import de.dhbw.ase.simpsons.adapters.Question;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionManager implements Question {

    private Scanner scanner;


    private Map<String, Character> questionToChar = new HashMap<>();
    public static Map<Character, String> charToName = new HashMap<>();

    public QuestionManager() {
        scanner = new Scanner(System.in);
        questionToChar.put("Donuts are your favourite food?", 'H');
        questionToChar.put("Is beer your life?", 'H');
        questionToChar.put("Do you like art?", 'M');
        questionToChar.put("Is the ocean very inspiring for you?", 'M');
        questionToChar.put("Do you like going to school?", 'L');
        questionToChar.put("Is it your dream to attend a Ivy League University?", 'L');
        questionToChar.put("Do you often suffer from brain freeze due to too much Squishy?", 'B');
        questionToChar.put("Do you like to ride your Skateboard?", 'B');
        questionToChar.put("You love to work 24 hours in your own supermarket?", 'A');
        questionToChar.put("Sorting groceries is a dream of yours?", 'A');
        questionToChar.put("Helping your lovely neighbours is part of your daily routine?", 'N');
        questionToChar.put("Attending church is very important to you?", 'N');
        questionToChar.put("Comics are your life?", 'C');
        questionToChar.put("Eating Fast Food is the best?", 'C');
        questionToChar.put("Do you solve your conflicts with violence?", 'X');
        questionToChar.put("Do you like to laugh at people?", 'X');
        questionToChar.put("Do you like to sleep?", 'Y');
        questionToChar.put("Playing with toys is awesome?", 'Y');
        questionToChar.put("Do you like to teach annoying pupils a lesson?", 'S');
        questionToChar.put("Do you still live with your parents?", 'S');

        charToName.put('H', "Homer Simpson");
        charToName.put('M', "Marge Simpson");
        charToName.put('L', "Lisa Simpson");
        charToName.put('B', "Bart Simpson");
        charToName.put('A', "Apu Nahasapeemapetilon");
        charToName.put('N', "Ned Flanders");
        charToName.put('C', "Comic Book Guy");
        charToName.put('X', "Nelson");
        charToName.put('Y', "Maggie");
        charToName.put('S', "Seymour Skinner");


    }

    @Override
    public Character askQuestions() {
        List<Character> answers = new ArrayList<>();

        for (String question : questionToChar.keySet()) {
            System.out.println(question);

            String answer;
            while (true) {
                answer = scanner.nextLine().toLowerCase();
                if (answer.equals("y") || answer.equals("n")) {
                    break;
                }
                System.out.println("Please answer the question with [y] yes OR [n] no.");
            }

            if (answer.equals("y")) {
                answers.add(questionToChar.get(question));
            }
        }

        if (answers.isEmpty()) {
            System.out.println("You didn't answer any question.");
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
