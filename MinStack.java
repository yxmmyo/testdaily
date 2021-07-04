import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    //定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
    // 调用 min、push 及 pop 的时间复杂度都是 O(1)。
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()) {
            stack2.push(x);
        }else {
            if(stack1.peek() > stack2.peek()) {
                stack2.push(stack2.peek());
            }else {
                stack2.push(x);
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
}
