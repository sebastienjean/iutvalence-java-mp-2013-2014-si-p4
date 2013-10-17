package fr.iutvalence.java.mp.hanged;

/**
 * classnnamed "pendu" represent the game
 * @author pascallo
 *
 */
public class Hanged
{
    
    /**
     * Game begining status
     */
    private boolean begunHanged;
    
    /**
     * Game termination status
     */
    private boolean finishedHanged;
   
    // TODO (fix) write comment
    /**
     * drawing status
     */
    private int drawingStatus;
    
    /**
     * score of the player
     */
    private int score;
    
    /**
     * Player's alias typed at the begining of the game
     */
    private String alias;
    
    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;
    
    /**
     * This is the rules of the game which is printed at the begining of the game
     */
    private String rules;
    
    /**
     * Initialize :
     * - begunHanged;
     * - begunHanged;
     * - the score
     * - the player's alias
     * - the wordToFind
     */
    public void Hanged() {
        begunHanged = true;
        finishedHanged = false;
        
        
    }
}
