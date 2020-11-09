public class Account {
    private String accountNumber;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;
    private double balance;

    public Account(String accountNumber,
             String customerName,
             String customerEmail,
            String customerPhoneNumber,
            double balance) {
        this.balance = balance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient Funds!");
            return;
        }
        this.balance -= amount;
        System.out.println("Your balance is now " + this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Your balance is now " + this.balance);
    }
}
