package lesson1;

public class ThreadLook4 {

    public static void main(String[] args) {
        //同时启动20个线程，每一个线程从0，+1的方式加到9999
        for (int i = 0;i < 20;i++) {
            Thread t = new Thread() {
                @Override
                public void run() {//在多线程环境下，即使同一个代码块，也是可以并发并行执行
                    for (int i = 0; i < 10000; i++) {
                        if (i == 9999) {
                            System.out.println(i);
                        }
                    }
                }
            };
            t.start();
        }
    }
}
