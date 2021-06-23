import java.util.Arrays;
import java.util.Comparator;

public class TestDemo3_0623 {
    public static int[] buublesort1(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        return array;
    }
    public  static <T> void buublesort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                int r = comparator.compare(array[j],array[j+1]);
                if (r > 0) {
                    T t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,9,8,4,7,7,18,4,5,9,25};
        System.out.println(Arrays.toString(buublesort1(array)));

        {
            Teacher[] teachers = {
                    new Teacher("佳乐",20,180,75),
                    new Teacher("家乐",22,170,72),
                    new Teacher("皮特",36,185,80)
            };
        }
    }
}
