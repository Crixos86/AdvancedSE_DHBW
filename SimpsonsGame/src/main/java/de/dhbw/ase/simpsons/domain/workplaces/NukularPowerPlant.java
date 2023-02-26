package de.dhbw.ase.simpsons.domain.workplaces;

import de.dhbw.ase.simpsons.application.Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class NukularPowerPlant   {
    private final String name = "Springfield Nuclear Power Plant";
    private final String location = "1235 Springfield Heights";
    private final int numberOfEmployees = 200;
    private final String owner = "Mr. Burns";

    private Question excludedWorkplace;
    public NukularPowerPlant() {
        this.excludedWorkplace = new Question() {
            @Override
            public String askQuestion() {
                return "Möchten Sie an einem strahlend schönen Arbeitsplatz arbeiten, " +
                        "an dem Sicherheit nicht allzu ernst genommen wird?";
            }

            @Override
            public List<String> getExcludedWorkplaces(String answer) {
                if (answer.equals("yes")) {
                    return Collections.emptyList();
                } else {
                    return Arrays.asList("NukularPowerPlant");
                }
            }

            @Override
            public List<String> getAnswers() {
                return Arrays.asList("yes", "no");
            }
        };
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getOwner() {
        return owner;
    }

    public void listInformation() {
        System.out.println(name + " located at " + location + " is owned by " + owner + " and has " + numberOfEmployees + " employees.");
    }

    public void takeATour() {
        System.out.println("Take a tour of Springfield's Nuclear Power Plant and see where Homer Simpson works.");
    }
}

