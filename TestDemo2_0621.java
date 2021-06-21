import java.util.Scanner;

public class TestDemo2_0621 {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder sb = new StringBuilder();
        sb.append("abcd");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            str = sb.toString();
        }
        System.out.println(str);
    }
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
    public static String func(String string,int k) {
        string = reserve(string,0,k-1);
        string = reserve(string,k,string.length()-1);
        string = reserve(string,0,string.length()-1);
        return string;
    }
    public static void main1 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println(func(str, 3));

    }
}
