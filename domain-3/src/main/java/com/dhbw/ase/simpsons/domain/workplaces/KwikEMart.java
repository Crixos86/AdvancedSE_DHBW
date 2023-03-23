package com.dhbw.ase.simpsons.domain.workplaces;


public class KwikEMart extends Workplaces implements WorkplaceFeatures {
    private final String name = "Kwik-E-Mart";
    private final String location = "Springfield";
    private int numberOfEmployees = 5;
    private final String owner = "Apu Nahasapeemapetilon";

    public KwikEMart() {
        super("Kwik-E-Mart", "711 Evergreen Terrace", 5, "Apu Nahasapeemapetilon");
    }


    @Override
    public void listInformation() {
        System.out.printf("%s located at %s is owned by %s and has %d employees.%n", name, location, owner, numberOfEmployees);
    }

    @Override
    public void takeATour() {
        System.out.println("Take a tour of the Kwik-E-Mart and meet Apu Nahasapeemapetilon and his employees.");
    }
}

