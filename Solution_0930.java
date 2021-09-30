class ListNode {
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution_0930 {

    //JZ55 链表中环的入口结点
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next== null) {
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = pHead;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    //JZ56 删除链表中重复的结点
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
}
