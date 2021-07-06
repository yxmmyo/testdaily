class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution_0706 {
    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        if(l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (cur1 != null && cur2 != null) {
            if (cur1.val > cur2.val) {
                tmp.next = cur2;
                tmp = cur2;
                cur2 = cur2.next;
            }else {
                tmp.next = cur1;
                tmp = cur1;
                cur1 = cur1.next;
            }
        }
        if (cur1 == null) {
            tmp.next = cur2;
        }
        if (cur2 == null) {
            tmp.next = cur1;
        }
        return newHead.next;
    }
}
