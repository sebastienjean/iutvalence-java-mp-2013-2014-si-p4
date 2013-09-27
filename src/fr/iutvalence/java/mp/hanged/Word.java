package fr.iutvalence.java.mp.hanged;

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
     * search the word to find in the table called tableWord in class Word
     * @return String 
     */
    public String getWord()
    {
        wordToFind = this.tableWord[3];
        return wordToFind;
    }
}
