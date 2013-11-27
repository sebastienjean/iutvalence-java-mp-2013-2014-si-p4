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
     * boolean which indicates if the galme is finished
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
        System.out.print("Le mot caché est : ");

        for (int i = 0; i < this.wordToFind.length(); i++)
        {
            hiddenWord[i] = '_';
            System.out.print(hiddenWord[i] + " ");
        }
        System.out.println("");



        while(finishedHanged == false){

            letter =  new Player().giveLetter();

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
                if (errorNumber >= 100) {
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
