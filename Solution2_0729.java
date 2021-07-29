import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2_0729 {
    //给你两个有序整数数组 nums1 和 nums2，
    // 请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //(1)先合并,然后调用库函数排序;
         int y = 0;
         for(int i = m;i < m+n;i++) {
             nums1[i] = nums2[y++];
         }
         Arrays.sort(nums1);

        //(2)利用已经排序的数组特性使用双指针
        int[] ary = new int[m+n];
        int i = 0;
        int j = 0;
        int a = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                ary[a] = nums1[i];
                a++;
                i++;
            } else {
                ary[a] = nums2[j];
                a++;
                j++;
            }
        }
        if(i < m) {
            while(i < m) {
                ary[a++] = nums1[i++];
            }
        } else {
            while(j < n) {
                ary[a++] = nums2[j++];
            }
        }
        i = 0;
        for(int x = 0;x < ary.length;x++) {
            nums1[i++] = ary[x];
        }
    }

    //给定一个整数数组nums和一个整数目标值target，
    // 请你在该数组中找出 和为目标值target的那两个整数，
    // 并返回它们的数组下标。
    public int[] twoSum(int[] nums, int target) {
        //(1) 暴力遍历,时间复杂度O(n^2);
        int[] ary = new int[2];
         for(int i = 0;i < nums.length-1;i++) {
             for(int j = i+1;j < nums.length;j++) {
                 if(nums[i]+nums[j] == target) {
                     ary[0] = i;
                     ary[1] = j;
                     return ary;
                 }
             }
         }
         return ary;

        //(2) 使用哈希表处理时间复杂度大幅度降低;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            int tmp = target-nums[i];
            if(map.containsKey(tmp)) {
                return new int[]{i,map.get(tmp)};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
