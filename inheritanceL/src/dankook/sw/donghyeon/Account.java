package dankook.sw.donghyeon;

public class Account {
    public static int AccountNo = 0;
    private int ID;
    protected double balance;

    public Account() {
        this(0);
        setAccountID();
    }

    public Account(double amount) {
        this.balance = amount;
        setAccountID();
    }

    public double getBalance() {
        return balance;
    }

    public int getID() {
        return ID;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    private void setAccountID() {
        AccountNo = AccountNo + 1;
        ID = AccountNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", balance=" + balance +
                '}';
    }
}
