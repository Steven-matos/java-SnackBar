package snackBar;

public class Main {

    private static void data() {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());

        c1.buySnacks(s4.getTotalCost(3));
        s4.sellSnack(3);
        System.out.println(c1.getName() + "'s Cash on Hand: $" + c1.getCashInHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

        c1.buySnacks(s3.getTotalCost(1));
        s3.sellSnack(1);
        System.out.println(c1.getName() + "'s Cash on Hand: $" + c1.getCashInHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

        c2.buySnacks(s4.getTotalCost(2));
        s4.sellSnack(2);
        System.out.println(c2.getName() + "'s Cash on Hand: $" + c2.getCashInHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());

        c1.setCashInHand(10.00);
        System.out.println(c1.getName() + "'s Cash on Hand: $" + c1.getCashInHand());

        c1.buySnacks(s2.getTotalCost(1));
        s2.sellSnack(1);
        System.out.println(c1.getName() + "'s Cash on Hand: $" + c1.getCashInHand());
        System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());

        s3.setQuantity(12);
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());

        c2.buySnacks(s3.getTotalCost(3));
        s3.sellSnack(3);
        System.out.println(c2.getName() + "'s Cash on Hand: $" + c2.getCashInHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
    }

    public static void main(String[] args) {
        data();
    }
}