package pl.edu.agh.hangman;

import org.junit.Assert;
import org.junit.Test;

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
}
