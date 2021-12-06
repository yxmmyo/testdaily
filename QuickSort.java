package sevenSort;

public class QuickSort {
    public static void quickSort(int[] ary) {
        quickSortFunction(ary,0,ary.length-1);
    }

    private static void quickSortFunction(int[] ary, int left, int right) {
        if (left == right) {
            return;
        }
        if (left > right) {
            return;
        }
        int index = partition(ary,left,right);
        quickSortFunction(ary,left,index-1);
        quickSortFunction(ary,index+1,right);
    }

    private static int partition(int[] ary, int left, int right) {
        int i = left;
        int j = right;
        int val = ary[i];
        while (i < j) {
            while (i < j && ary[j] >= val) {
                j--;
            }
            while (i < j && ary[i] <= val) {
                i++;
            }
            swap(ary,i,j);
        }
        swap(ary,i,left);
        return i;
    }

    private static void swap(int[] ary, int i, int j) {
        int tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }
}
