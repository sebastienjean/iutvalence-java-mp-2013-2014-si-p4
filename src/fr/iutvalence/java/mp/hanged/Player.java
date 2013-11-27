package fr.iutvalence.java.mp.hanged;

import java.util.Random;


/**
 * class Player which represent the player's identity (alias
 * 
 * @author pascallo
 * 
 */
public class Player
{
    /*-------------------------------------------------------------
     *  ATRIBUTES 
     *-----------------------------------------------------------*/

    /**
     * Player's alias typed at the beginning of the game
     */
    private String alias;


    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/

    /**
     * Method which create the player
     */
    public Player()
    {
        this.alias = "BoobaToNight";
    }

    /*-------------------------------------------------------------
     *  GETTERS 
     *-----------------------------------------------------------*/

    /**
     * Method which return the player's alias
     * 
     * @return alias String
     */
    public String getAlias()
    {
        return this.alias;
    }
    
    /*-------------------------------------------------------------
     *  OTHERS METHODS 
     *-----------------------------------------------------------*/
    
    /**
     * the player give a letter
     * @return letterChosen
     */
    public char giveLetter()
    {
        // TODO (fix) avoid using temp variables
        Random r = new Random();
        // TODO (fix) declare hard-coded values as constants
        char letter = (char) ('A' + r.nextInt(26));
        return letter;
    }

}
