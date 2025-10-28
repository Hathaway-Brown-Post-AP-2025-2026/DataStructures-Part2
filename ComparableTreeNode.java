
/**
 * A Node in a singly linked list.
 *
 * @author  MH & MB
 * @version 2025-09-09
 */
public class ComparableTreeNode<T extends Comparable<T>>
{
    private T value;
    private ComparableTreeNode<T> left, right;
    
    // Two constructors, one with the next
    public ComparableTreeNode (T val)
    {
        value = val;
        left = null;
        right = null;
    }
    
    public ComparableTreeNode (T val, ComparableTreeNode<T> l, ComparableTreeNode<T> r)
    {
        value = val;
        left = l;
        right = r;
    }
    
    // Accessor and mutator methods
    public T getValue()  {return value;  }
    public ComparableTreeNode getLeft()   {return left;  }
    public ComparableTreeNode getRight()  {return right;  }
    public void setValue(T val)   { value = val; }
    public void setLeft(ComparableTreeNode l)    { left = l;  }
    public void setRight(ComparableTreeNode l)   { right = l;  }
    
    
}
