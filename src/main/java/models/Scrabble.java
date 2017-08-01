package models;
import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Integer calculateScore(String input) {
        Map<Character, Integer> scrabbleLetters = new HashMap<Character, Integer>();
        scrabbleLetters.put('a', 1) ;

        return scrabbleLetters.get('a');

//       return HashMap<Character, Integer>scrabbleLetters.values('a');
    }
}