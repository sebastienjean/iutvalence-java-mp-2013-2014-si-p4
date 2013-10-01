package fr.iutvalence.java.mp.hanged;


/**
 * permit to return and save the score
 * @author pascallo
 *
 */
public class Score extends Hanged
{
    /**
     * score of the player
     */
    private int score;

    
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
}
