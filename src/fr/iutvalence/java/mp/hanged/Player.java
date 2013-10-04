package fr.iutvalence.java.mp.hanged;
import java.util.Scanner;
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
    
    public Player() {
        System.out.println("Création d'un joueur...");
        alias = "BoobaToNight";
        System.out.println("Votre pseudo est : " + alias + " !");
    }
    
    /*-------------------------------------------------------------
     *  GETTERS 
     *-----------------------------------------------------------*/
    
    public String getAlias() {
        return alias;
    }
    

    
    
}
