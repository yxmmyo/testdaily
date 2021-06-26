import java.util.ArrayList;
import java.util.List;

public class TestDemo_0626 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("我是");
        list.add("中国人");
        System.out.println(list);
        list.add(3,"吃了么");
        System.out.println(list);
        list.set(4,"好的");
        System.out.println(list);
        list.add(3,"家乐");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);

    }
}
