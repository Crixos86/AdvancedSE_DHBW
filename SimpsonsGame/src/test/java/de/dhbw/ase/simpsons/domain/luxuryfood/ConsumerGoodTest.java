package de.dhbw.ase.simpsons.domain.luxuryfood;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsumerGoodTest {

    @Test
    public void testToString() {
        assertEquals("Donuts", ConsumerGood.DONUT.toString());
        assertEquals("Squishy", ConsumerGood.SQUISHY.toString());
        assertEquals("a almost fresh delicious Krusty burger", ConsumerGood.BURGER.toString());
        assertEquals("Pizza", ConsumerGood.PIZZA.toString());
        assertEquals("Tofu", ConsumerGood.TOFU.toString());
        assertEquals("Nothing, because there is work to do", ConsumerGood.WORK.toString());
        assertEquals("Tears of weak schoolmates", ConsumerGood.TEARS.toString());
        assertEquals("a delicious bottle", ConsumerGood.BOTTLE.toString());
        assertEquals("a healthy salad", ConsumerGood.SALAD.toString());
        assertEquals("bread like our saviour", ConsumerGood.BREAD.toString());
    }
}
