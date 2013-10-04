package fr.iutvalence.java.mp.hanged;
import java.util.Random; 
/**
 * define word dictionary
 * @author pascallo
 *
 */

//TODO (think about it) distinguish word and wordLibrary
public class Word 
{
    // TODO (fix) declare visibility
    // TODO (fix) rename field
    /**
     * Table which contains the list of words
     */
    String[] tableWord = {"BONJOUR", "MERCI", "MANGER" , "JOURNEE", "EXTRAORDINAIRE"};
    
    /**
     * word to find taken randomly in tableWord
     */
    // TODO (fix) this feild can not be static
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
