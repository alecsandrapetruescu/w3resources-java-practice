package base_part1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        /* Print data of node */
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPreorder() {
        printPreorder(root);
    }

}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}