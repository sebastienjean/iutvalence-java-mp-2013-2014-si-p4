package fr.iutvalence.java.mp.hanged;
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
    
    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/
    
    /**
     * Mathod which create the player
     */
    public Player() {
        
        // TODO (fix) remove console outputs
        System.out.println("Création d'un joueur...");
        this.alias = "BoobaToNight";
        System.out.println("Votre pseudo est : " + this.alias + " !");
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
