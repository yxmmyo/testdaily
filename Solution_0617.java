 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
    public class Solution_0617 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next.next == null) {
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
    //给出一个升序排序的链表，删除链表中的所有重复出现的元素，只保留原链表中只出现一次的元素。
    //例如：
    //给出的链表为1 \to 2\to 3\to 3\to 4\to 4\to51→2→3→3→4→4→5, 返回1\to 2\to51→2→5.
    //给出的链表为1\to1 \to 1\to 2 \to 31→1→1→2→3, 返回2\to 32→3.
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode newhead = new ListNode(-1);
        ListNode tmp = newhead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }
            else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }

        }
        tmp.next = null;
        return newhead.next;
    }
    //给定一个链表，删除链表的倒数第n个节点并返回链表的头指针
    //例如，
    //给出的链表为: 1\to 2\to 3\to 4\to 51→2→3→4→5, n=2.
    //删除了链表的倒数第 nn 个节点之后,链表变为1\to 2\to 3\to 51→2→3→5.
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (n < 0) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode tmp = null;
        for (int i = 0; i < n-1; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return null;
        }
        if (fast.next == null) {
            return head = head.next;
        }
        if (fast.next != null) {
            ListNode slowbefor = head;
            while (fast.next != null) {
                 slowbefor = slow;
                slow = slow.next;
                fast = fast.next;
            }
            slowbefor.next = slow.next;
        }
        return head;
    }
}
