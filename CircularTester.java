
/**
 * Write a description of class CurcularTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircularTester
{
     public static void main(String[] args)
     {
         CircularList<Integer> frogs = new CircularList<Integer>();
         
         for (int i = 0; i < 10; i++)
         {
             frogs.add(i);
             System.out.println(frogs);
         }
     }
}
