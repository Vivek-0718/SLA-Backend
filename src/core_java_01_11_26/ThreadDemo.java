package core_java_01_11_26;

class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new NumberTask(), "Thread-1");
        Thread t2 = new Thread(new NumberTask(), "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads finished");
    }
}
