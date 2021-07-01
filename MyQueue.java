import java.util.LinkedList;
import java.util.Deque;

public class MyQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack2.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                Integer a = stack2.pop();
                stack1.push(a);
            }
        }
        return stack1.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                Integer a = stack2.pop();
                stack1.push(a);
            }
        }
        return stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
