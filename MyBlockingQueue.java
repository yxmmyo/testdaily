package lesson4;

public class MyBlockingQueue<T> {
    //使用数组实现循环队列
    private Object[] queue;
    //存元素的索引
    private int putIndex;
    //取元素的索引
    private int takeIndex;
    //当前存放元素的数量
    private int size;

    public MyBlockingQueue(int len) {
        queue = new Object[len];
    }
    //存放元素
    public synchronized void put(T e) throws InterruptedException {
        //当阻塞等待到被唤醒并再次竞争成功对象锁，恢复后往下执行，条件可能会被其他线程修改
        while (size == queue.length) {
            this.wait();
        }
            //存放到数组中放元素的位置
            queue[putIndex] = e;
            //存放位置超过数组的最大索引，需要取模放在0位置
            putIndex = (putIndex + 1) % queue.length;
            size++;
            notifyAll();
    }

    //取元素
    public synchronized T take() throws InterruptedException {
        while (size == 0) {
            this.wait();
        }
        T t = (T) queue[takeIndex];
        queue[takeIndex] = null;
        takeIndex = (takeIndex+1)%queue.length;
        size--;
        notifyAll();
        return t;
    }

    public synchronized int size() {
        return size;
    }

    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(10);
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        try {
                            queue.put(j);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
}
