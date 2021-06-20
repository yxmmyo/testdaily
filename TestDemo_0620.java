 class ListNode {
     int val;
     ListNode next = null;
 }
public class TestDemo_0620 {
    //给定一个链表，删除链表的倒数第 n 个节点并返回链表的头指针
    //例如，
    //给出的链表为: 1\to 2\to 3\to 4\to 51→2→3→4→5, n= 2.
    //删除了链表的倒数第 n 个节点之后,链表变为1\to 2\to 3\to 51→2→3→5.
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (n <= 0 || head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n-1; i++) {
            fast = fast.next;
            if (fast == null) {
                return null;
            }
        }
        if (fast.next == null) {
            return head.next;
        }
            ListNode beforeSlow;
        while (fast != null) {
            beforeSlow = slow;
            fast = fast.next;
            slow = slow.next;
            if (fast.next == null) {
                beforeSlow.next = slow.next;
                break;
            }
        }
        return head;
    }
}
