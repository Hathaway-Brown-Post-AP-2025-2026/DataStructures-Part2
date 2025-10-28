
/**
 * Test the Binary Search Tree!
 *
 * @author  MH & MB @ HB
 * @version 2025-10
 */
public class TreeTester
{
    public static void main (String[] args)
    {
        BinarySearchTree<Integer> myTree = new BinarySearchTree<Integer>();
        
        myTree.add(70);
        myTree.add(26);
        myTree.add(19);
        myTree.add(20);
        myTree.add(23);
        myTree.add(81);
        myTree.add(75);
        myTree.add(92);
        myTree.add(27);
        
        System.out.println(myTree.inOrder());
        System.out.println("Node Count:  " + myTree.getNodeCount());
        System.out.println("Depth:  " + myTree.depth());
    }
}
