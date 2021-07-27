import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestDemo_0727 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int j = i;
            for (int k = 1; k <= j; k++) {
                System.out.print(k+"*"+j+"="+k*j+"    ");
                if (k*j <= 9) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        List<Integer> list = new ArrayList<>();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }
}
