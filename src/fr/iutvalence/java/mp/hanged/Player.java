package fr.iutvalence.java.mp.hanged;
import java.util.Scanner;
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
    
    /**
     * letter taped by the player
     */
    private char letter;
    Random r = new Random();
    
    /**
     * letter number in the alphabet
     */
    private final static int nbAlpahbet = 26;



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
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une lettre :");
        String str = sc.nextLine().toUpperCase();
        this.letter = str.charAt(0);
        
//        this.letter = (char) ('A' + r.nextInt(nbAlpahbet));
        return this.letter;
    }

}
