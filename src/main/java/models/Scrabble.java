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
        scrabbleLetters.put('e', 1) ;
        scrabbleLetters.put('i', 1) ;
        scrabbleLetters.put('o', 1) ;
        scrabbleLetters.put('u', 1) ;
        scrabbleLetters.put('l', 1) ;
        scrabbleLetters.put('n', 1) ;
        scrabbleLetters.put('r', 1) ;
        scrabbleLetters.put('s', 1) ;
        scrabbleLetters.put('t', 1) ;
        scrabbleLetters.put('d', 2) ;
        scrabbleLetters.put('g', 2) ;
        scrabbleLetters.put('b', 3) ;
        scrabbleLetters.put('c', 3) ;
        scrabbleLetters.put('m', 3) ;
        scrabbleLetters.put('p', 3) ;

        return scrabbleLetters.get('d');

//       return HashMap<Character, Integer>scrabbleLetters.values('a');
    }
}