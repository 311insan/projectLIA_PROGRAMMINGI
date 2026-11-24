import java.util.ArrayList;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
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
    
    //Start GameSession:
    
    public void startGameSession(Game game){
        GameSession gameSession = new GameSession(System.currentTimeMillis(), game);
    }
    
    //List Games:
    
    public void listAllGames(){
        if(nGames != 0){
            int index = 0;
            for(Game game : games){
                System.out.println(index + ": " + game.getName());
                index++;
            }
        } else{
            System.out.println("empty");
        }
    }
    
    public void listOfGenre(String genre){
        int index = 0;
        for(Game game : games){
            if(game.getGenre().equals(genre)){
                System.out.println(index + ": " + game.getName());
                index++;
            }
        }
    }
    
    public void listOfPlatform(String platform){
        int index = 0;
        for(Game game : games){
            if(game.getPlatform().equals(platform)){
                System.out.println(index + ": " + game.getName());
                index++;
            }
        }
    }
    
    public void listOfAgeRating(String ageRating){
        int index = 0;
        for(Game game : games){
            if(game.getAgeRating().equals(ageRating)){
                System.out.println(index + ": " + game.getName());
                index++;
            }
        }
    }
    
    //Print Library Details:
    
    public void printLibraryDetails(){
        System.out.println("Owner: " + owner);
        System.out.println("Number of games in Library: " + nGames);
    }
    
    //Getter & Setter methods for fields:
    
    public void setOwner(String ownerName){
        owner = ownerName;
    }
    
    public String getOwner(){
        return owner;
    }
    
}