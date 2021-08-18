package lesson2;

public class ThreadTest2 {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
            }
        });
        t.start();
        System.out.println("main");
    }
}
