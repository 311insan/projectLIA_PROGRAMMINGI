import java.util.Scanner;

/**
 * Write a description of class InputReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Constructor for objects of class InputReader
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }
    
    public String getInput(){
        System.out.println("> ");
        String inputLine = reader.nextLine().trim().toLowerCase();
        return inputLine;
    }
}