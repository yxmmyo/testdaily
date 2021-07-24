import java.util.*;

public class Solution_0724 {
    public static int[] longToArray(long a) {
        int b = length(a);
        List<Integer> list = new ArrayList<>();
        while (a > 0) {
            int x = (int)a%10;
            a = a/10;
            list.add(x);
        }
        int[] ary = new int[b];
        int i = ary.length-1;
        while (!list.isEmpty()) {
            ary[i] = list.remove(0);
            i--;
        }
        return ary;
    }

    public static int[] 转换(long n) {
        Deque<Integer> stack = new LinkedList<>();
        while (n > 0) {
            int y = (int)n%10;
            n = n/10;
            stack.push(y);
        }
        int[] ary = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            ary[i] = stack.pop();
            i++;
        }
        return ary;
    }

    public static int length(long n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long a = 20201018;
        int[] ary = 转换(a);
        System.out.println(Arrays.toString(ary));
    }
}
