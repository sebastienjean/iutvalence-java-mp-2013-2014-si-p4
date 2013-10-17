package fr.iutvalence.java.mp.hanged;
import java.util.Random; 
/**
 * define word dictionary
 * @author pascallo
 *
 */

//TODO (think about it) distinguish word and wordLibrary
public class Word {

    
    /*-------------------------------------------------------------
     *  ATRIBUTES 
     *-----------------------------------------------------------*/
    
    /**
     * Table which contains a list of words
     */
    private String[] wordLibrary = {"BONJOUR", "MERCI", "MANGER" , "JOURNEE", "EXTRAORDINAIRE"};
    
    /**
     * word to find taken randomly in tableWord
     */
    private String wordToFind;
    
    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/
    
    public Word() {
        System.out.println("Recherche du mot...");
        wordToFind = researchWordToFind();
        System.out.println("Le mot à trouver est : " + wordToFind);
    }
    /**
     * get randomly the word to find in the table called tableWord
     * @return String 
     */
   
    /*-------------------------------------------------------------
     *  GETTERS 
     *-----------------------------------------------------------*/
    
    public String getWordToFind() {
        return wordToFind;
    }
    
    /*-------------------------------------------------------------
     *  OTHERS METHODS 
     *-----------------------------------------------------------*/
    
    public String researchWordToFind()
    {
        /**
         * Variable r is
         */
        Random r = new Random();
        wordToFind = wordLibrary[r.nextInt(5)];
        return wordToFind;
    }
    
    public boolean tryCaracter(){
    	System.out.print("Saisissez une lettre : ");
    	Scanner sc = new Scaner(System.in);
    	char typedCaracter = sc.nextLine().charAt(0);
    	for ( i=0; i< wordToFind.length(); i++){
    		if (typedCaracter == wordToFind.charAt(i))
    			return true;
    		else
    			return false;
    	}
    }
}
