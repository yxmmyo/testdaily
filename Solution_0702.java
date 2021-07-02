import java.util.*;
public class Solution_0702 {
    //输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
    // 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
    // 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
    // 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
    public static List intArrayToList(int[] array) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Deque<Integer> stack = new LinkedList<>();
        List<Integer> pushList = intArrayToList(pushA);
        List<Integer> popList = intArrayToList(popA);
        while (!popList.isEmpty()) {
            int a = popList.remove(0);
            while (true) {
                if (stack.isEmpty() || stack.peek() != a) {
                    if (pushList.isEmpty()) {
                        return false;
                    }
                    int b = pushList.remove(0);
                    stack.push(b);
                } else {
                    break;
                }
            }
            stack.pop();
        }
        return true;
    }

}
