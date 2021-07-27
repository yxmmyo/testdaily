package map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> 通讯录 = new TreeMap<>();
        Integer val1 = 通讯录.put("qsk", 123456);
        Integer val2 = 通讯录.put("zjl", 654321);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(通讯录);
        val1 = 通讯录.put("qsk",123);
        System.out.println(val1);
        Integer val3 = 通讯录.getOrDefault("ljl",987);
        System.out.println(val3);
        Integer n = 通讯录.remove("zhg");
        System.out.println(n);
        通讯录.remove("zjl");
        System.out.println(通讯录);

    }
}
