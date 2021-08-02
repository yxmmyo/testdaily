import java.util.HashMap;
import java.util.Map;

public class Solution2_0802 {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }
        for(char c : s.toCharArray()) {
            Integer count = map1.getOrDefault(c,0);
            map1.put(c,count+1);
        }
        for(char c : t.toCharArray()) {
            Integer count = map2.getOrDefault(c,0);
            map2.put(c,count+1);
        }
        for(Map.Entry<Character,Integer> entry : map1.entrySet()) {
            char c = entry.getKey();
            int i = entry.getValue();
            if(!map2.containsKey(c) || map2.get(c) != i) {
                return false;
            }
        }
        return true;
    }
}
