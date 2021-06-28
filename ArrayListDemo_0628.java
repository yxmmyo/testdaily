import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo_0628 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList(
                "我","是","中","国","人",
                "我","爱","我","的","祖","国"
        );
        List<String> list2 = list1;
        List<String> list3 = new ArrayList<>(list1);
        list1.set(0,"你");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
