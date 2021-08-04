public class Solution_0804 {
    public String LeftRotateString(String str,int n) {
        int length = str.length();
        char[] ary = new char[length];
        int i = 0;
        for(char c : str.toCharArray()) {
            ary[(i+length-n)%length] = c;
            i++;
        }
        String s = "";
        for(char c : ary) {
            s += c;
        }
        return s;
    }
}
