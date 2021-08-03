package listNode;

public class Solution_0803 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur = head;
        ListNode tmp = newHead;
        while(cur != null) {
            if(cur.val != val) {
                tmp.next = cur;
                tmp = cur;
            }
            cur = cur.next;
        }
        tmp.next = null;
        return newHead.next;
    }
}
