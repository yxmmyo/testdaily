import java.util.HashMap;
import java.util.Map;

public class Solution3_0802 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c : ransomNote.toCharArray()) {
            Integer count = map1.getOrDefault(c,0);
            map1.put(c,count+1);
        }
        for(char c : magazine.toCharArray()) {
            Integer count = map2.getOrDefault(c,0);
            map2.put(c,count+1);
        }
        for(Map.Entry<Character,Integer> entry : map1.entrySet()) {
            char c = entry.getKey();
            int i = entry.getValue();
            if(!map2.containsKey(c) || map2.get(c) < i) {
                return false;
            }
        }
        return true;
    }
}
