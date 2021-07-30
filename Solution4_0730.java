public class Solution4_0730 {
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
    // 同时保持非零元素的相对顺序。
    public void moveZeroes(int[] nums) {
        for(int x = 0;x < nums.length-1;x++) {
            int i = 0;
            int j = i+1;
            while(j < nums.length-x) {
                if(nums[i] == 0) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                i++;
                j++;
            }
        }
    }
}
