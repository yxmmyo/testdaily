import java.util.Deque;
import java.util.LinkedList;

public class Solution_0805 {
    public boolean compareBracket(char left,char c) {
        if (left == '(' && c == ')'){
            return true;
        }else if (left == '[' && c == ']') {
            return true;
        }else if (left == '{' && c == '}') {
            return true;
        }else {
            return false;
        }
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                default:{
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char left = stack.pop();
                    if (!compareBracket(left,c)) {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
