package com.dhbw.ase.simpsons.application;
import java.util.Random;

public class MockInputGenerator {
    private final int size;
    private final long seed;

    public MockInputGenerator(int size, long seed) {
        this.size = size;
        this.seed = seed;
    }

    public String generateMockInput() {
        StringBuilder mockInputBuilder = new StringBuilder(size);
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            char c = random.nextBoolean() ? 'y' : 'n';
            mockInputBuilder.append(c).append('\n');
        }

        return mockInputBuilder.toString();
    }
}

