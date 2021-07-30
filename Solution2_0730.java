import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2_0730 {
    //给定两个数组，编写一个函数来计算它们的交集。
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                int count = map.getOrDefault(nums1[i], 0);
                map.put(nums1[i], count + 1);
            }
            for (int j = 0; j < nums2.length; j++) {
                if (map.containsKey(nums2[j]) && map.get(nums2[j]) > 0) {
                    list.add(nums2[j]);
                    map.put(nums2[j], map.get(nums2[j]) - 1);
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                int count = map.getOrDefault(nums2[i], 0);
                map.put(nums2[i], count + 1);
            }
            for (int j = 0; j < nums1.length; j++) {
                if (map.containsKey(nums1[j]) && map.get(nums1[j]) > 0) {
                    list.add(nums1[j]);
                    map.put(nums1[j], map.get(nums1[j]) - 1);
                }
            }
        }
        int[] ary = new int[list.size()];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = list.get(i);
        }
        return ary;
    }
}
