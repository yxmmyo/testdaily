package listNode;

public class Solution2_0801 {
    //给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while (fast != null) {
            count++;
            fast = fast.next;
        }
        for (int i = 0; i < count / 2; i++) {
            slow = slow.next;
        }
        return slow;
    }
}
