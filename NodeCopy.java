class Node {
    int val;
    Node next;
    Node random;
    Node(int val) {
        this.val = val;
    }
}

public class NodeCopy {
    public static Node copy(Node head) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            tmp.next = node;
            tmp = node;
            cur = cur.next;
        }
        return newHead.next;
    }
}
