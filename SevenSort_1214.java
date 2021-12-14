import java.util.Arrays;
import java.util.Random;

public class SevenSort_1214 {

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
            if (ary[i] <= ary[j]) {
                extra[k++] = ary[i++];
            } else {
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
            ary[low+l] = extra[l];
        }
    }

    public static void quickSort(int[] ary) {
        quickSortFunction(ary,0,ary.length-1);
    }

    private static void quickSortFunction(int[] ary, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partition(ary,left,right);
        quickSortFunction(ary,left,index-1);
        quickSortFunction(ary,index+1,right);
    }

    private static int partition(int[] ary, int left, int right) {
        int i = left;
        int j = right;
        int val = ary[left];
        while (i < j) {
            while (i < j && ary[j] >= val) {
                j--;
            }
            while (i < j && ary[i] <= val) {
                i++;
            }
            swap(ary,i,j);
        }
        swap(ary,left,i);
        return i;
    }

    public static void heapSort(int[] ary) {
        creatHeap(ary);
        for (int i = 0; i < ary.length-1; i++) {
            swap(ary,0,ary.length-i-1);
            shiftDown(ary,ary.length-i-1,0);
        }
    }

    private static void creatHeap(int[] ary) {
        for (int i = (ary.length-2)/2; i >= 0 ; i--) {
            shiftDown(ary,ary.length,i);
        }
    }

    private static void shiftDown(int[] ary, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int maxIndex = left;
            int right = left + 1;
            if (right < size) {
                if (ary[right] > ary[left]) {
                    maxIndex = right;
                }
            }
            if (ary[index] >= ary[maxIndex]) {
                break;
            }
            swap(ary,maxIndex,index);

            index = maxIndex;
            left = 2 * index + 1;
        }
    }

    public static void shellSort(int[] ary) {
        int gap = ary.length;
        while (gap > 1) {
            insertSortWithGap(ary,gap);
            gap = gap / 2;
        }
        insertSortWithGap(ary,1);
    }

    private static void insertSortWithGap(int[] ary, int gap) {
        for (int i = 1; i < ary.length; i++) {
            int val = ary[i];
            int j = i - gap;
            for (; j >= 0 && ary[j] > val; j -= gap) {
                ary[j+gap] = ary[j];
            }
            ary[j+gap] = val;
        }
    }

    public static void insertSort(int[] ary) {
        for (int i = 1; i < ary.length; i++) {
            int val = ary[i];
            int j = i-1;
            for (; j >= 0 && ary[j] > val; j--) {
                ary[j+1] = ary[j];
            }
            ary[j+1] = val;
        }
    }

    public static void selectSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < ary.length-i; j++) {
                if (ary[j] > ary[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(ary,maxIndex,ary.length-i-1);
        }
    }

    public static void bubbleSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            for (int j = 0; j < ary.length-i-1; j++) {
                if (ary[j] > ary[j+1]) {
                    swap(ary,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] ary, int i, int j) {
        int tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("排序前");
        System.out.println(Arrays.toString(array));

        shellSort(array);

        System.out.println("排序后");
        System.out.println(Arrays.toString(array));
    }
}
