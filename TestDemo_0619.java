public class TestDemo_0619 {
    public static void main(String[] args) {
        String str = "abcdecdh";
        String ret = str.replaceFirst("cd","bh");
        System.out.println(ret);
    }
    public static void main3(String[] args) {
        String str = "abcdecdh";
        int ret = str.indexOf("cd");
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        String str = "abcdefgh";
        boolean ret = str.contains("cd");
        System.out.println(ret);
        boolean ret2 = str.contains("ghf");
        System.out.println(ret2);
    }
    public static void main1(String[] args) {
        String str = "0123459478";
        char[] value = str.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] <= '9' && value[i] >= '0') {
                continue;
            }else {
                System.out.println("不是");
                return;
            }
        }
        System.out.println("全是数字");
    }
}
