package de.dhbw.ase.simpsons.adapters;
import de.dhbw.ase.simpsons.domain.charakters.Bart;
import de.dhbw.ase.simpsons.domain.charakters.Homer;
import de.dhbw.ase.simpsons.domain.charakters.Lisa;
import de.dhbw.ase.simpsons.domain.charakters.Marge;


import java.util.Map;
import java.util.function.Supplier;

public class UserBuild {

    private static final Map<Character, Supplier<Character>> characterMap = Map.of(
//            'H', Homer::new,
//            'M', Marge::new,
//            'B', Bart::new,
//            'L', Lisa::new

    );

    public static Character createCharacter(char c) {
        Supplier<Character> supplier = characterMap.get(c);
        if (supplier == null) {
            throw new IllegalArgumentException("Ungültiger Charakter-Code: " + c);
        }
        return supplier.get();
    }

}

