public class Heap {
    public static void adjustDown(int[] ary,int size,int index) {
        int leftIndex = 2*index+1;
        if(leftIndex >= size) {
            return;
        }
        while (true) {
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && ary[rightIndex] < ary[leftIndex]) {
                minIndex = rightIndex;
            }
            if (ary[minIndex] >= ary[index]) {
                return;
            } else {
                int tmp = ary[minIndex];
                ary[minIndex] = ary[index];
                ary[index] = tmp;
            }
            index = minIndex;
        }
    }
    public static void adjustUp(int[] ary,int size,int index) {
        if(index == 0) {
            return;
        }
        int parentIndex = (index-1)/2;
        while (true) {
            int minIndex = parentIndex;
            if (ary[minIndex] <= ary[index]) {
                return;
            }
            int tmp = ary[minIndex];
            ary[minIndex] = ary[index];
            ary[index] = tmp;
            index = minIndex;
        }
    }
}
