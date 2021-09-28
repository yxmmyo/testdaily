import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;
   public TreeNode(int val) {
     this.val = val;
   }
 }

public class Solution_0928 {

    //JZ18 二叉树的镜像
    public TreeNode Mirror (TreeNode pRoot) {
        if(pRoot == null) {
            return null;
        }
        TreeNode tmp;
        tmp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = tmp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }

    //JZ20 包含min函数的栈
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()) {
            stack2.push(node);
        }else {
            if(stack2.peek() > stack1.peek()) {
                stack2.push(stack1.peek());
            }else {
                stack2.push(stack2.peek());
            }
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

    // 栈的压入、弹出序列
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        List<Integer> list1 = intArrayTOList(pushA);
        List<Integer> list2 = intArrayTOList(popA);
        Deque<Integer> stack = new LinkedList<>();
        while(!list2.isEmpty()) {
            int a = list2.remove(0);
            while(stack.isEmpty() || stack.peek() != a) {
                if(list1.isEmpty()) {
                    return false;
                }
                int b = list1.remove(0);
                stack.push(b);
            }
            stack.pop();
        }
        return true;
    }
    public List intArrayTOList(int[] array){
        List<Integer> list = new LinkedList<>();
        for(int i = 0;i < array.length;i++) {
            list.add(array[i]);
        }
        return list;
    }
}
