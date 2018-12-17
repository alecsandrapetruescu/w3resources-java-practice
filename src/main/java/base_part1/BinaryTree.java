package base_part1;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void printPreorder() {
        printPreorder(root);
    }

    private void printPreorder(TreeNode treeNode) {
        if (treeNode == null) return;
        System.out.print(treeNode.key + " ");
        printPreorder(treeNode.left);
        printPreorder(treeNode.right);
    }

    public void printInorder() {
        printInorder(root);
    }

    private void printInorder(TreeNode treeNode) {
        if (treeNode == null) return;
        printInorder(treeNode.left);
        System.out.print(treeNode.key + " ");
        printInorder(treeNode.right);
    }

    public void printPostorder() {
        printPostorder(root);
    }

    private void printPostorder(TreeNode treeNode) {
        if (treeNode == null) return;
        printPostorder(treeNode.left);
        printPostorder(treeNode.right);
        System.out.print(treeNode.key + " ");
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int bigger = Math.max(leftDepth, rightDepth);
        return bigger + 1;
    }

    public static boolean isSubtree(TreeNode first, TreeNode second) {
        if (second == null) return true;
        if (first == null) return false;
        if (isEqual(first, second)) return true;
        return isSubtree(first.left, second) || isSubtree(first.right, second);
    }

    private static boolean isEqual(TreeNode first, TreeNode second) {
        if (first == null || second == null) return first == second;
        if (first.key != second.key) return false;
        return isEqual(first.left, second.left) && isEqual(first.right, second.right);
    }
}