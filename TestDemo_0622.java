import java.util.Arrays;

public class TestDemo_0622 {
    //给定一个数组，请你编写一个函数，返回该数组排序后的形式。
    //输入：[5,2,3,1,4]
    //返回值：[1,2,3,4,5]
    public static int[] func(int[] ary) {
        for (int j = 0; j < ary.length; j++) {
            for (int i = 0; i < ary.length - 1; i++) {
                if (ary[i] > ary[i + 1]) {
                    int tmp = ary[i];
                    ary[i] = ary[i + 1];
                    ary[i + 1] = tmp;
                }
            }
        }
        return ary;
    }
    public static void main(String[] args) {
        int[] ary = {5,2,3,1,4};
        System.out.println(Arrays.toString(func(ary)));
    }
}
