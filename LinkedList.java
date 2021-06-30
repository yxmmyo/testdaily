package linkedList;

public class LinkedList implements List{
    public Node head;
    public Node last;
    public int size;
    @Override
    public boolean add(Integer e) {
        Node node = new Node(e);
        if (size == 0) {
            this.head = this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
        this.size++;
        return true;
    }

    @Override
    public void add(int index, Integer e) {
        Node node = new Node(e);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界："+index);
        }
        Node cur = head;
        if (index == 0) {
            node.next = head;
            head.prev = node;
            head = node;
        }else if (index == size){
            last.next = node;
            node.prev = last;
            last = node;
        }else {
            for (int i = 0; i < index-1; i++) {
                cur = cur.next;
            }
            node.next = cur.next;
            cur.next.prev = node;
            cur.next = node;
            node.prev = cur;
        }
        size++;
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组下标越界："+index);
        }
        Integer v;
        Node cur = head;
        if (index == 0) {
            v = head.e;
            head = head.next;
            head.prev = null;
            size--;
            if (size == 0) {
                last = null;
            }
        }else if (index == size-1) {
            v = last.e;
            last = last.prev;
            last.next = null;
            size--;
            if (size == 0) {
                head = null;
            }
        }else {
            for (int i = 0; i < index-1; i++) {
                cur = cur.next;
            }
            v = cur.next.e;
            cur.next = cur.next.next;
            cur.next.prev = cur;
            size--;

        }
        return v;
    }

    @Override
    public boolean remove(Integer e) {
        int i = 0;
        for (Node cur = head;cur != null;cur = cur.next) {
            i = i+1;
            if (cur.e.equals(e)) {
                if (i == 1) {
                    head = head.next;
                    head.prev = null;
                    size--;
                }else if (i == size) {
                    last = last.prev;
                    last.next = null;
                    size--;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                    size--;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组下标越界："+index);
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    @Override
    public Integer set(int index, Integer e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("数组下标越界:"+index);
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
        Integer a = cur.e;
        return a;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Integer size() {
        Integer a = 0;
        for(Node cur = head;cur != null;cur = cur.next) {
            a = a+1;
        }
        return a;
    }

    @Override
    public void clear() {
        head = null;
        last = null;
        size = 0;
    }

    @Override
    public int indexOf(Integer e) {
        int i = 0;
        for (Node cur = head;cur != null;cur =cur.next,i++) {
            if (cur.e.equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        int i = size-1;
        for (Node cur = last;cur != null;cur = cur.prev,i--) {
            if (cur.e.equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) != -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (Node cur = head;cur != null;cur = cur.next) {
            s.append(cur.e);
            if (cur != last) {
                s.append(",");
            }
        }
        s.append("]");
        return s.toString();
    }
}
