package generic_class;

public class Person<T> {
    public String name;
    public int age;
    T special;
    public Person(String name,int age,T special) {
        this.name = name;
        this.age = age;
        this.special = special;
    }
}
