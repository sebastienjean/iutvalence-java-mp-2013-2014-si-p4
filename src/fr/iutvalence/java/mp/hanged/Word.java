package fr.iutvalence.java.mp.hanged;

/**
 * @author pascallo Class which contains the word to find
 */
// TODO (think about it) if this class only encapsulates a String, you may consider
// moving this field in Hanged
public class Word
{
    /*-------------------------------------------------------------
     *  ATRIBUTES 
     *-----------------------------------------------------------*/

    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;
    

    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/

    /**
     * 
     */
    public Word()
    {
        WordLibrary wordLibrary = new WordLibrary();
        this.wordToFind = wordLibrary.researchWordToFind();
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
        return this.wordToFind;
    }
}
