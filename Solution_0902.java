import java.util.HashMap;
import java.util.Map;

public class Solution_0902 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            int count = map.getOrDefault(i,0);
            map.put(i,count+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int y = entry.getValue();
            if(y == 1) {
                return x;
            }
        }
        return -1;
    }

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            int count = map.getOrDefault(i,0);
            map.put(i,count+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            int y = entry.getValue();
            if(y > nums.length/2) {
                return x;
            }
        }
        return -1;
    }
}
