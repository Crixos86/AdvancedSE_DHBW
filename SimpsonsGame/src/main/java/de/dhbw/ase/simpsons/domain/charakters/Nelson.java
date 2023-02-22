package de.dhbw.ase.simpsons.domain.charakters;

public class Nelson {
    private final String name = "Nelson";
    private final int age = 11;
    private final String job = "School Bully";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void bullyStudents() {
        System.out.println(name + " is bullying students.");
    }

    public void laugh() {
        System.out.println(name + " is laughing.");
    }
}

