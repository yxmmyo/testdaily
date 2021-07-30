import java.util.HashMap;
import java.util.Map;
//给定一个已按照 升序排列  的整数数组 numbers ，
// 请你从数组中找出两个数满足相加之和等于目标数 target 。
public class Solution3_0730 {
    //双指针法
    public int[] twoSum1(int[] numbers, int target) {
        for(int i = 0;i < numbers.length;i++) {
            int tmp = target-numbers[i];
            int left = i+1;
            int right = numbers.length-1;
            while(left <= right) {
                int mid = (left+right)/2;
                if(numbers[mid] > tmp) {
                    right = mid-1;
                } else if(numbers[mid] < tmp) {
                    left = mid+1;
                } else {
                    return new int[]{i+1,mid+1};
                }
            }
        }
        return new int[]{};
    }
    //哈希法
    public int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (map.containsKey(tmp)) {
                return new int[]{map.get(tmp), i + 1};
            }
            map.put(numbers[i], i + 1);
        }
        return new int[]{};
    }
}
