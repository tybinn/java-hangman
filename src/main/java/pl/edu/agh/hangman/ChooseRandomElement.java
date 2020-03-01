package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class ChooseRandomElement {

    public static String getWord(List<String> words){
        Random rnd = new Random();
        int choice = rnd.nextInt(words.size());
        return words.get(choice);
    }

}
