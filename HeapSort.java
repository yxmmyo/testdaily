package sevenSort;

public class HeapSort {
    public static void heapSort(int[] ary) {
        creatHeap(ary);
        for (int i = 0; i < ary.length-1; i++) {
            swap(ary,0,ary.length-i-1);
            shiftDown(ary,ary.length-i-1,0);
        }
    }

    private static void creatHeap(int[] ary) {
        for (int i = (ary.length-2)/2; i >= 0; i--) {
            shiftDown(ary,ary.length,i);
        }
    }

    private static void swap(int[] ary, int i, int j) {
        int tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }

    private static void shiftDown(int[] ary, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int max = left;
            int right = left + 1;
            if (right < size) {
                if (ary[right] > ary[left]) {
                    max = right;
                }
            }
            if (ary[index] >= ary[max]) {
                break;
            }
            int tmp = ary[index];
            ary[index] = ary[max];
            ary[max] = tmp;

            index = max;
            left = 2 * index + 1;
        }
    }
}
