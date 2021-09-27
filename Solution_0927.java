class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class Solution_0927 {

    //JZ11 二进制中1的个数
    public int NumberOf1(int n) {
        int count = 0;
        int tmp = 1;
        while(tmp != 0) {
            if((tmp & n) != 0) {
                count++;
            }
            tmp <<= 1;
        }
        return count;
    }

    //JZ12 数值的整数次方
    public double Power(double base, int exponent) {
        if(exponent == 0) {
            return 1.0;
        }
        double tmp = base;
        if(exponent > 0) {
            for(int i = 0;i < exponent-1;i ++) {
                base *= tmp;
            }
            return base;
        }
        if(exponent < 0) {
            for(int i = exponent-1;i < 0;i++) {
                base *= 1/tmp;
            }
        }
        return base;
    }

    //JZ13 调整数组顺序使奇数位于偶数前面
    public int[] reOrderArray (int[] array) {
        int[] ary = new int[array.length];
        int tmp = 0;
        for(int k : array) {
            if(k % 2 != 0) {
                ary[tmp] = k;
                tmp++;
            }
        }
        for(int k : array) {
            if(k % 2 == 0) {
                ary[tmp] = k;
                tmp++;
            }
        }
        return ary;
    }

    //JZ14 链表中倒数最后k个结点
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode cur = pHead;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        if(k > count || k <= 0) {
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        for(int i = 0;i < k-1;i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //JZ15 反转链表
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        while(cur2 != null) {
            ListNode curNext = cur2.next;
            cur2.next = cur1;
            cur1 = cur2;
            cur2 = curNext;
        }
        head.next = null;
        return cur1;
    }

    //JZ16 合并两个排序的链表
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(cur1 != null && cur2 != null) {
            if(cur1.val < cur2.val) {
                tmp.next = cur1;
                tmp = cur1;
                cur1 = cur1.next;
            }else {
                tmp.next = cur2;
                tmp = cur2;
                cur2 = cur2.next;
            }
        }
        if(cur1 == null) {
            tmp.next = cur2;
        }else {
            tmp.next = cur1;
        }
        return newHead.next;
    }
}
