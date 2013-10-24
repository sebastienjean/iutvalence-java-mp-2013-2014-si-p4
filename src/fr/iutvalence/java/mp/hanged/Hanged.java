package fr.iutvalence.java.mp.hanged;

import java.util.Random;

/**
 * class named "pendu" represent the game
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
    private boolean begunHanged;

    /**
     * Game termination status
     */
    private boolean finishedHanged;

    // TODO (fix) rewrite comment (it is not understandable)
    /**
     * drawing status
     */
    private int[] drawingStatus = { 6, 5, 4, 3, 2, 1, 0 };

    /**
     * score of the player
     */
    private int score;

    // TODO (fix) this field is not related to a game but to a player
    /**
     * Player's alias typed at the begining of the game
     */
    private String alias;

    
    // TODO (fix) the two following fields are very similar, are they duplicates?
    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;

    /**
     * word to find taken randomly in tableWord
     */
    private String word;

    // TODO (fix) remove this, it is not part of game state
    /**
     * This is the rules of the game which is printed at the begining of the
     * game
     */
    private String rules;

    /**
     * This is the alphabet table
     */
    // TODO (fix) you do not need the alphabet table since arithmetic is available on char values
    // e.g. 'A'+1 equals 'B'
    private char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

    // TODO (think about it) local variable or field? Ask yourself if it is 
    // part of the game state.
    private char letter;

    // TODO (fix) write a comment
    private String hiddenWord;

    /**
     * Initialize : - begunHanged; - begunHanged; - the score - the player's
     * alias - the wordToFind
     */
    public Hanged()
    {
        this.begunHanged = true;
        this.finishedHanged = false;

        // Creation of the player
        System.out.println("Création d'un joueur...");
        Player alias = new Player();
        this.alias = alias.getAlias();
        System.out.println("\t -->Le pseudo du joueur est " + alias.getAlias() + " !");
        System.out.println();

        // Creation of initial player's score
        System.out.println("Création du score...");
        Score score = new Score();
        this.score = score.getScore();
        System.out.println("\t -->Le score du joueur est de " + score.getScore() + " !");
        System.out.println();

        // Initialisation of the wordToFind
        System.out.println("Recherche du mot...");
        Word wordToFind = new Word();
        this.wordToFind = wordToFind.getWordToFind();
        System.out.println("\t -->Le mot à trouver est : " + this.wordToFind + " !");
    }

    /**
     * Simulation of a game
     */
    public void play()
    {
        while (this.finishedHanged == false)
        {
            Random r = new Random();
            this.letter = this.alphabet[r.nextInt(26)];

            // Printing of the secret word
            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                System.out.println(" _ ");
                // hiddenWord = ' ' + '_';
            }

            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                if (this.letter == this.wordToFind.charAt(i))
                {
                    // replace the '_' by the letter
                    System.out.print("Bien joué vous avez trouver une lettre du mot");
                    System.out.print(this.letter + " ");
                }
                else
                {

                }
            }
            finishedHanged = true;

        }

    }
}
