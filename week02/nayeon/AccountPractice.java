class Account {
    String owner;
    int balance;

    Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int money) {
        balance += money;
    }

    void printBalance() {
        System.out.println(owner + " 잔액: " + balance);
    }
}

public class AccountPractice {
    public static void main(String[] args) {
        Account a1 = new Account("나연", 10000);

        a1.deposit(5000);
        a1.printBalance();
    }
}
