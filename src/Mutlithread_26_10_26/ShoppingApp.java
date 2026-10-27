package Mutlithread_26_10_26;

public class ShoppingApp {
    static Thread orderThread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("started -> processing order...");
            try {
                System.out.println("Going to sleep for 2 seconds...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("order processing completed");
        }
    });

    static void main() {
        System.out.println("Thread status: " + orderThread.getState());
        orderThread.start();
        System.out.println("Thread status: " + orderThread.getState());
    }
}
