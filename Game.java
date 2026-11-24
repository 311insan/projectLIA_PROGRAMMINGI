import java.util.ArrayList;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String name;
    private String genre;
    private String platform;
    private ArrayList<Review> reviews;
    private String ageRating;
    private String publisher;
    private String developer;
    private boolean isMultiplayer;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        reviews = new ArrayList<>();
    }
    
    //Setter & Getter methods for fields:
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setPlatform(String platform){
        this.platform = platform;
    }
    
    public String getPlatform(){
        return platform;
    }
    
    public void setAgeRating(String ageRating){
        this.ageRating = ageRating;
    }
    
    public String getAgeRating(){
        return ageRating;
    }
    
    // Add review
    
    
}