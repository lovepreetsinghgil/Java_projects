package TREES;

// Node class moved to a separate file named Node.java

public class HeightOfTree {
    public static int height(nod root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        nod root = new nod(1);
        root.left = new nod(2);
        root.right = new nod(3);

        System.out.println("Height of the tree: " + height(root));
    }
}
