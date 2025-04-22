package TREES;

import TREES.Node; // Import the Node class

public class HeightOfTree {
    public static int height(Node root) { // Fixed class name
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1); // Fixed class name
        root.left = new Node(2); // Fixed class name
        root.right = new Node(3); // Fixed class name

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of the tree: " + height(root));
    }
}
