package fr.iutvalence.java.mp.hanged;


/**
 * permit to return and save the score
 * @author pascallo
 *
 */
//TODO (fix) Is score really a hanged ?
public class Score extends Hanged
{
    
    // TODO (fix) initialize fields only in constructors
    /**
     * score of the player
     */
    private int score = 1000;

    
    /**
     * permit to get the score
     */
    public int getScore()
    {
        return this.score;
    }

    /**
     * permit to set the score
     * @param score
     */
    public void setScore(int score)
    {
        this.score = score;
    }
    
    /**
     * permit to decrement the initial score
     * @param errorNumber
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
