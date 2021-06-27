 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class TestDemo_0627 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode tmp = newHead;
        ListNode curNext = null;
        while (cur1 != null && cur2 != null) {
            cur1.val = (cur1.val+cur2.val)%10;
            if (cur1.val == 0) {
                curNext = tmp;
                cur1.next.val += 1;
                tmp.next = cur1;
                tmp = tmp.next;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }else {
                curNext = tmp;
                tmp.next = cur1;
                tmp = tmp.next;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        if (cur1 == null && cur2 != null) {
            curNext.next = cur2;
        }
        return newHead.next;
    }
}
