package fr.iutvalence.java.mp.hanged;

/**
 * Class which determind 
 * @author pascallo
 *
 */
public class Score {

	/*-------------------------------------------------------------
	 *  CONSTRUCTORS
	 *-----------------------------------------------------------*/

	/**
	 * method which print the right sentence according to the error number
	 * @param errorNumber
	 */
	public Score(int errorNumber, int score){
		switch (errorNumber)
		{
		case 0:
			System.out.println("Vous n'avez fait aucune erreur !");
			break;
		case 1:
			System.out.println("Vous n'avez fait qu'une seule erreur !");
			score = 90;
			break;
		case 2:
			System.out.println("Vous avez fait deux erreurs !");
			score = 70;
			break;
		case 3:
			System.out.println("Vous avez fait trois erreurs !");
			score = 50;
			break;
		case 4:
			System.out.println("Vous avez fait quatre erreurs !");
			score = 30;
			break;
		case 5:
			System.out.println("Vous avez fait cinq erreurs !");
			score = 10;
			break;
		case 6:
			System.out.println("Vous avez fait six erreurs !");
			score = 5;
			break;
		default:
			System.out.println("Erreur...");
		}
		System.out.println("Votre score est de : " + score + " points !");
	}
}
