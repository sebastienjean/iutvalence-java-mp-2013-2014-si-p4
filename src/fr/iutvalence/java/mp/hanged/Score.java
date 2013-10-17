package fr.iutvalence.java.mp.hanged;


/**
 * permit to return and save the score
 * @author pascallo
 *
 */

public class Score
{
    /*-------------------------------------------------------------
     *  ATRIBUTES 
     *-----------------------------------------------------------*/
    
    /**
     * score of the player
     */
    private int score;

    /*-------------------------------------------------------------
     *  CONSTRUCTORS 
     *-----------------------------------------------------------*/
    
    // Default constructor
    /**
     * Constructors which set the score at 1000
     */
    public Score() {
        // TODO (fix) remove console outputs
        System.out.println("Création du score...");
        this.score = 1000;
        System.out.println("Le score vaut : " + this.score);
    }
    
    // Constructor with parameters
    /**
     * Constructor which set the score with parameter
     * @param pScore int
     */
    public Score(int pScore) {
        System.out.println("Création du score (avec paramètres...");
        this.score = pScore;
        System.out.println("Le score vaut : " + this.score);
    }
    
    /*-------------------------------------------------------------
     *  GETTERS 
     *-----------------------------------------------------------*/
    
    /**
     * permit to get the score
     * @return score
     */
    public int getScore()
    {
        return this.score;
    }

    /*-------------------------------------------------------------
     *  SETTERS 
     *-----------------------------------------------------------*/
    
    /**
     * permit to set the score
     * @param pScore int
     */
    public void setScore(int pScore)
    {
        this.score = pScore;
    }
    
    /*-------------------------------------------------------------
     *  OTHERS METHODS 
     *-----------------------------------------------------------*/
    
    /**
     * permit to decrement the initial score according to the errorNumber
     * @param errorNumber number of error
     */
    public void scoreCounter(int errorNumber){
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
                this.score -= 50;
                break;
      
            case 4:
                this.score -= 75;
                break;
      
            case 5:
                this.score -= 100;
                break;
      
            case 6:
                this.score -= 150;
                break;
               
            case 7:
                this.score -= 200;
                break;
                
            case 8:
                this.score -= 250;
                break;

            case 9:
                this.score -= 500;
                break;

            case 10:
                this.score -= 1000;
                break;

            default:
                this.score -= 0;

        }

    }

}
