package de.dhbw.ase.simpsons.domain.transport;

public enum PersonalTransport {

    HOMERCAR("his pink car and in Winter Mr. Plow"),
    BARTBOARD("a skateboard, ride or die man!"),
    LISABIKE("her bike, environmentally friendly and reliable"),
    APUCAR("a Minivan with enough space for the whole family"),
    GUYCAR("a Truck, because he needs the space"),
    MAGGIECAR("the arms of Marge, because an infant cant drive, silly!"),
    MARGECAR("the famous Canyonero, because why not?"),
    NEDCAR("a station wagon."),
    NELSONCAR("a bike to chase all the losers from school"),
    SKINNERCAR("his station wagon, only three rates left!");


    private String displayName;

    PersonalTransport(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
