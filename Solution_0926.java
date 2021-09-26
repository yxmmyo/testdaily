public class Solution_0926 {

    //JZ7 斐波那契数列
    public int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n > 1) {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
        return -1;
    }

    //JZ8 跳台阶
    public int jumpFloor(int target) {
        if(target <= 2) {
            return target;
        }
        return jumpFloor(target-1)+jumpFloor((target-2));
    }

    //JZ9 跳台阶扩展问题
    public int jumpFloorII(int target) {
        return (int)Math.pow(2,target-1);
    }

    //JZ11 二进制中1的个数
    public int NumberOf1(int n) {
        int count = 0;
        int flg = 1;
        while(flg != 0){
            if((flg & n) != 0)
                count++;
            flg = flg << 1;
        }
        return count;
    }
}
