package operation;



public class AddFirst {
    public static Node addFirst(Node head,int e) {
        Node node = new Node(e);
        if (head == null) {
            return node;
        }
        Node cur = head;
        head = node;
        head.next = cur;
        return head;
    }
    public static Node addLast(Node head,int e) {
        Node node = new Node(e);
        if(head == null) {
            return node;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        return head;
    }
    public static Node removeFirst(Node head) {
        if(head == null) {
            return null;
        }
        return head.next;
    }
    public static Node removeLast(Node head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return null;
        }
        Node cur = head;
        Node curNext = null;
        while (cur.next != null) {
            curNext = cur;
            cur = cur.next;
        }
        curNext.next = null;
        return head;
    }
}
