package Mutlithread_26_10_26;

public class Bank {
    double balance = 5000;

    synchronized void withdrawMoney(double requestingMoney) {
        if (requestingMoney > this.balance) {
            System.out.println("Insufficient balance");
            return;
        }
        this.balance -= requestingMoney;
        System.out.println("Withdraw "+ requestingMoney +" successful");
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    static void main() throws InterruptedException {
        Bank bank = new Bank();
        Thread c1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bank.withdrawMoney(4000);
            }
        });
        Thread c2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bank.withdrawMoney(4000);
            }
        });
        c1.start();
        c2.start();
        c1.join();
        c2.join();
        System.out.println("Balance: " +bank.getBalance());
    }
}
