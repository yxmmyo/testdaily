package lesson1;

public class ThreadLook3 {

    public static void main(String[] args) {
        //第一种创建线程的方法：使用Thread类，重写run()
        //main线程中：new了一个线程对象,匿名内部类Thread子类重写run()
        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {

                }
            }
        };
        //线程要启动，必须使用start()====>告诉系统调度本线程
        //申请系统调度，线程由创建态-->就绪态，什么时候变为运行态？由系统决定
        t.start();
        while (true) {//main线程空跑

        }
    }
}
