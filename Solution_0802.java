import java.util.ArrayList;
import java.util.List;

public class Solution_0802 {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int ret = 0;
        for(char c : s.toCharArray()) {
            if(list.contains(c)) {
                while(list.contains(c)) {
                    list.remove(0);
                }
            }
            list.add(c);
            ret = Math.max(ret,list.size());
        }
        return ret;
    }
}
