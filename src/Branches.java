import java.util.ArrayList;

public class Branches {
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(String name, Double initialTransaction) {
        Customer newCustomer = new Customer(name, initialTransaction);
        this.customers.add(newCustomer);
    }

    public void addTransaction(String customerName, Double transactionAmount) {
        customers.forEach(customer -> {
            if (customer.getName().equals(customerName)) {
                customer.getTransactions().add(transactionAmount);
            }
        });
    }
}
