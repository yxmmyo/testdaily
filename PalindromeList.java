import java.util.*;
public class PalindromeList {
    public int data;
    public PalindromeList next;

    public PalindromeList(int data) {
        this.data = data;
    }
    public boolean chkPalindrome() {
        // write code here
        PalindromeList head = new PalindromeList(data);
        PalindromeList slow = head;
        PalindromeList fast = head;
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        //找中间节点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        PalindromeList cur = slow.next;
        while (cur != null) {
            PalindromeList curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //判断
        while (slow != head) {
            if (head.data != slow.data) {
                return false;
            }
            if (head.next == slow) {
                return true;
            }
                slow = slow.next;
                head = head.next;
        }
        return true;
    }
}
