 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class TestDemo_0628 {
    //链表之和
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newHead = new ListNode(-1);
        ListNode node = newHead;
        int tmp = 0;
        while (cur1 != null && cur2 != null) {
            int sum = cur1.val+cur2.val+tmp;
            if (sum > 9) {
                tmp = 1;
            }else {
                tmp = 0;
            }
            sum %= 10;
            ListNode tmp1 = new ListNode(sum);
            node.next = tmp1;
            node = tmp1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        while (cur1 == null && cur2 != null) {
            int sum = cur2.val+tmp;
            if (sum > 9) {
                tmp = 1;
            }else {
                tmp = 0;
            }
            sum %= 10;
            ListNode tmp1 = new ListNode(sum);
            node.next = tmp1;
            node = tmp1;
            cur2 = cur2.next;
        }
        while (cur1 != null && cur2 == null) {
            int sum = cur1.val+tmp;
            if (sum > 9) {
                tmp = 1;
            }else {
                tmp = 0;
            }
            sum %= 10;
            ListNode tmp1 = new ListNode(sum);
            node.next = tmp1;
            node = tmp1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return newHead.next;
    }
}
