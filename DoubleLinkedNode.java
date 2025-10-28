
/**
 * A Node in a doubly linked list.
 *
 * @author  MH & MB
 * @version 2025-09-09
 */
public class DoubleLinkedNode<T>
{
    private T value;
    private DoubleLinkedNode<T> next, prev;
    
    // Two constructors, one with the next
    public DoubleLinkedNode (T val)
    {
        value = val;
        next = null;
        prev = null;
    }
    
    public DoubleLinkedNode (T val, DoubleLinkedNode<T> nxt, DoubleLinkedNode<T> prv)
    {
        value = val;
        next = nxt;
        prev = prv;
    }
    
    // Accessor and mutator methods
    public T getValue()  {return value;  }
    public DoubleLinkedNode getNext()  {return next;  }
    public DoubleLinkedNode getPrev()  {return prev;  }
    public void setValue(T val)   { value = val; }
    public void setNext(DoubleLinkedNode n)   { next = n;  }
    public void setPrev(DoubleLinkedNode n)   { next = n;  }
    
    
}
