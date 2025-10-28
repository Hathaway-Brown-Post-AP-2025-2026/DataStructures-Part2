
/**
 * Implements a BinarySearchTree!  WooHoo!
 *
 * @author  MH & MB @ HB
 * @version 2025-10
 */
public class BinarySearchTree<T extends Comparable<T>>
{
    ComparableTreeNode root;

    public BinarySearchTree ()
    {
        root = null;
    }

    /** ---------------------------------------------
     *  Prints an inOrder traversal of the Binary Search Tree 
     *  ---------------------------------------------  */
    public String inOrder ()
    {
        return "Tree: " + inOrder(root);
    }

    public String inOrder(ComparableTreeNode n)
    {
        if (n != null) {
            return inOrder(n.getLeft()) + "  " + n.getValue() + "  " + inOrder(n.getRight());
        }
        return "";
    }

    /** ---------------------------------------------
     *  Adds the node to the Binary Search Tree 
     *  ---------------------------------------------  */
    public void add (T val)
    {
        if (root == null) {
            root = new ComparableTreeNode<T>(val);
        }
        else if (val.compareTo((T)root.getValue()) < 0)  {
            if (root.getLeft() == null)  {
                root.setLeft(new ComparableTreeNode<T>(val));
            }  else
            {
                add (val, root.getLeft());
            }
        }
        else  {
            if (root.getRight() == null)  {
                root.setRight(new ComparableTreeNode<T>(val));
            }  else
            {
                add (val, root.getRight());
            }
        }
    }

    public void add (T val, ComparableTreeNode n)
    {
        if (val.compareTo((T)n.getValue()) < 0)  {
            if (n.getLeft() == null)  {
                n.setLeft(new ComparableTreeNode<T>(val));
            }  else
            {
                add (val, n.getLeft());
            }
        }
        else  {
            if (n.getRight() == null)  {
                n.setRight(new ComparableTreeNode<T>(val));
            }  else
            {
                add (val, n.getRight());
            }
        }
    }
    
    /** Returns the depth of the tree  */
    public int depth()
    {
        return depth(root);
    }
    
    public int depth(ComparableTreeNode n)
    {
        if (n == null) {
            return 0;
        }
        else {
            return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
        }
    }
    
    
    /** Returns the number of nodes in the tree  */
    public int getNodeCount()
    {
        return getNodeCount(root);
    }
    
    public int getNodeCount(ComparableTreeNode n)
    {
        if (n == null) {
            return 0;
        }
        else {
            return 1 + getNodeCount(n.getLeft()) + getNodeCount(n.getRight());
        }
    }
    

}
