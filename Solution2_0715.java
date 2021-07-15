import java.util.LinkedList;
import java.util.List;
class ListNode {
    ListNode head;
    ListNode next;
    int val;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution2_0715 {
    //输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        cur = head;
        int[] ary = new int[count];
        while (cur != null) {
            ary[count] = cur.val;
            count--;
            cur = cur.next;
        }
        return ary;
    }

    public static void main(String[] args) {
        int[] ary = {1,2,3,4,5};
        
    }
}
