import javax.swing.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Node {
    Node left;
    Node right;
    Integer key;
}
public class Remove_0726 {
    private Node root;
    public Remove_0726() {
        root = null;
    }
    public boolean remove(Integer key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                removeInternal(cur,parent);
                return true;
            } else if (cmp < 0) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }

    public void removeInternal(Node node,Node ghost) {
        if (node.left == null && node.right == null) {
            if (node == root) {
                root = null;
            } else if (ghost.left == null) {
                ghost.right = null;
            } else {
                ghost.left = null;
            }
        } else if (node.left != null && node.right == null) {
            if (node == root) {
                root = node.left;
            } else if (node == ghost.left) {
                ghost.left = node.left;
            } else {
                ghost.right = node.left;
            }
        } else if (node.left == null) {
            if (node == root) {
                root = node.right;
            } else if (node == ghost.left) {
                ghost.left = node.right;
            } else {
                ghost.right = node.right;
            }
        } else {
            Node curParent = node;
            Node cur = node.left;
            while (cur.right != null) {
                curParent = cur;
                cur = cur.right;
            }
            node.key = cur.key;
            if (node == curParent) {
                curParent.left = cur.left;
            } else {
                curParent.right = cur.left;
            }
        }
    }

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("西瓜"));
        System.out.println(set.add("南瓜"));
        System.out.println(set.add("冬瓜"));
        System.out.println(set.add("北瓜"));
       /* Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }*/
        for (String fruit:set
             ) {
            System.out.println(fruit);
        }
    }
}
