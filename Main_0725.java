import java.util.Arrays;
import java.util.Random;

public class Main_0725 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ary = new int[10];
        for (int i = 0; i < 10; i++) {
            ary[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ary));
        Sort_0725.分割(ary);
        System.out.println(Arrays.toString(ary));
    }
}
