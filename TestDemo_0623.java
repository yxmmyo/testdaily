class Teacher implements Comparable<Teacher>{
    String name;
    int age;
    int hight;
    int weight;

    public Teacher(String name, int age, int hight,int weight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.weight = weight;
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.age < o.age) {
            return -1;
        }else if (this.age == o.age) {
            return 0;
        }else {
            return 1;
        }
    }
}
public class TestDemo_0623 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("家乐",22,180,67);
        Teacher t2 = new Teacher("佳乐",20,175,60);
        int ret = t1.compareTo(t2);
        if (ret < 0 ) {
            System.out.println("家乐小于佳乐");
        }else  if (ret == 0) {
            System.out.println("家乐等于佳乐");
        }else {
            System.out.println("家乐大于佳乐");
        }
    }
}
