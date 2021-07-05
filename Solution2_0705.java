import java.util.Deque;
import java.util.LinkedList;

public class Solution2_0705 {
    public String WordsMerge (String[] Words) {
        // write code here
        Deque<Character> stack = new LinkedList<>();
        Deque<Character> stack2 = new LinkedList<>();
        for(String str: Words) {
            char[] chars = str.toCharArray();
            for(char c: chars) {
                if(stack.isEmpty()) {
                    stack.push(c);
                }else {
                    if(stack.peek() == c) {
                        stack.pop();
                    }else {
                        stack.push(c);
                    }
                }
            }
        }
        while(!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        String str = "";
        while(!stack2.isEmpty()) {
            str += stack2.pop();
        }
        return str;
    }
}
