import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BA {
    private double balance;
    private String accountNumber;

    private Lock lock;

    public BA(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public boolean deposit(double amount) {
        boolean status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                    status = false;
                } finally {
                    lock.unlock();
                }
            }

        } catch (InterruptedException e) {

            }
        System.out.println("Transaction status = " + status);
        return status;
    }


    public boolean withdraw(double amount) {

        boolean  status = false;

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }

            }
        } catch (InterruptedException e) {

        }
        System.out.println("Transaction status = " + status);
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("The account number is " + getAccountNumber());
    }
}
