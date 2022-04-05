import java.util.Scanner;
public class BinaryTreeDemo {
    static Scanner userInput = new Scanner(System.in);
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


        //menu
        Boolean menuExit=true;
        do{
            int menuSelection;
            System.out.println("\nSelect option:\n"+        
            "1. Get the height\n"+
            "2. Determine the total number of nodes\n"+
            "3. Display the whole tree\n"+
            "4. Display preorder traversal of the tree\n"+
            "5. Display inorder traversal of the tree\n"+
            "6. Display postorder traversal of the tree\n"+
            "7. Evaluate\n"+
            "8. Determine if trees are identical\n"+
            "9. Exit program\n");

            menuSelection= userInput.nextInt();
            switch(menuSelection){
                case 1:
                    System.out.println("\nHeight of Tree: " + a.getHeight(root) +"\n");
                    break;

                case 2:
                    System.out.println("\nTotal Leaf Nodes: " + a.countNodes(root) +"\n");
                    break;

                case 3:
                    System.out.println("\nDisplaying the whole tree...");
                    a.displayTree(root, 0);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nDisplaying preorder traversal of the tree...");
                    a.preOrder(root);
                    System.out.println();
                    break;

                case 5: 
                    System.out.println("\nDisplaying inorder traversal of the tree...");
                    a.inOrder(root);
                    System.out.println();
                    break;
                    
                case 6:
                    System.out.println("\nDisplaying postorder traversal of the tree...");
                    a.postOrder(root);
                    System.out.println();
                    break;

                case 7:
                    System.out.println("\nThe value of the expression tree is " + a.evaluate(root));
                    break;

                case 8:
                    if (a.checkForClones(root, root1) == true) {
                        System.out.println("\nBoth trees are clones\n");
                    }
                    else {
                        System.out.println("\nBoth trees are not clones\n");
                    }
                    break;

                case 9:
                    menuExit=false;
                    System.out.println("\nExiting Program\n"+"goodbye :)");
                    break;
                default:
                    System.out.println("Misinput! Try again :)\n");
                    break;   
            }
        }while (menuExit);
    }
}
