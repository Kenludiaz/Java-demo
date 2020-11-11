import java.util.ArrayList;

public class Branches {
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(String name, Double initialTransaction) {
        Customer newCustomer = new Customer(name, initialTransaction);
        this.customers.add(newCustomer);
    }
    private Double getInitialTransaction(int index) {
        if (index == -1) {
            return null;
        }
        return customers.get().getTransaction(index);
    }

    public Double getTransaction(String customerName) {
        int index = customers.indexOf()
    }
    public void addTransaction(Double transaction) {
        this.transactions.add(transaction);
    }
}
