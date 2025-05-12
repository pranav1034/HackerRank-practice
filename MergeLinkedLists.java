class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class MergeLinkedLists {
    public static Node mergeSortedLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}
