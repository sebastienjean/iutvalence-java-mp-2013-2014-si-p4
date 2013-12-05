package fr.iutvalence.java.mp.hanged;


/**
 * Represents a "Hanged" game
 * 
 * @author pascallo
 * 
 */
public class Hanged
{
    /**
     * score of the player
     */
    private int score;

    /**
     * boolean which indicates if the game is finished
     */
    // TODO (fix) this fields should be declared private
    private boolean finishedHanged;

    /**
     * This is the hidden word
     */
    // TODO (fix) this fields should be declared private
    private char hiddenWord[];

    /**
     * This is the number of error
     */
    // TODO (fix) this fields should be declared private
    private int errorNumber;

    /**
     * word to find
     */
    // TODO (fix) this fields should be declared private
    private String wordToFind;

    private final static int nbErrorMax = 5;

    /**
     * Initialize : - begunHanged; - finishedHanged; - the score - the player's
     * alias - the wordToFind
     */
    public Hanged()
    {
        // Creation of the player
        new Display().displayPlayer();


        // Initialization of the wordToFind
        System.out.println("   Recherche du mot...");
        this.wordToFind =  new WordLibrary().getWordToFind();
        System.out.println("\t --> Le mot à trouver est : TROLOLOLOLOLOOOLOL" );
        
        //Window fen = new Window();
    }
    // TODO (fix) rewrite comment (this is not a constructor)
    /**
     * Method which engage the game
     */
    public void play()
    {
        boolean finishedHanged = false;
        char letter;
        int errorNumber = 0;
        boolean typedLetter = false;
        // Initialization of the secret word
        char[] hiddenWord = new char[this.wordToFind.length()];


        //filling and displaying of the hiddenWord
        //WordLibrary.giveHiddenWord(this.wordToFind);
        
        
        System.out.print("Le mot caché est : ");

        for (int i = 0; i < this.wordToFind.length(); i++)
        {
            hiddenWord[i] = '_';
            System.out.print(hiddenWord[i] + " ");
        }
        System.out.println("");



        while(finishedHanged == false){

            letter =  new Display().giveLetter();

            System.out.println("La lettre proposee est : "+letter);
            for (int i = 0; i < this.wordToFind.length(); i++)
            {
                if (letter == this.wordToFind.charAt(i))
                {
                    typedLetter = true;
                    hiddenWord[i] = letter; 
                }

            }

            if (typedLetter == false) {
                errorNumber++;
                System.out.println("\t\t\t\tVous avez fait " + errorNumber + " erreurs");
                //System.out.println(hiddenWord[i]);
                if (errorNumber >= nbErrorMax) {
                    System.out.println( "Vous avez perdu ! Le mot à trouver était: " + this.wordToFind); // Le joueur a perdu, on lui donne le mot qu'il devait deviner
                    return;
                }
            }
            for (int l = 0; l < hiddenWord.length; l++)
            {
                System.out.print(hiddenWord[l] + " ");
            }
            System.out.println();
            typedLetter = false;
            this.finishedHanged = true;
            for( int j = 0; j< hiddenWord.length ; j++){
                if (hiddenWord[j] == '_') {
                    this.finishedHanged = false;
                }
            }
            if(this.finishedHanged==true){
                System.out.println();
                System.out.println("Vous avez gagné !");
                break;
            }
        }
    }    
}
