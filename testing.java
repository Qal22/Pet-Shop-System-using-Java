
/**
 * Write a description of class testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class testing
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        
        String response = "1";
        
        /*
        while (!response.equalsIgnoreCase("0"))
        {
            System.out.print("Input : ");
            response = scan.next();
            
            if (response.equalsIgnoreCase("Samoyed")||response.equalsIgnoreCase("Siberian Husky")||response.equalsIgnoreCase("Beagle")||response.equalsIgnoreCase("British Shorthair")||response.equalsIgnoreCase("Balinese Cat")||response.equalsIgnoreCase("Persian Cat")||response.equalsIgnoreCase("Cashmere Lop")||response.equalsIgnoreCase("Angora Teddy Bears")||response.equalsIgnoreCase("Jersey Wooly")||response.equalsIgnoreCase("Guppy")||response.equalsIgnoreCase("Neon Tetra")||response.equalsIgnoreCase("Goldfish")||response.equalsIgnoreCase("Owl")||response.equalsIgnoreCase("Parrot")||response.equalsIgnoreCase("Kingfisher")||response.equalsIgnoreCase("Furcifer")||response.equalsIgnoreCase("Fischer's chameleon")||response.equalsIgnoreCase("Calumma"))
                {
                    System.out.println(response);
                }
        }
        */
        
        while (!response.equalsIgnoreCase("0"))
        {
            System.out.print("Input : ");
            response = scan.next();
            
            if (!(response.equalsIgnoreCase("01")||response.equalsIgnoreCase("02")))
            {
                System.out.println(response);
            }
            
            
        }
    }
}
