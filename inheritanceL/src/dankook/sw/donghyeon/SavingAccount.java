package dankook.sw.donghyeon;

import java.util.Objects;

public class SavingAccount extends Account {
    private double interestRate = 0;

    public SavingAccount(double amount, double interestRate) {
        super(amount);  // 부모 클래스의 생성자
        this.interestRate = interestRate;
    }

    public void generateInterest() {
        super.balance = super.balance + balance * interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
}
