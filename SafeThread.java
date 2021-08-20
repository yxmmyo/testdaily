package lesson3;

public class SafeThread {
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        synchronized (SafeThread.class) {
                            count++;
                        }
                    }
                }
            });
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println(count);
    }
}
