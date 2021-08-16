package lesson1;

public class InnerClass {
    public static void main(String[] args) {
        //匿名内部类:重定义了一个A的子类，重写了方法
        A a = new A() {
            @Override
            public void X() {
                System.out.println("Y");
            }
        };
        a.X();
    }
    public static class A {
        public  void X() {
            System.out.println("A");
        }
    }
}
