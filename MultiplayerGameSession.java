
/**
 * Write a description of class MultiplayerGameSession here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplayerGameSession extends GameSession
{
    int nPlayers;
    
    /**
     * Constructor for objects of class MultiplayerGameSession
     */
    public MultiplayerGameSession(long startTime, Game game, int nPlayers)
    {
        super(startTime, game);
        this.nPlayers = nPlayers;
    }
    
}