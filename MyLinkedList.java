class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if (index < 0 || index > getLength()) {
            System.out.println("该位置不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == getLength()) {
            addLast(data);
            return;
        }
        Node cur = searchprev(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    public Node searchprev(int index) {
        Node cur = this.head;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public int getLength() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node cur = searchprev(key);
        cur.next = cur.next.next;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if (searchprev(key) == null) {
            return false;
        }
        return true;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

    }
    public void disPlay() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
