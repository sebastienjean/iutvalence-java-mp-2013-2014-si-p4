package fr.iutvalence.java.mp.hanged;

/**
 * Represents a "Hanged" game
 * 
 * @author pascallo
 * 
 */
public class Hanged
{
	/*-------------------------------------------------------------
	 *  ATRIBUTES
	 *-----------------------------------------------------------*/

	/**
	 * score of the player
	 */
	private int score = 50;

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
	 * word to find
	 */
	// TODO (fix) this fields should be declared private
	private final String wordToFind;

	private final static int nbErrorMax = 6;

	/*-------------------------------------------------------------
	 *  CONSTRUCTORS
	 *-----------------------------------------------------------*/

	/**
	 * Initialize : - finishedHanged; - the score - the player's
	 * alias - the wordToFind
	 */
	public Hanged()
	{
		// Creation of the player
		new GetAndDisplay().displayPlayer();


		// Initialization of the wordToFind
		this.wordToFind =  new WordLibrary().getWordToFind();

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
		this.hiddenWord = new char[this.wordToFind.length()];


		//filling and displaying of the hiddenWord
		new GetAndDisplay().displayHiddenWord(this.wordToFind, this.hiddenWord);

		while(finishedHanged == false){

			letter =  new GetAndDisplay().giveLetter();

			System.out.println("La lettre proposée est : "+letter);
			for (int i = 0; i < this.wordToFind.length(); i++)
			{
				if (letter == this.wordToFind.charAt(i))
				{
					typedLetter = true;
					this.hiddenWord[i] = letter;
				}

			}

			if (typedLetter == false) {
				errorNumber++;
				if (errorNumber<2)
					System.out.println("\t\t\t\tNombre d'erreur = " + errorNumber);
				else
					System.out.println("\t\t\t\tNombre d'erreurs = " + errorNumber);
				if (errorNumber >= nbErrorMax) {
					this.score = 0;
					new GetAndDisplay().GameLost(this.wordToFind, this.score);
					new GetAndDisplay().newGame();
					break;
				}
			}

			for (char element : this.hiddenWord) {
				System.out.print(element + " ");
			}
			System.out.println();
			typedLetter = false;
			this.finishedHanged = true;
			for (char element : this.hiddenWord) {
				if (element == '_') {
					this.finishedHanged = false;
				}
			}
			if(this.finishedHanged==true){
				System.out.println();
				System.out.print("Vous avez gagné ! ");
				new Score().Score(errorNumber, this.score);
				break;
			}
		}
		new GetAndDisplay().newGame();
	}
}

/**
 * - Ecrire les règles et les afficher en début de partie !
 *
 */
