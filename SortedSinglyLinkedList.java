
/**
 * Implements a singly linked list
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortedSinglyLinkedList<T extends Comparable<T>>
{
    ComparableNode head, tail;

    /** Constructor that creates an empty list  */
    public SortedSinglyLinkedList ()
    {
        head = null;
        tail = null;
    }

    /** Constructor that creates a list with one node  */
    public SortedSinglyLinkedList (T val)
    {
        ComparableNode<T> n = new ComparableNode<T>(val);
        head = n;
        tail = n;
    }

    /** Returns the list as a comma-delimited String  */
    public String toString()
    {
        String ans = "";
        ComparableNode<T> current = head;
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

    public void insert (T newItem)
    {
        ComparableNode newNode = new ComparableNode(newItem);
        
        // case: empty list
        if (head == null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        
        // case: insert at beginning
        if (head.getValue().compareTo(newItem) > 0)
        {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        
        // otherwise, find where it goes.
        ComparableNode tracer = head;
        while ((tracer.getNext() != null) &&
        (tracer.getNext().getValue().compareTo(newNode.getValue()) < 0))
        {
            tracer = tracer.getNext();
        }
        
        // If you added it to the end of the List
        if (tracer == tail) 
        { 
            tail = newNode; 
        }
    }
}
