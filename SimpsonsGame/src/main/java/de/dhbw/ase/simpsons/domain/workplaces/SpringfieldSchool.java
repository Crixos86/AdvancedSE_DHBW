package de.dhbw.ase.simpsons.domain.workplaces;

import de.dhbw.ase.simpsons.application.WorkplaceFeatures;

public class SpringfieldSchool extends Workplaces implements WorkplaceFeatures {
    private final String name = "Springfield Elementary School";
    private final String location = "1313 Mockingbird Lane";
    private final int numberOfStudents = 500;
    private final int numberOfTeachers = 30;

    public SpringfieldSchool() {
        super("Springfield Elementary School", "1313 Mockingbird Lane", 500, "Principal Seymour Skinner");
    }


    @Override
    public void listInformation() {
        System.out.printf("%s located at %s has %d students and %d teachers.%n", name, location, numberOfStudents, numberOfTeachers);
    }

    @Override
    public void takeATour() {
        System.out.println("Take a tour of the Springfield Elementary School and meet Principal Seymour Skinner and his teachers.");
    }
}

