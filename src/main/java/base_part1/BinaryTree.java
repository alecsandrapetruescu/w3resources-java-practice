package base_part1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printInorder() {
        printInorder(root);
    }

    private void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
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