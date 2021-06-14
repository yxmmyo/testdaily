class Node {
    public int data;
    public Node prev;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}

public class RealLinkedList {
    public Node head;
    public Node tail;
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }

    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
      //任意位置插入,第一个数据节点为0号下标
      public void addIndex(int index,int data) {
        Node node = new Node(data);
         if (index < 0 || index > size()) {
             return;
         }
         if (index == 0) {
             addFirst(data);
             return;
         }
         if (index == size()) {
             addLast(data);
             return;
         }
         Node cur = head;
         while (index > 0) {
             cur = cur.next;
             index--;
         }
         node.next = cur;
         node.prev = cur.prev;
         node.prev.next = node;
         cur.prev = node;
      }
      //查找是否包含关键字key是否在单链表当中
      public boolean contains(int key) {
        if (head == null) {
            return false;
        }
        while (head != null) {
            if (head.data == key) {
                return true;
            }
            head = head.next;
        }
        return false;
      }
      //删除第一次出现关键字为key的节点
      public void remove(int key) {
        if (head == null) {
            return;
        }
          if (head.data == key) {
              head = head.next;
              head.prev = null;
              return;
          }
        Node cur = head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur.next != null) {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                    return;
                } else {
                    cur.prev.next = null;
                    return;
                }
            }
            cur = cur.next;
        }
      }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }
        if (head.data == key) {
            head = head.next;
            head.prev = null;
            return;
        }
        Node cur = head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur.next != null) {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                } else {
                    cur.prev.next = null;
                }
            }
            cur = cur.next;
        }
    }
      //得到单链表的长度
      public int size() {
        Node cur = head;
        int count = 0;
        if (head == null) {
            return 0;
        }
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
      }
      public void display() {
        Node cur = head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
          System.out.println();
      }
      //清空链表
      public void clear() {
        Node cur = head;
        Node curNext;
        while (cur != null) {
            curNext = cur;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
    }
}


