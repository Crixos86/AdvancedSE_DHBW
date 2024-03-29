package com.dhbw.ase.simpsons.adapters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserBuildTest {

    @Test
    void testPerformActionBasedOnAnswers() {
        // Ensure an action is provided for each character
        UserBuild.actions.forEach((character, action) -> assertNotNull(action));
    }

}
