public class BinaryTreeDemo {
    
    public static void main(String[] args) {
      
        BinaryTree a = new BinaryTree();
          
        Node root = a.createNewNode(1);
        root.left = a.createNewNode(2);
        root.right = a.createNewNode(3);
        root.left.left = a.createNewNode(4);
        root.left.right = a.createNewNode(5);
        root.right.left = a.createNewNode(6);
        root.right.right = a.createNewNode(7);
        root.left.left.left = a.createNewNode(8);
        root.left.left.right = a.createNewNode(9);
        root.left.right.left = a.createNewNode(10);
        root.left.right.right = a.createNewNode(11);
        root.right.left.left = a.createNewNode(12);
        root.right.left.right = a.createNewNode(13);
        root.right.right.left = a.createNewNode(14);
        root.right.right.right = a.createNewNode(15);
    
        Node root1 = a.createNewNode(1);
        root1.left = a.createNewNode(2);
        root1.right = a.createNewNode(3);
        root1.left.left = a.createNewNode(4);
        root1.left.right = a.createNewNode(5);
        root1.right.left = a.createNewNode(6);
        root1.right.right = a.createNewNode(7);
        root1.left.left.left = a.createNewNode(8);
        root1.left.left.right = a.createNewNode(9);
        root1.left.right.left = a.createNewNode(10);
        root1.left.right.right = a.createNewNode(11);
        root1.right.left.left = a.createNewNode(12);
        root1.right.left.right = a.createNewNode(13);
        root1.right.right.left = a.createNewNode(14);
        root1.right.right.right = a.createNewNode(15);
          
        System.out.println("Height of Tree: " + a.getHeight(root));
    
        System.out.println("Total Leaf Nodes: " + a.countNodes(root));
    
        System.out.println("Displaying the nodes at specific level...");
        a.printTreeAtLevel(root, 2);
        System.out.println();

        System.out.println("Displaying the whole tree...");
        a.displayTree(root);
        
        System.out.println("Displaying preorder traversal of the tree...");
        a.preOrder(root);
        System.out.println();
        
        System.out.println("\nDisplaying inorder traversal of the tree...");
        a.inOrder(root);
        System.out.println();

        System.out.println("\nDisplaying postorder traversal of the tree...");
        a.postOrder(root);
        System.out.println();
    
        if (a.checkForClones(root, root1) == true) {
            System.out.println("\nBoth trees are clones\n");
        }
        else {
            System.out.println("\nBoth trees are not clones\n");
        }
      }

}
