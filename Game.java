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
    private String platform;
    private ArrayList<Review> reviews;
    private String ageRating;
    private String publisher;
    private String developer;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        reviews = new ArrayList<>();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
}