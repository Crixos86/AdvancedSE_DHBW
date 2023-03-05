package de.dhbw.ase.simpsons.domain.workplaces;

public class Workplaces {
    private String name;
    private String location;
    private int numberOfEmployees;
    private String owner;

    public Workplaces(String name, String location, int numberOfEmployees, String owner) {
        this.name = name;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


}
