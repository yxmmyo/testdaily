package sevenSort;

import java.util.Arrays;
import java.util.Random;

public class TestDemo_1206 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("排序前");
        System.out.println(Arrays.toString(array));
        MergeSort.mergeSort(array);
        System.out.println("排序后");
        System.out.println(Arrays.toString(array));
    }
}
