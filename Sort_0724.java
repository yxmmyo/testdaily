import java.util.Arrays;
import java.util.Random;

public class Sort_0724 {

    public static void inSertSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            int key = ary[i+1];
            int j;
            for (j = i; j >= 0; j--) {
                if (key < ary[j]) {
                    ary[j+1] = ary[j];
                }else {
                    break;
                }
            }
            ary[j+1] = key;
        }
    }

    public static int[] buildArray() {
        Random random = new Random(2024257);
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = random.nextInt(100);
        }
        return ary;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void selectSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < ary.length-i; j++) {
                if (ary[j] > ary[maxIndex]){
                    maxIndex = j;
                }
            }
            int tmp = ary[ary.length-i-1];
            ary[ary.length-i-1] = ary[maxIndex];
            ary[maxIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] ary = buildArray();
        System.out.println(Arrays.toString(ary));
        shellSort(ary);
        System.out.println(Arrays.toString(ary));
    }

    public static void heapSort(int[] ary) {
        creatHeap(ary,ary.length);
        for (int i = 0; i < ary.length-1; i++) {
            int tmp = ary[0];
            ary[0] = ary[ary.length-i-1];
            ary[ary.length-i-1] = tmp;
            adjustDown(ary,ary.length-i-1,0);
        }
    }

    private static void adjustDown(int[] ary, int size, int index) {
        while (2*index+1 < size) {
            int maxIndex = 2*index+1;
            if (maxIndex+1 < size && ary[maxIndex+1] > ary[maxIndex]) {
                maxIndex++;
            }
            if (ary[index] >= ary[maxIndex]) {
                break;
            }
            int tmp = ary[index];
            ary[index] = ary[maxIndex];
            ary[maxIndex] = tmp;
            index = maxIndex;
        }
    }

    private static void creatHeap(int[] ary, int size) {
        for (int i = (size-2)/2; i >= 0; i--) {
            adjustDown(ary,size,i);
        }
    }
    public static void insertSortWithGap(int[] ary,int gap) {
        for (int i = gap; i < ary.length; i++) {
            int key = ary[i];
            int j;
            for (j = i-gap; j >= 0; j -= gap) {
                if (ary[j] > key) {
                    ary[j+gap] = ary[j];
                }else {
                    break;
                }
            }
            ary[j+gap] = key;
        }
    }
    public static void shellSort(int[] ary) {
        int  gap = ary.length/2;
        while (true) {
            insertSortWithGap(ary,gap);
            if (gap == 1) {
                break;
            }
            gap = gap/2;
        }
    }
}
