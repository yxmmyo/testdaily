package binary_search_tree;

public class BST {
    private Node root;
    public BST() {
        root = null;
    }
    public boolean search(Integer key) {
        Node cur = root;
        while (cur != null) {
            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return false;
    }

    public void inSert(Integer key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node curNext = null;
        Node cur = root;
        int cmp = 0;
        while (cur != null) {
             cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                throw new RuntimeException("不能出现重复");
            } else if (cmp < 0) {
                curNext = cur;
                cur = cur.left;
            } else {
                curNext = cur;
                cur = cur.right;
            }
        }
        if (cmp < 0) {
            curNext.left = new Node(key);
        } else {
            curNext.right = new Node(key);
        }
    }
}
