package fr.iutvalence.java.mp.hanged;

import java.util.Scanner;

// TODO (fix) fix comment (this is not a second main...)
/**
 * class which is the second main class named "pendu" which represent the game
 * @author pascallo
 *
 */
public class Hanged extends BeforeGame
{
    /**
     * Game begining status
     */
    public boolean begunHanged;
    
    /**
     * Game termination status
     */
    public boolean finishedHanged;
   
    /**
     * drawing status
     * @return int
     */
    public int drawingStatus;
    
    
    /**
     * permit to get the score
     * @return int
     */
    public int getScore()
    {
        return score;
    }
    


}
