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
        start();
    }
    
    public static void start(){
        System.out.println("LIA project— Game Libraries");
        
    }
}