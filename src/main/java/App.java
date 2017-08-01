/**
 * Created by Guest on 8/1/17.
 */


import models.Scrabble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How Many Scrabble Points are Letters Worth?");
        System.out.println("Enter a Letter or Word:");
        try {
            String stringUserLetter = bufferedReader.readLine();
            Scrabble banana = new Scrabble();
            System.out.println(banana.calculateScore(stringUserLetter));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }




}
