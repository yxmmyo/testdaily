public class Sort_0725 {
    public static void quickSort(int[] ary) {
        quickSortInternal(ary,0,ary.length-1);
    }

    public static void quickSortInternal(int[] ary,int lowIndex,int highIndex) {
        int size = highIndex-lowIndex+1;
        if (size <= 1) {
            return;
        }
        int keyIndex = partition(ary,lowIndex,highIndex);
        quickSortInternal(ary,lowIndex,keyIndex-1);
        quickSortInternal(ary,keyIndex+1,highIndex);
    }

    public static int partition(int[] ary,int lowIndex,int highIndex) {
        return partition挖坑(ary,lowIndex,highIndex);
    }

    public static int partition挖坑(int[] ary,int lowIndex,int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        int key = ary[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && ary[rightIndex] >= key) {
                rightIndex--;
            }
            ary[leftIndex] = ary[rightIndex];
            while (leftIndex < rightIndex && ary[leftIndex] <= key) {
                leftIndex++;
            }
            ary[rightIndex] = ary[leftIndex];
        }
        ary[leftIndex] = key;
        return leftIndex;
    }
    public static int partitionHover(int[] ary,int lowIndex,int highIndex) {
        int leftIndex = lowIndex;
        int rightIndex = highIndex;
        int key = ary[lowIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && ary[rightIndex] >= key) {
                rightIndex--;
            }
            while (leftIndex < rightIndex && ary[leftIndex] <= key) {
                leftIndex++;
            }
            swap(ary,leftIndex,rightIndex);
        }
        swap(ary,lowIndex,leftIndex);
        return leftIndex;
    }
    public static void swap(int[] ary,int index1,int index2) {
        int tmp = ary[index1];
        ary[index1] = ary[index2];
        ary[index2] = tmp;
    }

    public static void 分割(int[] ary) {
        int leftIndex = 0;
        int rightIndex = ary.length-1;
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && ary[leftIndex] % 2 != 0) {
                leftIndex++;
            }
            while (leftIndex < rightIndex && ary[rightIndex] % 2 == 0) {
                rightIndex--;
            }
            swap(ary,leftIndex,rightIndex);
            leftIndex++;
            rightIndex--;
        }
    }
}
