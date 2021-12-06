package sevenSort;

public class BubbleSort {
    public static void bubbleSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            boolean isSwap = true;
            for (int j = 0; j < ary.length-i-1; j++) {
                if (ary[j] > ary[j+1]) {
                    int tmp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = tmp;
                    isSwap = false;
                }
            }
            if (isSwap) {
                break;
            }
        }
    }
}
