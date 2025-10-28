
/**
 * Write a description of class FirstList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstList
{
    public static void main (String[] args)
    {
        Node<String> n3 = new Node<String>("Good");
        Node<String> n2 = new Node<String>("is", n3);
        Node<String> n1 = new Node<String>("Life", n2);
        
        Node<String> current = n1;
        
        while (current != null)
        {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }
}
