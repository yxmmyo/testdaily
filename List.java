package linkedList;

public interface List extends Iterable{
    boolean add(Integer e);
    void add(int index,Integer e);
    Integer remove(int index);
    boolean remove(Integer e);
    Integer get(int index);
    Integer set(int index,Integer e);
    boolean isEmpty();
    Integer size();
    void clear();
    int indexOf(Integer e);
    int lastIndexOf(Integer e);
    boolean contains(Integer e);
}
