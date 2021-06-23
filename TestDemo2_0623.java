import java.util.Comparator;

class ByHightComparable implements Comparator<Teacher> {


    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.hight-o2.hight;
    }
}
class ByWeightComparable implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.weight-o2.weight;
    }
}
public class TestDemo2_0623 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("家乐",22,180,67);
        Teacher t2 = new Teacher("佳乐",20,175,69);
        ByHightComparable byHightComparable = new ByHightComparable();
        ByWeightComparable byWeightComparable = new ByWeightComparable();
        int r;
        r = byHightComparable.compare(t1,t2);
        System.out.println(r);
        r = byWeightComparable.compare(t1,t2);
        System.out.println(r);
    }
}
