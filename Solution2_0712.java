public class Solution2_0712 {
    //编写一个函数来查找字符串数组中的最长公共前缀。
    public String longestCommonPrefix (String[] strs) {
        // write code here
        String str = "";
        if(strs.length == 0) {
            return str;
        }
        if(strs.length == 1) {
            return strs[0];
        }
        char[] chars = strs[0].toCharArray();
        for(char c:chars) {
            String tmp = str;
            str += c;
            for(int i = 1;i < strs.length;i++) {
                if(strs[i].contains(str) == false) {
                    return tmp;
                }
            }
        }
        return str;
    }
}
