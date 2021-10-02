import java.util.HashMap;
import java.util.Map;

public class Solution_1002 {

    //JZ37 数字在升序数组中出现的次数
    public int GetNumberOfK(int [] array , int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array) {
            int count = map.getOrDefault(i,0);
            map.put(i,count+1);
        }
        int ret = map.getOrDefault(k,0);
        return ret;
    }
}
