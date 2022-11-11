package account;

public class Account {
    private int balance;
    private int maxDeposit;
    private int maxBalance;

    public int getMaxDeposit() {
        return maxDeposit;
    }

    public int getMaxBalance() {
        return maxBalance;
    }

    @Override
    public String toString() {
        return "Current balance: " + balance;
    }

    public boolean withdraw(int amount) {
        if (balance - amount < 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean deposit(int amount) {
        maxDeposit = 10000;
        maxBalance = 100000;
        if (balance + amount > maxBalance || amount > maxDeposit) {
            return false;
        }
        balance += amount;
        return true;
    }
}
