package linkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(20);
        list.add(21);
        list.add(22);
        System.out.println(list);
        list.add(0,19);
        System.out.println(list);
        list.add(4,23);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        list.add(6,30);
        System.out.println(list);
        /*list.remove(2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove((Integer)20);
        System.out.println(list);
        System.out.println(list.get(1));*/
        System.out.println(list.isEmpty());
        list.set(1,2);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(5);
        System.out.println(list.size());
        System.out.println(list.contains(5));
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
