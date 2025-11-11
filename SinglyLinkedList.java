
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
    
    /** Add a new item to the end of the list    */
    public void add (T val)
    {
        Node<T> n = new Node<T>(val);
        if (head == null) {
            head = n;
        }
        if (tail != null) {
            tail.setNext(n);
        }
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
