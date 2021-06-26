import java.util.ArrayList;
import java.util.List;

public class SubListDemo_0626 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);
        List list1 = list.subList(1,4);
        System.out.println(list1);
        System.out.println(list.indexOf('D'));
        System.out.println(list.indexOf('G'));
    }
}
