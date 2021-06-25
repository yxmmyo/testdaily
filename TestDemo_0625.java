package generic_class;

public class TestDemo_0625 {
    public static void main(String[] args) {
        System.out.println(Long.BYTES);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.out.println(Long.valueOf(10));
        System.out.println(Long.valueOf("1024", 16));
        System.out.println(Long.sum(100, 200));
        System.out.println(Long.compare(10, 20));
        Integer a = new Integer(100);
        System.out.println(a.hashCode());
        System.out.println(Integer.hashCode(20));
        System.out.println(Long.toHexString(19));
    }
}
