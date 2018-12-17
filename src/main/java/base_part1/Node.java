package base_part1;

public class Node {
    int key;
    Node left, right;
    Node next;

    Node(int key) {
        this.key = key;
        this.next = null;
        left = right = null;
    }
}
