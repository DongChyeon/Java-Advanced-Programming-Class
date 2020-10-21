public class Account {
    private static int AccountNo = 0;
    private int ID;
    private double balance;

    public Account() {
        this(0);
    }

    public Account(double balance) {
        AccountNo = AccountNo + 1;
        this.balance = balance;
        ID = AccountNo;
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

    public static void main(String[] args) {
        Account acc = new Account(10000);
        System.out.println(acc.getID() +  " : " + acc.getBalance());
        acc.deposit(5000);
        acc.withdraw(3000);
        System.out.println(acc.getBalance());

        Account [] accArray = new Account[3];
        accArray[0] = new Account(20000);
        accArray[1] = new Account(30000);
        accArray[2] = new Account(40000);

        for (Account a : accArray) {
            System.out.println(a.getID() +  " : " + acc.getBalance());
        }
    }
}
