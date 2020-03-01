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
    @Test
    public void testGameStateInit(){
        GameState gs = new GameState("TEST");
        Assert.assertEquals("initialization correct", gs.getCurrentState(), "____");
    }
    @Test
    public void testGameStateUserInputCorrect(){
        GameState gs = new GameState("TEST");

        gs.checkLetter("T");
        Assert.assertEquals("initialization correct", gs.getCurrentState(), "T__T");

    }
    @Test
    public void testGameStateUserInputIncorrect(){
        GameState gs = new GameState("TEST");
        gs.checkLetter("W");
        Assert.assertEquals("initialization correct", gs.getCurrentState(), "____");

    }
    @Test
    public void testGameStateUserInputIncorrect2(){
        GameState gs = new GameState("TEST");
        gs.checkLetter("W");

        Assert.assertEquals("initialization correct", gs.getBadChoiceses(), 1);

    }
}
