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
    // TODO (fix) what is this?
    // TODO (fix) this field is not static (you must understand why)
    private static int drawingStatus = 6;

    /**
     * score of the player
     */
    private int score;

    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;

    /**
     * This is the initialization of the hidden word (table of character which compose the hidden word)
     */
    // TODO (fix) this field is not static (you must understand why)
    private static char[] hiddenWord ;

    /**
     * Initialize : - begunHanged; - finishedHanged; - the score - the player's
     * alias - the wordToFind
     */
    public Hanged()
    {
        boolean begunHanged = true;
        boolean finishedHanged = false;


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
        Word wordToFind = new Word();
        this.wordToFind = wordToFind.getWordToFind();
        System.out.println("\t --> Le mot à trouver est : " + this.wordToFind + " !");

        // Initialization of the score
        this.score = 100;
    }
    // TODO (fix) rewrite comment (this is not a constructor)
    /**
     * Constructor
     */
    public void play()
    {
        boolean finishedHanged = false;
        char letter;
        while (finishedHanged == false)
        {
            System.out.println("Le mot caché est : ");
            // Initialization of the secret word
            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                this.hiddenWord[i] = '_';
                System.out.print(this.hiddenWord[i] + " ");
            }
            while(this.drawingStatus != 0){


                Random r = new Random();
                letter = (char) ('A' + r.nextInt(25));

                for (int i = 0; i < this.wordToFind.length(); i++)
                {
                    if (letter == this.wordToFind.charAt(i))
                    {
                        if(letter == this.hiddenWord[i]){
                            System.out.println("Vous avez déjà trouvé cette lettre !");
                        }
                        else{
                            System.out.println("vous avez trouver la lettre : " + letter);
                            this.hiddenWord[i] = letter;
                        }
                    }
                    else
                    {
                        drawingStatus = drawingStatus - 1;
                    }
                }
                System.out.println("Le mot est devenu : ");
                for (int i = 0; i < this.wordToFind.length(); i++){
                    System.out.println(this.hiddenWord[i]);
                }
                finishedHanged = true;
            }
        }

    }
    
    // TODO (fix) this method should be private
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

    // TODO (fix) this method should be private
    /**
     * Method which return true if the hanged is finished
     * 
     * @return boolean
     */
    public boolean finishedHanged()
    {

        for (int i = 0; i < this.wordToFind.length(); i++)
        {
            if (this.wordToFind.charAt(i) == '_')
                return false;
        }
        return true;
    }

}
