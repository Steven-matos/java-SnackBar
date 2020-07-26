package snackBar;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashInHand;

    public Customer(String name, double cashInHand) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashInHand = cashInHand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashInHand() {
        return cashInHand;
    }

    public void setCashInHand(double cash) {
        this.cashInHand = this.cashInHand + cash;
    }

    public void buySnacks(double cost) {
        this.cashInHand = this.cashInHand - cost;
    }
}