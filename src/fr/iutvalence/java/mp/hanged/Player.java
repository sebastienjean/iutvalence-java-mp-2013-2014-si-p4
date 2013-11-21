package fr.iutvalence.java.mp.hanged;


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

}
