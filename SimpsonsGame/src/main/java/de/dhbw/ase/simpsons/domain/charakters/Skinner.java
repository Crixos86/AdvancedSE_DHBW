package de.dhbw.ase.simpsons.domain.charakters;

public class Skinner {
    private final String name = "Skinner";
    private final int age = 54;
    private final String job = "School Principal";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void workAsPrincipal() {
        System.out.println(name + " is working as the school principal.");
    }

    public void disciplineStudents() {
        System.out.println(name + " is disciplining students.");
    }
}
