import java.util.Arrays;

public class Test {
    public static  void  swap(int[] ary) {
        int j = ary.length-1;
        while (j > 0) {
            for (int i = 0; i < j; i++) {
                if (ary[i] % 2 != 0) {
                    ary[i] ^= ary[i+1];
                    ary[i+1] ^= ary[i];
                    ary[i] ^= ary[i+1];
                }
            }
            j--;
        }
        System.out.println(Arrays.toString(ary));
    }
    public static void main(String[] args) {
        //题目名称：
        //奇数放到数组后面
        //题目内容：
        //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
        int[] array = {1,2,5,8,4,6,9,24,17,25};
        swap(array);
    }
}
