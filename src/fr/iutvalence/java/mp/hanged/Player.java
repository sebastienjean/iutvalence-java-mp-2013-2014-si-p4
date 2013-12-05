package fr.iutvalence.java.mp.hanged;
import java.util.Scanner;
import java.lang.Object;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;
import java.io.IOException;


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
    
    public void close(Scanner sc)
    {
        sc.close();
    }
    
    
//    public char printUserParams()
//
//    {
//        InputStreamReader isr = new InputStreamReader(System.in, "US-ASCII");
//        BufferedReader br = new BufferedReader(isr);
//        try
//        {
//            this.letter = br.readLine().charAt(0);
//            isr.close();
//            br.close();
//            return this.letter;
//        }catch (IOException e) {}
//    }

   
}
