package sevenSort;

public class InsertSort {
    public static void insertSort(int[] ary) {
        for (int i = 1; i < ary.length; i++) {
            int val = ary[i];
            int j;
            for (j = i-1; j >= 0 && ary[j] > val; j--) {
                ary[j+1] = ary[j];
            }
            ary[j+1] = val;
        }
    }
}
