import java.util.ArrayList;
import java.util.List;

public class Solution_0731 {
    //给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> InList = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    InList.add(1);
                } else {
                    InList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(InList);
        }
        return list;
    }
}
