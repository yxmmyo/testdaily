import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TestEqualsDemo {
    public static void main3(String[] args) {
        String s = "abcd";
        char[] c = s.toCharArray();
    }
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<Integer>();
        List<Integer> list1 = new ArrayList<>();
    }
    public static void main1(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "ab";
        if (a == b) {
            System.out.println("1");
        }
        if (d == c) {
            System.out.println("2");
        }
        if (a.equals(b)) {
            System.out.println("3");
        }
        if (42 == 42.0) {
            System.out.println("4");
        }
    }
}
