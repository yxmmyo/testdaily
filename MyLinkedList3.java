import com.sun.deploy.security.SelectableSecurityManager;

import java.util.List;

class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    public ListNode head;
    //编写代码，以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = head;
        while (cur != null) {
            if (cur.data < x) {
                if (be == null) {
                    bs = cur;
                    be = bs;
                }else {
                    be.next = cur;
                    be = cur;
                }
            }else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = cur;
                }
            }
        }
        cur = cur.next;
            if (bs == null) {
                return as;
            }else {
                be.next = as;
            }if (as == null) {
                be.next = null;
            }else {
                ae.next = null;
            }
        return bs;
    }
}