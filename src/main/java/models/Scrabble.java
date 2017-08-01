package models;
import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

//    public String[] keys = {"AaEeIiOoUuLlNnRrSsTt","DdGg","BbCcMmPp","FfHhVvWwYy","Kk","JjXx", "QqZz"};
//    public String[] Keys.toCharArray();
//    public Integer[] PairValue = {1,2,3,4,5,8,10};

    public Scrabble() {

    }


    public Integer calculateScore(String input) {
        char[] characterarray = input.toCharArray();
        HashMap<Character, Integer> scrabbleLetters = new HashMap();
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
            scrabbleLetters.put('f', 4) ;
            scrabbleLetters.put('h', 4) ;
            scrabbleLetters.put('v', 4) ;
            scrabbleLetters.put('w', 4) ;
            scrabbleLetters.put('y', 4) ;
            scrabbleLetters.put('k', 5) ;
            scrabbleLetters.put('j', 8) ;
            scrabbleLetters.put('x', 8) ;
            scrabbleLetters.put('q', 10) ;
            scrabbleLetters.put('z', 10) ;
            int result = 0;
        for ( char checkletter: characterarray) {
            Character wrapperclassword = checkletter;
            int value = scrabbleLetters.get(wrapperclassword);
            result += value;
        }


        return result;
    }




//        scrabbleLetters.put("AEIOULNRTST", 1);
//        scrabbleLetters.put("DG", 2);
//        scrabbleLetters.put("BCMP", 3);
//        scrabbleLetters.put("FHVWY", 4);
//        scrabbleLetters.put("K", 5);
//        scrabbleLetters.put("JX", 8);
//        scrabbleLetters.put("QZ", 10);

    //rest of alphabet


}