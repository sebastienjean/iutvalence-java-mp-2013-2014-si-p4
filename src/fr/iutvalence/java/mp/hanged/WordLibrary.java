package fr.iutvalence.java.mp.hanged;

import java.util.Random;

/**
 * define word dictionary
 * 
 * @author pascallo
 * 
 */
public class WordLibrary
{

	/*-------------------------------------------------------------
	 *  ATRIBUTES
	 *-----------------------------------------------------------*/

	/**
	 * Table which contains a list of words
	 */
	private final String[] wordLibrary;

	/*-------------------------------------------------------------
	 *  CONSTRUCTORS
	 *-----------------------------------------------------------*/

	/**
	 * Method which initialize the library
	 */
	public WordLibrary()
	{
		this.wordLibrary = new String[] {"bonjour", "merci", "manger", "journee", "extraordinaire", "profit", "partage", "hexagone", "exister", "sablier"};
	}

	/*-------------------------------------------------------------
	 *  GETTERS
	 *-----------------------------------------------------------*/

	/**
	 * This getter return the word to find
	 * @return wordToFind
	 */
	public String getWordToFind()
	{
		Random r = new Random();
		return this.wordLibrary[r.nextInt(this.wordLibrary.length)].toUpperCase();
	}
}
