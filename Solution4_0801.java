public class Solution4_0801 {
    //统计一个数字在升序数组中出现的次数。
    public int GetNumberOfK(int [] array , int k) {
        int left = 0;
        int right = array.length-1;
        int mid = (left+right)/2;
        int index = 0;
        while(left <= right) {
            if(array[mid] > k) {
                right = mid-1;
                mid = (left+right)/2;
            } else if(array[mid] < k) {
                left = mid+1;
                mid = (left+right)/2;
            } else {
                index = mid;
                break;
            }
        }
        int ret = 0;
        for(int i = index-1;i >= 0;i--) {
            if(array[i] == k) {
                ret++;
            } else {
                break;
            }
        }
        for(int i = index;i < array.length;i++) {
            if(array[i] == k) {
                ret++;
            } else {
                break;
            }
        }

        return ret;
    }
}
