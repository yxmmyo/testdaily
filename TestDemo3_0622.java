class ListNode1 {
    int val;
    ListNode next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class TestDemo3_0622 {
    //输入两个单调递增的链表，输出两个链表合成后的链表，
    // 当然我们需要合成后的链表满足单调不减规则。
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                tmp.next = list2;
                list2 = list2.next;
            }else {
                tmp.next = list1;
                list1 = list1.next;
            }
            tmp = tmp.next;
        }
        if (list1 == null) {
            tmp.next = list2;
        }
        if (list2 == null) {
            tmp.next = list1;
        }
        return newHead.next;
    }
    public static void main(String[] args) {

    }
}
