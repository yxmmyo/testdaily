import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Solution_0727 {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new TreeMap<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.hashCode()-o2.hashCode();
            }
        });
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            tmp.next = node;
            tmp = node;
            map.put(cur,node);
            cur = cur.next;
        }
        Node oldCur = head;
        Node newCur = newHead.next;
        while (oldCur != null) {
            Node random = map.get(oldCur.random);
            if (random == null) {
                newCur.random = null;
            } else {
                newCur.random = random;
            }
            oldCur = oldCur.next;
            newCur = newHead.next;
        }
        return newHead.next;
    }


}
