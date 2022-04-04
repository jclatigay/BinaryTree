public class BinaryTreeDemo {
    
    public static void main(String[] args) {
      
        BinaryTree a = new BinaryTree();
          
        Node root = a.createNewNode("+");
        root.left = a.createNewNode("*");
        root.right = a.createNewNode("/");
        root.left.left = a.createNewNode("-");
        root.left.right = a.createNewNode("2");
        root.right.left = a.createNewNode("21");
        root.right.right = a.createNewNode("7");
        root.left.left.left = a.createNewNode("14");
        root.left.left.right = a.createNewNode("9");
    
        Node root1 = a.createNewNode("+");
        root1.left = a.createNewNode("*");
        root1.right = a.createNewNode("/");
        root1.left.left = a.createNewNode("-");
        root1.left.right = a.createNewNode("2");
        root1.right.left = a.createNewNode("21");
        root1.right.right = a.createNewNode("7");
        root1.left.left.left = a.createNewNode("14");
        root1.left.left.right = a.createNewNode("9");
          
        System.out.println("Height of Tree: " + a.getHeight(root));
    
        System.out.println("Total Leaf Nodes: " + a.countNodes(root));

        System.out.println("Displaying the whole tree...");
        a.displayTree(root, 0);
        System.out.println();
        
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

        System.out.println("The value of the expression tree is " + a.evaluate(root));

      }

}
