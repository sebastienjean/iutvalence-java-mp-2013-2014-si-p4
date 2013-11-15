package fr.iutvalence.java.mp.hanged;

import java.util.Random;

/**
 * define word dictionary
 * 
 * @author pascallo
 * 
 */
public class WordLibrary
{

    /*-------------------------------------------------------------
     *  ATRIBUTES 
     *-----------------------------------------------------------*/

    /**
     * Table which contains a list of words
     */
    private String[] wordLibrary = { "BONJOUR", "MERCI", "MANGER", "JOURNEE", "EXTRAORDINAIRE" };

    // TODO (fix) this field is useless
    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;

    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/

    /**
     * Method which reasearch the word to find
     */
    public WordLibrary()
    {
        Random r = new Random();
      
        this.wordToFind = this.wordLibrary[r.nextInt(5)];
    }

    /*-------------------------------------------------------------
     *  GETTERS 
     *-----------------------------------------------------------*/

    /**
     * This getter return the word to find
     * 
     * @return wordToFind
     */
    public String getWordToFind()
    {
        // TODO (fix) this method should return a word randomly
        // taken from the dictionary
        return this.wordToFind;
    }
}
