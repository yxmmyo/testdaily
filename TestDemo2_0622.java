class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo2_0622 {
    //输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。
    //如果该链表长度小于k，请返回一个长度为 0 的链表。
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int count = 0;
        ListNode tmp = pHead;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        if (k <= 0 || k > count) {
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        for (int i = 0; i < k-1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {

    }
}
