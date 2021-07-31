public class Solution3_0731 {

    public String reverseWords1(String s) {
        //输入："Let's take LeetCode contest"
        //输出："s'teL ekat edoCteeL tsetnoc"
        String[] ary = s.split(" ");
        String ret = "";
        for (String str : ary) {
            char[] chars = str.toCharArray();
            int i = chars.length - 1;
            while (i >= 0) {
                ret += chars[i];
                i--;
            }
            if (str != ary[ary.length - 1]) {
                ret += " ";
            }
        }
        return ret;
    }

    public String reverseWords2(String s) {
    String[] ary = s.split(" ");
    String ret = "";
        for(String str : ary) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while(i < j) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }
        for(char c : chars) {
            ret += c;
        }
        if(str != ary[ary.length-1]) {
            ret += " ";
        }
    }
        return ret;
}
}
