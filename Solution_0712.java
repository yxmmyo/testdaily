public class Solution_0712 {
    //实现一个求平方根（sqrt）
    public int sqrt (int x) {
        if(x <= 1) {
            return x;
        }
        long tmp1 = 0;
        long tmp2 = x;
        long mid = (tmp1+tmp2)/2;
        while(tmp1 < tmp2) {
            long num = mid*mid;
            long num1 = (mid-1)*(mid-1);
            long num2 = (mid+1)*(mid+1);
            if(num == x) {
                return (int)mid;
            }
            if(num < x) {
                if(num2 > x) {
                    return (int)mid;
                }
                tmp1 = mid;
            }
            if(num > x) {
                if(num1 < x) {
                    return (int)mid-1;
                }
                tmp2 = mid;
            }
            mid = (tmp1+tmp2)/2;
        }
        return (int)mid;
    }
}
