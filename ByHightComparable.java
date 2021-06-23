package Comparator;

import java.util.Comparator;

public class ByHightComparable implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.hight-o2.hight;
    }
}
