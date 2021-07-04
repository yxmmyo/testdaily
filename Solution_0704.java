class ListNode {
    public ListNode next;
    public int val;
    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution_0704 {
    //输入两个链表，找出它们的第一个公共节点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int countA = 0;
        int countB = 0;
        while(curA != null) {
            countA++;
            curA = curA.next;
        }
        while(curB != null) {
            countB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        int sub = countA-countB;
        if(sub > 0) {
            while(sub > 0) {
                curA = curA.next;
                sub--;
            }
        }else {
            while(sub < 0) {
                curB = curB.next;
                sub++;
            }
        }
        while(curA != null) {
            if(curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return  null;
    }
}
