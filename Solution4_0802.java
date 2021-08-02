import java.util.HashMap;
import java.util.Map;

public class Solution4_0802 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            Integer count = map.getOrDefault(c,0);
            map.put(c,count+1);
        }
        char[] chars = s.toCharArray();
        for(int i = 0;i < chars.length;i++) {
            if(map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
