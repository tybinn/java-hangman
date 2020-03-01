package pl.edu.agh.hangman;

import java.util.ArrayList;

public class GameState {
    private String word;
    private String currentState;
    private int numOfAttempts;
    private int badChoiceses;
    private ArrayList chosenLetters;

    public String getCurrentState() {
        return currentState;
    }

    public int getBadChoiceses() {
        return badChoiceses;
    }

    public GameState(String word){
        this.word = word;
        currentState =  generateEmptyFields(word.length());
        chosenLetters = new ArrayList();
    }
    public State checkLetter(String letter){
        if (!chosenLetters.contains(letter)){
            numOfAttempts ++;
            if (isInWord(letter)){

                return State.OK;
            }else{
                badChoiceses ++;
                return State.FAIL;
            }
        }else{
            return State.ALREADYPROVIDED;
        }
    }
    private boolean isInWord(String letter){
        if (word.contains(letter)){
            return true;
        }else{
            return false;
        }
    }
    private String generateEmptyFields(int len){
        String retVal = "";
        for (int i =1; i <= len; i++ ){
            retVal = retVal + "_";
        }
        return retVal;
    }
    private void unhideLetters(String letter){

    }
}
