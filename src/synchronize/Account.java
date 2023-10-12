package synchronize;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public synchronized void deposit(int amount) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.balance += amount;
        System.out.println("số dư hiện tại là :"+balance);
    }
}
