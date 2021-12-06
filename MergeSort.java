package sevenSort;

public class MergeSort {

    public static void mergeSort(int[] ary) {
        mergeSortFunction(ary,0,ary.length);
    }

    private static void mergeSortFunction(int[] ary, int low, int high) {
        if (low + 1 >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortFunction(ary,low,mid);
        mergeSortFunction(ary,mid,high);

        merge(ary,low,mid,high);
    }

    private static void merge(int[] ary, int low, int mid, int high) {
        int i = low;
        int j = mid;
        int len = high - low;
        int[] extra = new int[len];
        int k = 0;
        while (i < mid && j < high) {
            if (ary[i] < ary[j]) {
                extra[k++] = ary[i++];
            }else {
                extra[k++] = ary[j++];
            }
        }
        while (i < mid) {
            extra[k++] = ary[i++];
        }
        while (j < high) {
            extra[k++] = ary[j++];
        }
        for (int l = 0; l < len; l++) {
            ary[low + l] = extra[l];
        }
    }
}
