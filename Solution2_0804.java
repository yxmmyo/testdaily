class ListNode {
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution2_0804 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        while(cur2 != null) {
            if(cur1.val == cur2.val) {
                while(cur2 != null && cur1.val == cur2.val) {
                    cur2 = cur2.next;
                }
                cur1.next = cur2;
            }
            if(cur2 == null) {
                break;
            } else {
                cur1 = cur2;
                cur2 = cur2.next;
            }
        }
        return head;
    }
}
