import java.util.Arrays;

public class Test1 {
    //给定两个整型数组, 交换两个数组的内容
    public static void swapArray(int[] ary,int[] ary1) {
        for (int i = 0; i < ary.length; i++) {
            ary[i] ^= ary1[i];
            ary1[i] ^= ary[i];
            ary[i] ^= ary1[i];
        }
        /*System.out.println(Arrays.toString(ary));
        System.out.println(Arrays.toString(ary1));*/
    }
    public static void main(String[] args) {
        int[] ary1 = {1,2,3,4,5};
        int[] ary2 = {6,7,8,9,10};
        swapArray(ary1,ary2);
        System.out.println(Arrays.toString(ary1));
        System.out.println(Arrays.toString(ary2));
    }
}
