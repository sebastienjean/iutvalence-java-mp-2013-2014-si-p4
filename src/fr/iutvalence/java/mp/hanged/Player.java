package fr.iutvalence.java.mp.hanged;
import java.util.Random;
import java.util.Scanner;


/**
 * class Player which represent the player's identity (alias
 * @author pascallo
 */
public class Player
{
	/*-------------------------------------------------------------
	 *  ATRIBUTES
	 *-----------------------------------------------------------*/

	/**
	 * Player's alias typed at the beginning of the game
	 */
	private final String alias;


	Random r = new Random();

	/*-------------------------------------------------------------
	 *  CONSTRUCTORS
	 *-----------------------------------------------------------*/

	/**
	 * Method which create the player
	 */
	public Player()
	{
		this.alias = "BoobaToNight";
	}

	/*-------------------------------------------------------------
	 *  GETTERS
	 *-----------------------------------------------------------*/

	/**
	 * Method which return the player's alias
	 * @return alias String
	 */
	public String getAlias()
	{
		return this.alias;
	}

	/*-------------------------------------------------------------
	 *  OTHERS METHODS
	 *-----------------------------------------------------------*/

	/**
	 * Method which close the scanner object
	 * @param sc
	 */
	public void close(Scanner sc)
	{
		sc.close();
	}


}
