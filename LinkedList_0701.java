class ListNode {
     int val;
     ListNode next = null;
     ListNode head;
     public ListNode (int val) {
         this.val = val;
     }
}
public class LinkedList_0701 {
    //给出一个链表和一个值 ，以 为参照将链表划分成两部分，
    // 使所有小于 的节点都位于大于或等于 的节点之前。
    //两个部分之内的节点之间要保持的原始相对顺序。
    //例如：
    //给出 1\to 4 \to 3 \to 2 \to 5 \to 2  1→4→3→2→5→2 和 x=3,
    //返回 1\to 2 \to 2 \to 4 \to 3 \to 5  1→2→2→4→3→5.
    public ListNode partition (ListNode head, int x) {
        // write code here
        if (head == null) {
            return null;
        }
        ListNode newHead1 = new ListNode(-1);
        ListNode newHead2 = new ListNode(-1);
        ListNode cur1 = newHead1;
        ListNode cur2 = newHead2;
        ListNode tmp = head;
        while (tmp != null) {
            if (tmp.val < x) {
                cur1.next = tmp;
                cur1 = tmp;
                tmp = tmp.next;
            }else {
                cur2.next = tmp;
                cur2 = tmp;
                tmp = tmp.next;
            }
        }
        cur2.next = null;
        cur1.next = newHead2.next;
        return newHead1.next;
    }
}
