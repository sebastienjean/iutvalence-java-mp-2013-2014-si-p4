package fr.iutvalence.java.mp.hanged;
import java.util.Random; 
/**
 * define word dictionary
 * @author pascallo
 *
 */
public class Word 
{
    /**
     * Tbale which contains the list of words
     */
    String tableWord[] = {"BONJOUR", "MERCI", "MANGER" , "JOURNEE", "EXTRAORDINAIRE"};
    
    /**
     * word to find taken randomly in tableWord
     */
    public static String wordToFind;
    
    /**
     * get randomly the word to find in the table called tableWord
     * @return String 
     */
    public String getWord()
    {
        /**
         * Variable r is
         */
        Random r = new Random();
        String wordToFind = this.tableWord[r.nextInt(this.tableWord.length)];
        return wordToFind;
    }
}
