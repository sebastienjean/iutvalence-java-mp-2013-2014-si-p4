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

    // TODO (fix) these two followings fields are local variables
    /**
     * Game beginning status
     */
    private static boolean begunHanged;

    /**
     * Game termination status
     */
    private static boolean finishedHanged;

    // TODO (fix) rewrite comment (it is not understandable)
    /**
     * drawing status : 6 => the rope is drawn 5 => the head is drawn 4 => the
     * trunk is drawn 3 => an arm is drawn 2 => the two arms are drawn 1 => a
     * leg is drawn 0 => the hanged is HANGED !
     */
    private static int drawingStatus = 6;

    /**
     * score of the player
     */
    private int score;

    // TODO (fix) the two following fields are very similar, are they
    // duplicates?
    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;

    // TODO (think about it) local variable or field? Ask yourself if it is
    // part of the game state
    /**
     * Letter chosen by the player
     */
    private static char letter;

    // TODO (fix) write a comment
    /**
     * This is the initialization of the secret word
     */
    private String hiddenWord = "";

    /**
     * Initialize : - begunHanged; - finishedHanged; - the score - the player's
     * alias - the wordToFind
     */
    public Hanged()
    {
        this.begunHanged = true;
        this.finishedHanged = false;

        // Creation of the player
        System.out.println("Création d'un joueur...");
        Player alias = new Player();
        System.out.println("\t -->Le pseudo du joueur est " + alias.getAlias() + " !");
        System.out.println();

        // Creation of initial player's score
        System.out.println("Création du score...");
        this.score = 100;
        System.out.println("\t -->Le score du joueur est de " + this.score + " !");
        System.out.println();

        // Initialization of the wordToFind
        System.out.println("Recherche du mot...");
        Word wordToFind = new Word();
        this.wordToFind = wordToFind.getWordToFind();
        System.out.println("\t -->Le mot à trouver est : " + this.wordToFind + " !");

        // Initialization of the score
        this.score = 100;
    }

    /**
     * Constructor
     */
    public void play()
    {
        while (this.finishedHanged == false)
        {
            // Initialization of the secret word
            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                this.hiddenWord = this.hiddenWord + "_ ";
            }
            System.out.println("Le mot caché est : " + this.hiddenWord + "\n");

            // while(this.drawingStatus != 0)
            Random r = new Random();
            this.letter = (char) ('A' + r.nextInt(25));

            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                if (this.letter == this.wordToFind.charAt(i))
                {
                    // replace the '_' by the letter
                    System.out.println("Bien joué vous avez trouvé la lettre " + this.letter + " !");
                    // replace(oldChar, newChar)
                    this.hiddenWord = this.hiddenWord.replace(this.hiddenWord.charAt(i * 2), this.letter);
                    System.out.println(this.hiddenWord);
                }
                else
                {
                    drawingStatus = drawingStatus - 1;
                }

            }

        }
        finishedHanged = true;
    }

    /**
     * permit to decrement the initial score according to the errorNumber
     * 
     * @param errorNumber
     *            number of error
     */
    public void scoreCounter(int errorNumber)
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

    }

    /**
     * Method which return true if the hanged is finished
     * 
     * @return boolean
     */
    public boolean finishedHanged()
    {

        for (int i = 0; i < this.wordToFind.length(); i++)
        {
            if (this.letter == '_')
                return false;
        }
        return true;
    }

}
