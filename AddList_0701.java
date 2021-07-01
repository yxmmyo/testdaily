class ListNode1 {
    int val;
    ListNode next = null;
    ListNode head;
    public ListNode1 (int val) {
        this.val = val;
    }
}
public class AddList_0701 {
    //假设链表中每一个节点的值都在 0 - 9 之间，那么链表整体就可以代表一个整数。
    //给定两个这种链表，请生成代表两个整数相加值的结果链表。
    //例如：链表 1 为 9->3->7，链表 2 为 6->3，最后生成新的结果链表为 1->0->0->0
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        func(head1);
        func(head2);
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        ListNode newHead = new ListNode(-1);
        ListNode p = newHead;
        int ret = 0;
        while (cur1 != null || cur2 != null || ret > 0) {
            int x,y;
            if (cur1 == null) {
                x = 0;
            }else {
                x = cur1.val;
                cur1 = cur1.next;
            }
            if (cur2 == null) {
                y = 0;
            }else {
                y = cur2.val;
                cur2 = cur2.next;
            }
            int add = x + y +ret;
            ret = add/10;
            p = new ListNode(add%10);
            p = p.next;
        }
        return func(newHead.next);
    }
    public ListNode func(ListNode h1) {
        ListNode cur = h1;
        ListNode prev = null;
        ListNode newHead = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        h1 = newHead;
        return h1;
    }
}
