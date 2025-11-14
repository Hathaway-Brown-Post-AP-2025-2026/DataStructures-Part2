
/**
 * Write a description of class AirportList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;


public class AirportHash
{
    private LinkedList<Airport>[] airports;
    public int TABLE_SIZE;
    private int count;
    
    /**
     * The constructor loads the Airports from a .csv file
     */
    public AirportHash (int size)
    {
        TABLE_SIZE = size;
        airports = (LinkedList<Airport>[])new LinkedList[TABLE_SIZE];
        count = 0;

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
            
            int index = Airport.ataToInt(ata) % TABLE_SIZE;
            if (airports[index] == null) {
                airports[index] = new LinkedList<Airport>();
            }
            
            airports[index].add(myAirport);
            
            count++;
            
            // System.out.println(myAirport);
        }
        System.out.println(count + " airports");
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
    
    /** Analyze the hash table!  */
    public void analyze()
    {
        int maxLength = 0;
        int nullCount = 0;
        int singleCount = 0;
        int totalCount = 0;
        
        for (int i = 0; i < TABLE_SIZE; i++)  {
            if (airports[i] == null)  {
                nullCount++;
            }
            else  {
                int size = airports[i].size();
                if (size == 1)  {
                    singleCount++;
                }
                if (size > maxLength)  {
                    maxLength = size;
                }
                totalCount += size;
            }
        }
        
        System.out.println("\n\n====================================================");
        double nullPct = (nullCount * 100.0) / TABLE_SIZE;
        double singlePct = (singleCount * 100.0) / TABLE_SIZE;
        double avgLength = (1.0 * totalCount) / (TABLE_SIZE - nullCount);
        System.out.println (count + " airports, TABLE_SIZE = " + TABLE_SIZE);
        System.out.println ("null:     " + nullCount + "    " + nullPct + " %");
        System.out.println ("singles:  " + singleCount + "    " + singlePct + " %");
        System.out.println ("Longest:  " + maxLength);
        System.out.println ("Avg List: " + avgLength);
    }
    
     /** Returns the airport matching a given ata code  
    public Airport getAirport (String ata)
    {
        return airports[Airport.ataToInt(ata)];
    }  */
}
