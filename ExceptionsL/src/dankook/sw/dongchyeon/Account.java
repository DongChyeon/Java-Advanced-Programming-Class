package dankook.sw.dongchyeon;

public class Account {
    private double balance;
    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
