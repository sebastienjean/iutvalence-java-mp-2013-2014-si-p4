package fr.iutvalence.java.mp.hanged;

import java.util.Scanner;

public class Display
{
    /**
     * letter taped by the player
     */
    private char letter;
    
    /**
     * the player give a letter
     * @return letterChosen
     */
    public char giveLetter()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une lettre :");
            String str = sc.nextLine();
            if (str.charAt(0) == '\0')
            {
                giveLetter();
            }
            else
            {
                this.letter = str.toUpperCase().charAt(0);
            }
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Entrez une lettre !");
        }
        return this.letter;
    }
    
    /**
     * Create the player's pseudo
     */
    public void displayPlayer(){
        System.out.println("   Création d'un joueur...");
        Player alias = new Player();
        System.out.println("\t -->Le pseudo du joueur est " + alias.getAlias() + " !");
        System.out.println();
    }
}
