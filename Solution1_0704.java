import java.util.Deque;
import java.util.LinkedList;

public class Solution1_0704 {
    //输入两个整数序列，第一个序列表示栈的压入顺序，
    // 请判断第二个序列是否为该栈的弹出顺序。
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int j = 0;
        for(int e:pushed) {
            stack.push(e);
            while(j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == pushed.length;
    }
}
