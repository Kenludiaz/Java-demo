public class Main {


    public static void main(String[] args) {
        BA account = new BA("12345-678", 1000.00);

        Thread t1 =  new Thread() {
            @Override
            public void run() {
                account.deposit(300);
                System.out.println("Thread 1: Deposited");
                account.withdraw(50);
                System.out.println("Thread 1: Withdrew");
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                account.deposit(203.75);
                System.out.println("Thread 2: Deposited");
                account.withdraw(100);
                System.out.println("Thread 2: Withdrew");
            }
        };
        t1.start();
        t2.start();

        System.out.println("Current Balance is "+ account.getBalance());


    }
}
