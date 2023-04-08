class UserBuildTest {

    @Test
    void testPerformActionBasedOnAnswers() {
        // Ensure an action is provided for each character
        UserBuild.actions.forEach((character, action) -> assertNotNull(action));
    }

}