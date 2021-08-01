package sort;

import java.util.Arrays;
import java.util.Random;

public class Solution_0801 {
    public static void insertSort(int[] ary) {
        for(int i = 0;i < ary.length-1;i++) {
            int tmp = ary[i+1];
            int j;
            for (j = i; j >= 0;j--) {
                if(tmp < ary[j]) {
                    ary[j+1] = ary[j];
                } else {
                    break;
                }
            }
            ary[j+1] = tmp;
        }
    }

    public static void bubbleSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            boolean isSwap = true;
            for (int j = 0; j < ary.length-i-1; j++) {
                if(ary[j] > ary[j+1]) {
                    swap(ary,j,j+1);
                    isSwap = false;
                }
            }
            if (isSwap) {
                return;
            }
        }
    }

    public static void selectSort(int[] ary) {
        for (int i = 0; i < ary.length-1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < ary.length-i; j++) {
                if(ary[j] > ary[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(ary,maxIndex,ary.length-i-1);
        }
    }

    public static void swap(int[] ary,int i,int j) {
        int tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }
    public static void main(String[] args) {
        Random random = new Random(24224);
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ary));
        selectSort(ary);
        System.out.println(Arrays.toString(ary));
    }

}
