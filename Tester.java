
/**
 * Code for testing linked lists
 *
 * @author  MH and MB @ HB
 * @version 2025-09-12
 */

import java.util.Scanner;

public class Tester
{
    public static void main (String[] args)
    {
        SortedSinglyLinkedList<String> myList = new SortedSinglyLinkedList<String>();
        
        Scanner kbd = new Scanner(System.in);
        String nextWord = kbd.nextLine();
        while (nextWord.length() > 0)
        {
            myList.insert(nextWord);
            System.out.println(myList);
            nextWord = kbd.nextLine();
        }
        
        kbd.close();
    }
}
