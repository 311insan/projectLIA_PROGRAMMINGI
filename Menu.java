import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    private HashMap<String, Library> libraries;
    private InputReader reader;

    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        reader = new InputReader();
    }
    
    public static void main(String[] args){
        
    }
    
    public void start(){
        boolean exit = false;
        
        while(!exit){
            String input = reader.getInput();
        }
        
    }
    
    public void welcome(){
        System.out.println("-LIA Project: Game Library-");
        System.out.println("To navigate the Menu, input the number associated with an option.");
    }
}