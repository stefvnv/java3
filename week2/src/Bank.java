import java.sql.SQLOutput;
import java.util.Scanner;

public class Bank {

    private String accountNo;
    private int balance;

    public Bank() {
        this.accountNo = null;
        this.balance = 0;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


    //get their balance
    public int getBalance() {
        return balance;
    }


    //lodge money
    public int logde(int amount) {
        this.balance = this.balance - amount;

        return balance;
    }


    //withdraw money
    public int withdraw(int amount) {
        this.balance = this.balance + amount;

        return balance;
    }
}
