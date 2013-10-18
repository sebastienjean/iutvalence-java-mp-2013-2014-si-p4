package fr.iutvalence.java.mp.hanged;

/**
 * @author pascallo
 * Class which contains the word to find
 */
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
     * @return wordToFind
     */
    public String getWordToFind() {
        return this.wordToFind;
    }
}
