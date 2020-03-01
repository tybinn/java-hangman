package pl.edu.agh.hangman;

public class GameState {
    private String word;
    private String currentView;
    private int numOfAttempts;
    private int badChoiceses;
    public GameState(String word){
        this.word = word;
        currentView =  generateEmptyFields(word.length());
    }
    public boolean isInWord(String letter){
        if (word.contains(letter)){

        }else{
            badChoiceses =+ 1;
        }
    }
    private String generateEmptyFields(int len){
        String retVal = "";
        for (int i =1; i <= len; i++ ){
            retVal = retVal + "_";
        }
        return retVal;
    }
}
