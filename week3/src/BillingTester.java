/**
 * Lab 2
 * Part 1 - Error Checking
 *
 * Stefana Chiritescu
 * A00282343
 */

public class BillingTester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Billing b1 = new Billing("John", 456789, 50);
        System.out.println("John your balance is " + b1.getBalance());
        b1.newBill(100);
        b1.payment(10);
        b1.newBill(100);
        b1.payment(500);
        b1.newBill(-50);
        b1.payment(-100);
    }
}
