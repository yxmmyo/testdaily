class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution3_0726 {
    //输入一个链表，反转链表后，输出新链表的表头。
    public ListNode ReverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode newHead = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = curNext;
        }
        return newHead;
    }
}
