class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run1()方法正在执行");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run2()方法正在执行");
    }
}
public class TestDemo2_1103 {
    public static void main1(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName()+" main1()方法执行结束");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println(Thread.currentThread().getName()+" main2()方法执行结束");
    }

}
