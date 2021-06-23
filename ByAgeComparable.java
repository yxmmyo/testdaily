package Comparator;

import java.util.Comparator;

public class ByAgeComparable implements Comparator<Teacher> {


    @Override
    public int compare(Teacher o1,Teacher o2) {
        return o1.age - o2.age;
    }
}
