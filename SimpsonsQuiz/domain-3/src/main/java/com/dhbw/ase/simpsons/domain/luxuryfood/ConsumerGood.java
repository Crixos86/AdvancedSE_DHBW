package com.dhbw.ase.simpsons.domain.luxuryfood;

public enum ConsumerGood {
    DONUT("Donuts"),
    SQUISHY("Squishy"),
    BURGER("an almost fresh delicious Krusty burger"),
    PIZZA("Pizza"),
    TOFU("Tofu"),
    WORK("Nothing, because there is work to do"),
    TEARS("Tears of weak schoolmates"),
    BOTTLE("a delicious bottle"),
    SALAD("a healthy salad"),
    BREAD("bread like our saviour");


    private String displayName;

    ConsumerGood(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
