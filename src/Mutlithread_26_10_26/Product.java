package Mutlithread_26_10_26;

public class Product {
    private boolean available = false;
    private int product;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        product = value;
        available = true;

        System.out.println("Produced: " + product);
        notify();
    }

    public synchronized void consume(String name) {
        while (!available) {
            try {
                System.out.println(name + " is waiting...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(name + " consumed: " + product);

        available = false;
        notifyAll();
    }
}

class Main {
    public static void main(String[] args) {
        Product resource = new Product();
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                resource.produce(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread consumer1 = new Thread(() -> {
            resource.consume("Consumer 1");
        });

        Thread consumer2 = new Thread(() -> {
            resource.consume("Consumer 2");
        });

        Thread consumer3 = new Thread(() -> {
            resource.consume("Consumer 3");
        });

        consumer1.start();
        consumer2.start();
        consumer3.start();
        producer.start();
    }
}