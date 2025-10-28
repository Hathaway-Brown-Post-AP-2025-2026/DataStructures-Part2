
/**
 * A Node in a singly linked list.
 *
 * @author  MH & MB
 * @version 2025-09-09
 */
public class Node<T>
{
    private T value;
    private Node<T> next;
    
    // Two constructors, one with the next
    public Node (T val)
    {
        value = val;
        next = null;
    }
    
    public Node (T val, Node<T> nxt)
    {
        value = val;
        next = nxt;
    }
    
    // Accessor and mutator methods
    public T getValue()  {return value;  }
    public Node getNext()  {return next;  }
    public void setValue(T val)   { value = val; }
    public void setNext(Node n)   { next = n;  }
    
    
}
