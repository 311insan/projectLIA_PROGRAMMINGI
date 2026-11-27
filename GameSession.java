
/**
 * Write a description of class GameSession here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameSession
{
    private long startTime;
    private long endTime;
    private int gameSessionDuration;
    private Game game;

    /**
     * Constructor for objects of class GameSession
     */
    public GameSession(long startTime, Game game)
    {
        this.startTime = startTime;
    }
    
    public void endGameSession(){
        endTime = System.currentTimeMillis();
        gameSessionDuration = (int) (endTime - startTime);
    }
    
    public void printLog(){
        System.out.println("-GameSsession log-");
    }
}