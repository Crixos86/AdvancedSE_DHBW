package de.dhbw.ase.simpsons.domain.charakters;

import de.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import de.dhbw.ase.simpsons.domain.transport.PersonalTransport;

public class SimpsonsCharacter {

    protected String name;

    protected int age;

    protected String job;

    protected String Quote;

    public SimpsonsCharacter() {

    }
    public SimpsonsCharacter(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        Quote = quote;
    }

    public void favoriteFood(ConsumerGood food) {
        System.out.println(name + "s' favourite food is: " + food );
    }

    public void personalTransport(PersonalTransport transport) {
        System.out.println(name + "s' preferred method of transportation is: " + transport );
    }

}
