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
     * Player's alias typed at the begining of the game
     */
    private String alias;

    // TODO (fix) why an aliasTable is required? Consider that an alias is
    // associated
    // to the player while creating it

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

}
