import java.util.Arrays;

public class TestDemo_0621 {
    public static String reserve(String str,int begin,int end) {
        char[] ch = str.toCharArray();
        while (begin < end) {
            ch[begin] ^= ch[end];
            ch[end] ^= ch[begin];
            ch[begin] ^= ch[end];
            begin++;
            end--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String ret = reserve(str,0,str.length()-1);
        System.out.println(ret);
    }
}
