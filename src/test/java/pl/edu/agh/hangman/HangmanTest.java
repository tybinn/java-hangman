package pl.edu.agh.hangman;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HangmanTest {
    @Test
    public void testThatTestsNothing() {
        Assert.assertTrue("You need to implement it!", false);
    }

    @Test
    public void testImportFile(){
        FileReader fr = new FileReader();
        List<String> words;

        words = fr.readFileInList("src\\main\\resources\\slowa.txt");
        Assert.assertEquals("file loaded",words.get(1), "prawnik");

    }

    @Test
    public void testChooseRandomElement(){
        List<String> words = new ArrayList<>();
        words.add("ala");
        words.add("ma");
        words.add("kota");
        words.add("i");
        String a = ChooseRandomElement.getWord(words);
        String b = ChooseRandomElement.getWord(words);
        String c = ChooseRandomElement.getWord(words);
//        TODO
//        choose element enough times in a loop and check if the chosen word is not always the same one
    }
}
