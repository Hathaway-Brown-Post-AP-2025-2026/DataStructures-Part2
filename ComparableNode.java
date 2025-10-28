
/**
 * A Node in a singly linked list.
 *
 * @author  MH & MB
 * @version 2025-09-09
 */
public class ComparableNode<T extends Comparable<T>>
{
    private T value;
    private ComparableNode<T> next;
    
    // Two constructors, one with the next
    public ComparableNode (T val)
    {
        value = val;
        next = null;
    }
    
    public ComparableNode (T val, ComparableNode<T> nxt)
    {
        value = val;
        next = nxt;
    }
    
    // Accessor and mutator methods
    public T getValue()  {return value;  }
    public ComparableNode getNext()  {return next;  }
    public void setValue(T val)   { value = val; }
    public void setNext(ComparableNode n)   { next = n;  }
    
    
}
