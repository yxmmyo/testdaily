package listNode;

public class Solution3_0801 {
    //给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        if(n == count) {
            return head.next;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode curNext = slow;
        for(int i = 0;i < n-1;i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            curNext = slow;
            fast = fast.next;
            slow = slow.next;
        }
        curNext.next = slow.next;
        return head;
    }
}
