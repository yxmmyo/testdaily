import java.util.Arrays;

public class Solution_0729 {
    //给你一个按 非递减顺序 排序的整数数组 nums，
    // 返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
    public int[] sortedSquares(int[] nums) {
         /*暴力遍历再排序
         int[] ary = new int[nums.length];
         for(int i = 0;i < nums.length;i++) {
             ary[i] = nums[i]*nums[i];
         }
         Arrays.sort(ary);
         return ary;
         */
        //双指针
        int[] ary = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int n = ary.length-1;
        while(n >= 0) {
            int tmpI = nums[i]*nums[i];
            int tmpJ = nums[j]*nums[j];
            if(tmpI > tmpJ) {
                ary[n] = tmpI;
                i++;
            } else {
                ary[n] = tmpJ;
                j--;
            }
            n--;
        }
        return ary;
    }
    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public void rotate(int[] nums, int k) {
        /* 创建新数组;
        int[] ary = new int[nums.length];
         for(int i = 0;i < nums.length;i++) {
             int tmp = (i+k) % nums.length;
             ary[tmp] = nums[i];
         }
         for(int j = 0;j < nums.length;j++) {
             nums[j] = ary[j];
         }
         */
        //不创建新数组
        int i = 0;
        int j = nums.length-1;
        k = k % nums.length;
        swap(nums,i,j);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }
    public void swap(int[] ary,int i,int j) {
        while(i < j) {
            int tmp = ary[i];
            ary[i] = ary[j];
            ary[j] = tmp;
            i++;
            j--;
        }
    }
}
