public class Solution4_0731 {
    //编写一个函数，其作用是将输入的字符串反转过来。
    // 输入字符串以字符数组 char[] 的形式给出。
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
