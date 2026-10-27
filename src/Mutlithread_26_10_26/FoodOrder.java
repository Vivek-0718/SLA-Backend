package Mutlithread_26_10_26;

class Kitchen {
    private boolean foodReady = false;

    public synchronized void collectFood() {
        while (!foodReady) {
            try {
                System.out.println("Customer: Food not ready. Waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Customer: Got notification. Collecting food");
        foodReady = false;
    }

    public synchronized void prepareFood() {
        System.out.println("Chef: Preparing food...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        foodReady = true;
        System.out.println("Chef: Food is ready. Calling notify()");
        notify();
    }
}

public class FoodOrder {
    static void main() {
        Kitchen kitchen = new Kitchen();

        Thread customer = new Thread(kitchen::collectFood, "Customer");
        Thread chef = new Thread(kitchen::prepareFood, "Chef");

        customer.start();
        chef.start();
    }
}