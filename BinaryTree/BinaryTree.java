public class BinaryTree {

  public Node createNewNode(String data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }

  public int getHeight(Node node) {
    if (node == null) {
      return 0;
    }
    return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
  }

  public int countNodes(Node root) {
    if(root == null)
      return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }

  public final int COUNT = 10;

  public void displayTree(Node root, int space) {
    if (root == null) {
        return;
    }

    space += COUNT;

    displayTree(root.right, space);

    System.out.print("\n");
    for (int i = COUNT; i < space; i++) {
        System.out.print(" ");
    }
    System.out.print(root.data + "\n");

    displayTree(root.left, space);
}

  public void inOrder(Node node) {
      if (node == null) {
          return;
      }
      
      inOrder(node.left);
      System.out.print(node.data + " -- ");
      inOrder(node.right);
  }

  public void preOrder(Node node) {
      if (node == null) {
          return;
      }

      System.out.print(node.data + " -- ");
      preOrder(node.left);
      preOrder(node.right);
  }

  public void postOrder(Node node) {
      if (node == null) {
          return;
      }

      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.data + " -- ");
  }

  public boolean checkForClones(Node t1, Node t2) {
    if(t1 == null && t2 == null) {
      return true;
    }
    
    if(t1 == null || t2 == null) {
      return false;
    }
    
    return t1.data == t2.data 
      && checkForClones(t1.left, t2.left) 
      && checkForClones(t1.right, t2.right);
  }

  public static boolean isLeaf(Node node) {
    return node.left == null && node.right == null;
}

  public static double process(String op, double x, double y)
  {
      if (op.equals("+")) { 
        return x + y; 
      }
      if (op.equals("-")) { 
        return x - y; 
      }
      if (op.equals("*")) { 
        return x * y; 
      }
      if (op.equals("/")) { 
        return x / y; 
      }

      return 0;
  }

  public double evaluate(Node root)
  {
      if (root == null) {
          return 0;
      }

      if (isLeaf(root)) {
          return Double.valueOf(root.data);
      }

      double x = evaluate(root.left);
      double y = evaluate(root.right);

      return process(root.data, x, y);
  }

}
