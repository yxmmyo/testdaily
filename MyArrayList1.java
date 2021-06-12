import java.util.Arrays;

public class MyArrayList1 {
    public int[] ary;
    public int usedSize;
    public MyArrayList1() {
        this.ary = new int[10];
        this.usedSize = 0;
    }
    // 打印顺序表
    public void disPlay() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(ary[i]+" ");
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("该位置有误");
            return;
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.ary[i+1] = this.ary[i];
        }
         this.ary[pos] = data;
        this.usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (ary[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (ary[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos > usedSize) {
            return -1;
        }
        return this.ary[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos > usedSize) {
            System.out.println("该位置有误");
            return;
        }
        this.ary[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int tmp = search(toRemove);
        if (tmp == -1) {
            System.out.println("没有找到该数字");
            return;
        }
        for (int i = tmp; i < usedSize-1; i++) {
            this.ary[i] = this.ary[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

    public static void main(String[] args) {
        MyArrayList1 myArrayList1 = new MyArrayList1();
        myArrayList1.add(0,1);
        myArrayList1.add(1,2);
        myArrayList1.add(2,3);
        myArrayList1.add(3,4);
        myArrayList1.add(4,5);
        myArrayList1.add(5,6);
        myArrayList1.add(6,7);
        myArrayList1.add(7,8);
        myArrayList1.disPlay();
        System.out.println(myArrayList1.search(5));
        System.out.println(myArrayList1.getPos(4));
        System.out.println(myArrayList1.contains(9));
        System.out.println(myArrayList1.size());
    }
}
