public class ApuTest {

    @Test
    public void testIntroduce() {
        Apu apu = new Apu();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        apu.giveQuote();
        String expectedOutput = "Famous Quote: \"Never have I seen you look so unhappy while purchasing such a large quantity of ice cream!\"";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}