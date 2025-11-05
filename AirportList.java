
/**
 * Write a description of class AirportList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.*;


public class AirportList
{
    private Airport[] airports;
    
    /**
     * The constructor loads the Airports from a .csv file
     */
    public AirportList ()
    {
        airports = new Airport[17576];
        Scanner dataFile;
        
        // Try to open the file for input.       
        File file = new File("airports.csv");
        dataFile = null;
        try
        {
            dataFile = new Scanner(file);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("*** Cannot open the Airport data file ***");
            System.exit(1);        // quit the program
        } 

        while (dataFile.hasNext())
        {
            String nextAir = dataFile.nextLine();
            String ata = nextAir.substring(0, 3);
            nextAir = nextAir.substring(4);
            String city = nextAir.substring(0, nextAir.indexOf(','));
            nextAir = nextAir.substring(nextAir.indexOf(','));
            String location = nextAir.substring(1);
            
            Airport myAirport = new Airport(ata, city, location);
            airports[Airport.ataToInt(ata)] = myAirport;
            
            // System.out.println(myAirport);
        }
    }
    
    /** Prints the list of airports at the given index from start to end, inclusive  */
    public void printList (int start, int end)
    {
        for (int i = start; i <= end; i++) {
            if (airports[i] == null) {
                System.out.println(i + "\t" + Airport.intToATA(i) + "\tnull");
            }
            else {
                System.out.println(i + "\t" + airports[i]);
            }
            
        }
        
    }
}
