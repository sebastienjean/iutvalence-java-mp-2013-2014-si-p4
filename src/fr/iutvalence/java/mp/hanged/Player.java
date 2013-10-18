package fr.iutvalence.java.mp.hanged;

import java.util.Random;

/**
 * class Player which represent the player's identity
 * (alias
 * @author pascallo
 *
 */
public class Player
{
    /*-------------------------------------------------------------
     *  ATRIBUTES 
     *-----------------------------------------------------------*/
    
    /**
     * Player's alias typed at the begining of the game
     */
    private String alias;
    
    /**
     * This is the table of the possible alias of the gamer
     */
    private String[] aliasLibrary = {"Booba-To-night", "PascalloLeHaricot", "CourbisLePastis" , "AndreLePathé", "JackiLeKiwi", "AugagneaLeCobra"};
    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/
    
    /**
     * Method which create the player
     */
    public Player() { 
        // TODO (fix) remove console output
        Random r = new Random();
        this.alias = this.aliasLibrary[r.nextInt(6)];
    }
    
    /*-------------------------------------------------------------
     *  GETTERS 
     *-----------------------------------------------------------*/
    
    /**
     * Method which return the player's alias
     * @return alias String
     */
    public String getAlias() {
        return this.alias;
    }
    
}
