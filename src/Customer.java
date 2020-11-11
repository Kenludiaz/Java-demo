import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public String getName() {
        return name;
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }
    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions.add(transaction);
    }

    public double getTransaction(int index) {
       return this.transactions.get(index);
    }
}
