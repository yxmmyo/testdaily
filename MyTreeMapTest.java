package comeTrueTreeMap;

public class MyTreeMapTest {
    public static void main(String[] args) {
        MyTreeMap map = new MyTreeMap();
        Integer 西瓜 = map.put("西瓜", 10);
        System.out.println(西瓜);
        Integer 南瓜 = map.put("南瓜", 20);
        System.out.println(南瓜);
        南瓜 = map.put("南瓜",30);
        System.out.println(南瓜);
        Integer 冬瓜 = map.getOrDefault("南瓜", 50);
        System.out.println(冬瓜);
    }
}
