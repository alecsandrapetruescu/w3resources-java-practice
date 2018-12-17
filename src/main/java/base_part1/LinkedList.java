package base_part1;

public class LinkedList {
    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void removeDuplicates() {
        Node current = head;
        Node nextNext;
        if (head == null)
            return;
        while (current.next != null) {
            if (current.key == current.next.key) {
                nextNext = current.next.next;
                current.next = null;
                current.next = nextNext;
            } else {
                current = current.next;
            }
        }
    }

    Node reverse(Node node) {
        Node prev_node = null;
        Node current_node = node;
        Node next_node = null;
        while (current_node != null) {
            next_node = current_node.next;
            current_node.next = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        node = prev_node;
        return node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.key);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
    }
}