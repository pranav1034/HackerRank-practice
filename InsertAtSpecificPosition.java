//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        data = x;
//        next = null;
//    }
//}

public class InsertAtSpecificPosition {
    static Node insertPos(Node head, int pos, int data) {
        if (pos < 1)
            return head;

        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        int currPos = 1;

        while(currPos<pos-1 && curr != null) {
            curr = curr.next;
            currPos++;
        }

        if(curr==null)
            return head;

        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}