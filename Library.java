import java.util.ArrayList;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private ArrayList<Game> games;
    private int nGames;
    private String owner;
    
    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        games = new ArrayList<>();
        nGames = games.size();
    }
    
    public void startGameSession(Game game){
        GameSession gameSession = new GameSession(System.currentTimeMillis());
    }
    
    public void listAllGames(){
        if(nGames != 0){
            for(Game game : games){
                System.out.println(game.getName());
            }
        } else{
            System.out.println("empty");
        }
    }
    
}