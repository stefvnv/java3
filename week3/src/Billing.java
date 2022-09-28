/**
 * Lab 2
 * Part 1 - Error Checking
 * <p>
 * Stefana Chiritescu
 * A00282343
 */

public class Billing {
    private String accountName;
    private long accountNo;
    private double balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public Billing(String name, long number, double balance) {
        this.accountName = name;
        this.accountNo = number;
        this.balance = balance;
    }


    /**
     * adds to the balance
     *
     * @return balance
     */
    public double newBill(double amount) {
        if (amount <= 0) {
            System.out.println("sorry, can't charge 0 or less than 0");
        } else {
            System.out.println(amount + " is being added to your balance");
            this.balance = this.balance + amount;
        }
        System.out.println("new bill is " + balance);
        return balance;
    }

    /**
     * takes from the balance
     *
     * @return balance
     */
    public double payment(double amount) {
        if (amount > this.balance) {
            System.out.println("sorry, we cannot allow your account to go into credit (we suck!)");
        } else if (amount <= 0) {
            System.out.println("sorry, can't pay 0 or less than 0");
        } else {
            System.out.println("You are paying " + amount + " off your balance");
            this.balance = this.balance - amount;
        }
        System.out.println("new bill is " + balance);
        return balance;
    }

    @Override
    public String toString() {
        return
                "Name: " + accountName +
                        ", Account Number: " + accountNo +
                        ", Balance: " + balance;
    }

    public void printDetails() {
        System.out.println(toString());
    }
}
