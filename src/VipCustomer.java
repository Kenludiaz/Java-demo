public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        this.name = name;
    }
    public VipCustomer() {
        this("Default", "Default@gmail.com", 1000.00);
    }
    public VipCustomer(String name, String emailAddress) {
        this(name, emailAddress, 1000.00);
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
