package fr.iutvalence.java.mp.hanged;

import java.util.Random;

/**
 * Represents a "Hanged" game
 * 
 * @author pascallo
 * 
 */
public class Hanged
{


    // TODO (fix) rewrite comment (it is not understandable)

    // TODO (fix) what is this?
    // TODO (fix) this field is not static (you must understand why)

    /**
     * score of the player
     */
    private int score;

    /**
     * boolean which indicates if the galme is finished
     */
    boolean finishedHanged;
    /**
     * This is the hidden word
     */
    char hiddenWord[];
    /**
     * This is the number of error
     */
    int errorNumber;
    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;

    /**
     * This is the initialization of the hidden word (table of character which compose the hidden word)
     */
    // TODO (fix) this field is not static (you must understand why)


    /**
     * Initialize : - begunHanged; - finishedHanged; - the score - the player's
     * alias - the wordToFind
     */
    public Hanged()
    {
        // Creation of the player
        System.out.println("   Création d'un joueur...");
        Player alias = new Player();
        System.out.println("\t -->Le pseudo du joueur est " + alias.getAlias() + " !");
        System.out.println();

        // Creation of initial player's score
        System.out.println("   Création du score...");
        this.score = 100;
        System.out.println("\t -->Le score du joueur est de " + this.score + " !");
        System.out.println();

        // Initialization of the wordToFind
        System.out.println("   Recherche du mot...");
        this.wordToFind =  new WordLibrary().getWordToFind();
        System.out.println("\t --> Le mot à trouver est : " + this.wordToFind + " !");
    }
    // TODO (fix) rewrite comment (this is not a constructor)
    /**
     * Constructor
     */
    public void play()
    {
        boolean finishedHanged = false;
        char letter;
        Random r = new Random();
        /**
         * drawing status : (the hanged)
         * 6 => the rope is drawn 
         * 5 => the head is drawn 
         * 4 => the trunk is drawn 
         * 3 => an arm is drawn 
         * 2 => the two arms are drawn 
         * 1 => a leg is drawn 
         * 0 => the hanged is HANGED !
         */
        int errorNumber = 0;
        boolean typedLetter = false;
        System.out.print("Le mot caché est : ");
        // Initialization of the secret word
        char[] hiddenWord = new char[this.wordToFind.length()];
        for (int i = 0; i < this.wordToFind.length(); i++)
        {
            hiddenWord[i] = '_';
            System.out.print(hiddenWord[i] + " ");
        }
        System.out.println("");


        while(finishedHanged == false){

            letter = (char) ('A' + r.nextInt(26));

            System.out.println("La lettre proposee est : "+letter);
            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                if (letter == this.wordToFind.charAt(i))
                {
                    typedLetter = true;
                    hiddenWord[i] = letter;
                }
            }
            if ( typedLetter == false ) {
                errorNumber++;
                System.out.println("Vous avez fait " + errorNumber + " erreurs");
                //System.out.println(hiddenWord[i]);
                if (errorNumber >= 10) {
                    System.out.println( "Vous avez perdu ! Le mot à trouver était: " + this.wordToFind); // Le joueur a perdu, on lui donne le mot qu'il devait deviner
                    return;
                }
            }
            typedLetter = false;
            //verifier();
        }
    }

            /**
             * Checking if the word is found
             */

public void verifier(){
            this.finishedHanged = true;
            for( int j = 0; j< this.wordToFind.length() ; j++){
                if (this.hiddenWord[j] == '_') {
                    this.finishedHanged = false;
                }
            }
            if (this.finishedHanged == true){
                System.out.println("Vous avez gagné");
            }
            for( int j = 0; j< this.wordToFind.length() ; j++){
                System.out.print(this.hiddenWord[j]);
            }
            System.out.print("\n");
}
    
    
    // TODO (fix) this method should be private
    /**
     * permit to decrement the initial score according to the errorNumber
     * 
     * @param errorNumber
     *            number of error
     * @return score
     */
    private int scoreCounter(int errorNumber)
    {
        switch (errorNumber)
        {
        case 0:
            this.score -= 0;
            break;

        case 1:
            this.score -= 10;
            break;

        case 2:
            this.score -= 25;
            break;

        case 3:
            this.score -= 40;
            break;

        case 4:
            this.score -= 60;
            break;

        case 5:
            this.score -= 75;
            break;

        case 6:
            this.score -= 100;
            break;

        default:
            this.score -= 0;
        }
        return this.score;
    }
}
