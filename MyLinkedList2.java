class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}
public class MyLinkedList2 {
    public ListNode head;
    public void addfirst(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
    // 如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode() {
        ListNode fast = head;
        ListNode slow = head;
        if (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(int k) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null) {
            return null;
        }
        if (k <= 0) {
            System.out.println("k的值有误");
            return null;
        }
        int i = 0;
        while (i < k-1) {
            fast = fast.next;
            if (fast == null) {
                System.out.println("k的值有误");
                return null;
            }
            i = i+1;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
