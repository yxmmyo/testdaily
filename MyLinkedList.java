class MyLinkedList {

    /** Initialize your data structure here. */
    static class Node {
        public Node next;
        public int val;
        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "" +
                    + val +
                    " ";
        }
    }
    Node head;
    int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (size == 0) {
            head = node;
        }else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        if(index == 0) {
            node.next = head;
            head = node;
            size++;
            return;
        }
        Node cur = head;
        Node curNext = null;
        for(int i = 0;i <index;i++) {
            curNext = cur;
            cur = cur.next;
        }
        node.next = cur;
        curNext.next = node;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if( index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node cur = head;
        Node curNext = null;
        for (int i = 0; i < index; i++) {
            curNext = cur;
            cur = cur.next;
        }
        curNext.next = cur.next;
        size--;
    }
}
