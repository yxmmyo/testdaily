package sevenSort;

public class ShellSort {
    public static void shellSort(int[] ary) {
        int gap = ary.length;
        while (gap > 1) {
            InsertSortGap(ary,gap);
            gap = gap / 2;
        }
        InsertSortGap(ary,1);
    }

    private static void InsertSortGap(int[] ary, int gap) {
        for (int i = 1; i < ary.length; i++) {
            int val = ary[i];
            int j = i - gap;
            for (; j >= 0 && ary[j] > val; j -= gap) {
                ary[j+gap] = ary[j];
            }
            ary[j+gap] = val;
        }
    }
}
