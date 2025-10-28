
/**
 * Implements a singly linked list
 *
 * @author  MH & MB @ HB
 * @version 2025-09
 */
public class SinglyLinkedList<T>
{
    Node head, tail;
    
    /** Constructor that creates an empty list  */
    public SinglyLinkedList ()
    {
        head = null;
        tail = null;
    }
    
    /** Constructor that creates a list with one node  */
    public SinglyLinkedList (T val)
    {
        Node<T> n = new Node<T>(val);
        head = n;
        tail = n;
    }
    
    /** Returns the list as a comma-delimited String  */
    public String toString()
    {
        String ans = "";
        Node<T> current = head;
        while (current != null)
        {
            ans += current.getValue();
            current = current.getNext();
            if (current != null)
            {
                ans += ", ";
            }
        }
        return ans;
    }
}
