package fr.iutvalence.java.mp.hanged;

import java.util.Random;

/**
 * define word dictionary
 * 
 * @author pascallo
 * 
 */
public class Word
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
    public Word()
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

    // public boolean tryCaracter(){
    // System.out.print("Saisissez une lettre : ");
    // Scanner sc = new Scaner(System.in);
    // char typedCaracter = sc.nextLine().charAt(0);
    // for ( i=0; i< wordToFind.length(); i++){
    // if (typedCaracter == wordToFind.charAt(i))
    // return true;
    // else
    // return false;
    // }
    // }
}
