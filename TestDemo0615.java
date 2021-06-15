class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo0615 {
    //输入一个链表，反转链表后，输出新链表的表头。
    public ListNode head;
    public ListNode ReverseList(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode newHead = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext.next;
        }
        return newHead;
    }
    //判断给定的链表中是否有环。如果有环则返回true，否则返回false。
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public int getLength() {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    //对于一个给定的链表，返回环的入口节点，如果没有环，返回null
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}

