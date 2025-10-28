
/**
 * A Circular Doubly-Linked List! Woo hoo!
 *
 * @author  MB & MH @ HB
 * @version 2025-09-17
 */
public class CircularList<T>
{
    // instance variables - replace the example below with your own
    private DoubleLinkedNode<T> current;

    /**
     * Constructor for objects of class CircularList
     */
    public CircularList()
    {
        current = null;
    }

    /** Adds a new DoubleLinkedNode after the current node.
     *  Moves current to the newly added Node
     */
    public void add (T newItem) {
        DoubleLinkedNode<T> newNode = new DoubleLinkedNode<T>(newItem);
        
        if (current == null)     // the list is empty
        {
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
        }
        else     // in this case, the list is NOT epmpty
        {
            newNode.setNext(current.getNext());
            newNode.getNext().setPrev(newNode);
            
            newNode.setPrev(current);
            current.setNext(newNode);
        }
        
        current = newNode;
    }
    
    public String toString()
    {
        String ans = "[";
        if (current == null) return ans + "]";
        
        DoubleLinkedNode tracer = current;
        while (tracer.getNext() != current)  {
            ans += tracer.getValue() + ", ";
            tracer = tracer.getNext();
        }
        return ans + tracer.getValue() + "]";
    }
    
}
