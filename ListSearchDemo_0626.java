import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
 class Person {
    public String name;
    public int id;
    Person(String name,int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }
}
public class ListSearchDemo_0626 {

    public static void main(String[] args) {
        Person p1 = new Person("家乐",1);
        Person p2 = new Person("佳乐",1);
        List<Person> list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.contains(p2));
        System.out.println(list.equals(p2));
        System.out.println(list.indexOf(p2));
    }
}
