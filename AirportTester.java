
/**
 *  Tests the AirportList class.
 *
 * @author  MH & MB @ HB
 * @version 2025-11-05
 */
import java.util.Scanner;

public class AirportTester
{
    public static void main (String[] args)
    {
        //AirportListCondensed airports = new AirportListCondensed();
        AirportHash airports = new AirportHash();
        
        airports.printList(0, 15);
        System.out.println("\n\nLa dee dah\n\n");
        airports.printList(2007, 2026);
        airports.analyze();
        
        /*
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter airport codes for me to find!  ");
        String code = kbd.nextLine();
        while (code.length() == 3)
        {
            Airport a = airports.getAirport(code);
            if (a != null) System.out.println(a);
                else System.out.println("No such airport as " + code);
            code = kbd.nextLine();
        }  */
    }
}
