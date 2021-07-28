package myHashCode;

public class MyHashCode {
    private Node[] ary = new Node[11];
    private int size;
    public boolean inSert(Integer key) {
        int hashValue = key.hashCode();
        int index = hashValue % ary.length;
        Node cur = ary[index];
        while (cur != null) {
            if (key.equals(cur.val)) {
                return false;
            }
            cur = cur.next;
        }
        Node node = new Node(key);
        node.next = ary[index];
        ary[index] = node;
        size++;
        if (size/ary.length * 100 >= 75) {
            toAddArray(ary);
        }
        return true;
    }

    private void toAddArray(Node[] ary) {
        Node[] newAry = new Node[ary.length*2];
        for (int i = 0; i < ary.length; i++) {
            Node cur = newAry[i];
            while (cur != null) {
                Integer key = cur.val;
                int hashValue = key.hashCode();
                int index = hashValue % newAry.length;
                Node node = new Node(key);
                node.next = newAry[index];
                newAry[index] = node;
                cur = cur.next;
            }
        }
        ary = newAry;
    }

    public boolean remove(Integer key) {
        int hashValue = key.hashCode();
        int index = hashValue % ary.length;
        Node cur = ary[index];
        Node curNext = null;
        if (cur == null) {
            return false;
        }
        while (cur != null) {
            if (key.equals(cur.val)) {
                if (cur == ary[index]) {
                    cur = cur.next;
                } else {
                    curNext.next = cur.next;
                }
                size--;
                return true;
            }
            curNext = cur;
            cur = cur.next;
        }
        return false;
    }

    public boolean search(Integer key) {
        int hashValue = key.hashCode();
        int index = hashValue % ary.length;
        Node cur = ary[index];
        if (cur == null) {
            return false;
        }
        while (cur != null) {
            if (key.equals(cur.val)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}
