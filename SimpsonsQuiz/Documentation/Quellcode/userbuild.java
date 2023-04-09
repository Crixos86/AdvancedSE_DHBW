public class UserBuild  extends QuestionManager{

    protected static final Map<Character, Runnable> actions = Map.of(
            'H', () -> new Homer().introduce(),
            'M', () -> new Marge().introduce(),
            'L', () -> new Lisa().introduce(),
            'B', () -> new Bart().introduce(),
            'A', () -> new Apu().introduce(),
            'N', () -> new Ned().introduce(),
            'C', () -> new ComicBookGuy().introduce(),
            'X', () -> new Nelson().introduce(),
            'Y', () -> new Maggie().introduce(),
            'S', () -> new Skinner().introduce()
    );

}