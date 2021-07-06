public class Solution2_0706 {
    //删除链表中的重复元素，使每个元素只出现一次。
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        if (head == null) {
            return null;
        }
        tmp.next = cur;
        tmp = cur;
        while (cur != null) {
            if(tmp.val == cur.val) {
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
