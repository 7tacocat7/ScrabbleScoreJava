package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("d"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("b"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_4() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 4;
        assertEquals(expected, testScrabble.calculateScore("f"));
    }

    @Test
    public void calculateScore_returnsScoreForSingleLetter_5() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 5;
        assertEquals(expected, testScrabble.calculateScore("k"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_8() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 8;
        assertEquals(expected, testScrabble.calculateScore("j"));
    }
    @Test
    public void calculateScore_returnsScoreForSingleLetter_10() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 10;
        assertEquals(expected, testScrabble.calculateScore("q"));
    }
}