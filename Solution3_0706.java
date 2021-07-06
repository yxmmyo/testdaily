public class Solution3_0706 {
    //删除链表中与给定值相等的结点
    public void deleteNode(ListNode node) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        if (head.val == node.val) {
            head = head.next;
            return;
        }
        ListNode curNext = cur;
        cur = cur.next;
        while (cur != null) {
            if (cur.val == node.val) {
                curNext.next = cur.next;
                return;
            }
            cur = cur.next;
        }
    }
}
