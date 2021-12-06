package sevenSort;

public class SelectSort {
    public static void selectSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < ary.length-i; j++) {
                if (ary[j] > ary[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = ary[maxIndex];
            ary[maxIndex] = ary[ary.length-i-1];
            ary[ary.length-i-1] = tmp;
        }
    }
}
