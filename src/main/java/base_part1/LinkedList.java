package base_part1;

public class LinkedList {
    ListNode head;

    public LinkedList() {
    }

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    void removeDuplicates() {
        ListNode current = head;
        ListNode nextNext;
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

    ListNode reverse(ListNode node) {
        ListNode prev_node = null;
        ListNode current_node = node;
        ListNode next_node = null;
        while (current_node != null) {
            next_node = current_node.next;
            current_node.next = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        node = prev_node;
        return node;
    }

    public static LinkedList merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode mergedListNode = head;
        while (list1 != null && list2 != null) {
            if (list1.key < list2.key) {
                mergedListNode.next = new ListNode(list1.key);
                mergedListNode = mergedListNode.next;
                list1 = list1.next;
            } else {
                mergedListNode.next = new ListNode(list2.key);
                mergedListNode = mergedListNode.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            mergedListNode.next = new ListNode(list1.key);
            mergedListNode = mergedListNode.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            mergedListNode.next = new ListNode(list2.key);
            mergedListNode = mergedListNode.next;
            list2 = list2.next;
        }

        head = head.next;
        return new LinkedList(head);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        if (n == size) {
            head = head.next;
        } else {
            int index = size - n;
            ListNode t = head;
            while (index > 1) {
                t = t.next;
                index--;
            }
            t.next = t.next.next;
        }
        return head;
    }

    void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.key);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}