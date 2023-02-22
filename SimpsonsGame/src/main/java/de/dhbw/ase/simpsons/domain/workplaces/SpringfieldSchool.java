package de.dhbw.ase.simpsons.domain.workplaces;

public class SpringfieldSchool {
    private final String name = "Springfield Elementary School";
    private final String location = "1313 Mockingbird Lane";
    private final int numberOfStudents = 500;
    private final int numberOfTeachers = 30;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void listInformation() {
        System.out.println(name + " located at " + location + " has " + numberOfStudents + " students and " + numberOfTeachers + " teachers.");
    }

    public void takeATour() {
        System.out.println("Take a tour of Springfield Elementary School and see where Bart, Lisa and Maggie Simpson go to school.");
    }
}

