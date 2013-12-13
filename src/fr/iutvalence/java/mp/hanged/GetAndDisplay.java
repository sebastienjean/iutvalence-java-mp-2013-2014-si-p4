package fr.iutvalence.java.mp.hanged;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class GetAndDisplay {

	/*-------------------------------------------------------------
	 *  ATRIBUTES
	 *-----------------------------------------------------------*/

	/**
	 * letter typed by the player
	 */
	private char letter;

	/*-------------------------------------------------------------
	 *  OTHERS METHODS
	 *-----------------------------------------------------------*/

	/**
	 * The player give a letter
	 * @return letterChosen
	 */
	public char giveLetter()
	{
		InputStreamReader isr = null;
		try
		{
			isr = new InputStreamReader(System.in, "US-ASCII");
		}
		catch (UnsupportedEncodingException e){};

		try {
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Veuillez saisir une lettre :");

			String str;
			try{
				str = br.readLine();
			}catch (Exception e) {return 99;};

			if (str.charAt(0) == '\0')
			{
				giveLetter();
			}
			else
			{
				this.letter = str.toUpperCase().charAt(0);
			}
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Erreur !");
		}
		return this.letter;
	}


	/**
	 * Method which create the player's pseudo
	 */
	public void displayPlayer(){
		System.out.println("   Création d'un joueur...");
		Player alias = new Player();
		System.out.println("\t -->Le pseudo du joueur est " + alias.getAlias() + " !");
		System.out.println();
	}


	/**
	 * Method which make and display the hidden word
	 * @param wordToFind
	 * @param hiddenWord
	 */
	public void displayHiddenWord(String wordToFind, char hiddenWord[]){
		System.out.print("Le mot caché est : ");

		for (int i = 0; i < wordToFind.length(); i++)
		{
			hiddenWord[i] = '_';
			System.out.print(hiddenWord[i] + " ");
		}
		System.out.println("");
	}


	/**
	 * Method which inform the player though the game is over
	 * @param wordToFind
	 * @param score
	 */
	public void GameLost(String wordToFind, int score){
		System.out.println( "Vous avez perdu ! Le mot à trouver était: " + wordToFind);
		System.out.println( "Votre score est de : " + score + " points !");
	}


	/**
	 * Method asking the player though he wants to play again
	 */
	public void newGame(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\nVoulez-vous jouer ? (Si oui, tapez 'y' sinon tapez 'n')");
			char rep = sc.nextLine().charAt(0);
			if (rep=='y')
			{
				System.out.println("\n|===========================================================|");
				System.out.println("|======================NOUVELLE PARTIE======================|");
				System.out.println("|===========================================================|");
				new Hanged().play();
			}
			else if(rep=='n'){
				System.out.println("FIN DU JEU !\nA bientôt !");
			}
			else{
			    System.out.println("Veuillez taper un 'y' ou un 'n' !");
			    newGame();
			}
		}catch (StringIndexOutOfBoundsException e){
			System.out.println("ERREUR !");
			newGame();
		}
	}
}
