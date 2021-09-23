import java.util.Arrays;

public class Solution_0923 {
    //JZ45 扑克牌顺子
    public boolean IsContinuous(int [] numbers) {
        int a = 0;
        int b = 0;
        int length = numbers.length;
        if(length == 0) {
            return false;
        }
        Arrays.sort(numbers);
        for(int i = 0;i < numbers.length-1;i++) {
            if(numbers[i] == 0) {
                a++;
                continue;
            }
            if(numbers[i] == numbers[i+1]) {
                return false;
            }
            b += numbers[i+1] - numbers[i] - 1;
        }
        if(a >= b) {
            return true;
        }
        return false;
    }
}
