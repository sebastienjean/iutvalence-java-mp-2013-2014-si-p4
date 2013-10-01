package fr.iutvalence.java.mp.hanged;

import java.util.Scanner;
/**
 * Initialization of the game
 * @author pascallo
 */
public class BeforeGame
{
    /**
     * The variable alias will be type by the player
     */
    private String alias;

    /**
     * method which permit to get the alias of the player
     */
    public void GetName()
    {
        /**
         * getting the player's alias
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre pseudo :");
        String alias = sc.nextLine();
        this.alias = alias;
    }
    
    /**
     * Permit to get the word
     * @return "rien"
     */
    public String getWord()
    {
        return "rien";
    }
}
