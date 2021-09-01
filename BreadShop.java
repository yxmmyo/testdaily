package lesson4;

public class BreadShop {

    private static int COUNT;

    //消费者
    public static class Consumer implements Runnable{
        private String name;

        public Consumer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            //一直消费
            try {
                while (true) {
                    synchronized (BreadShop.class) {
                        //库存到达下限，不能继续消费，需要阻塞等待
                        if (COUNT == 0) {
                            BreadShop.class.wait();//释放对象锁
                        } else {
                            //库存大于0，允许消费
                            System.out.printf("消费者%s消费了一个面包\n",name);
                            COUNT--;
                            //通知BreadShop.class.wait();代码进入阻塞的线程
                            BreadShop.class.notifyAll();
                            Thread.sleep(1000);
                        }
                        Thread.sleep(100);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //生产者
    public static class Producer implements Runnable {
        private String name;

        public Producer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (BreadShop.class) {
                        if (COUNT > 97) {
                            BreadShop.class.wait();
                        } else {
                            System.out.println("生产者"+name+"生产了3个面包");
                            COUNT+=3;
                            BreadShop.class.notifyAll();
                            Thread.sleep(1000);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        //同时启动20个消费者线程
        Thread[] consumer = new Thread[20];
        for (int i = 0; i < 20; i++) {
            consumer[i] = new Thread(new Consumer(String.valueOf(i)));
        }
        //同时启动10个生产者线程
        Thread[] producer = new Thread[10];
        for (int i = 0; i < 10; i++) {
            producer[i] = new Thread(new Producer(String.valueOf(i)));
        }

        for (int i = 0; i < 20; i++) {
            consumer[i].start();
        }
        for (int i = 0; i < 10; i++) {
            producer[i].start();
        }
    }
}
