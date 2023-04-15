package com.dhbw.ase.simpsons.domain.transport;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PersonalTransportTest {

    @Test
    public void testDisplayName() {
        Assertions.assertEquals("his pink car and in Winter Mr. Plow", PersonalTransport.HOMERCAR.toString());
        Assertions.assertEquals("a skateboard, ride or die man!", PersonalTransport.BARTBOARD.toString());
        Assertions.assertEquals("her bike, environmentally friendly and reliable", PersonalTransport.LISABIKE.toString());
        Assertions.assertEquals("a Minivan with enough space for the whole family", PersonalTransport.APUCAR.toString());
        Assertions.assertEquals("a Truck, because he needs the space", PersonalTransport.GUYCAR.toString());
        Assertions.assertEquals("the arms of Marge, because an infant cant drive, silly!", PersonalTransport.MAGGIECAR.toString());
        Assertions.assertEquals("the famous Canyonero, because why not?", PersonalTransport.MARGECAR.toString());
        Assertions.assertEquals("a station wagon.", PersonalTransport.NEDCAR.toString());
        Assertions.assertEquals("a bike to chase all the losers from school", PersonalTransport.NELSONCAR.toString());
        Assertions.assertEquals("his station wagon, only three rates left!", PersonalTransport.SKINNERCAR.toString());
    }
}
