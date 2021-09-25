import java.util.ArrayList;
import java.util.Stack;
class ListNode {
    ListNode next;
    int val;
}
public class Solution_0925 {
    //JZ1 二维数组中的查找
    public boolean Find(int target, int [][] array) {
        if(array.length == 0) {
            return false;
        }
        int tmp = array[0].length;
        if(tmp == 0) {
            return false;
        }
        for(int i = 0;i < array.length;i++) {
            while(array[i][tmp-1] < target) {
                i++;
                if(i == array.length) {
                    return false;
                }
            }
            for(int j = 0; j < tmp;j++) {
                if(array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //JZ2 替换空格
    public String replaceSpace (String s) {
        String str = "";
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                str += "%20";
            }else {
                str += c;
            }
        }
        return str;
    }

    //JZ3 从尾到头打印链表

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = listNode;
        while(cur != null) {
            list.add(0,cur.val);
            cur = cur.next;
        }
        return list;
    }
    
    //JZ5 用两个栈实现队列
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack2.push(node);
        }
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }
}
