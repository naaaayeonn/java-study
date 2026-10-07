/// /////////////////////////////////////////////////
/// 작성자 : 이서연(2513707)
/// 작성일 : 2026-09-17
/// Lab02-5 : BankAccount 클래스 작성
/// /////////////////////////////////////////////////

import java.util.Scanner;

class BankAccount{
    private String owner;
    private String accountNumber;
    private double balance;

    public BankAccount(String owner, String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
        }
        else{
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(amount+"원이 출금되었습니다. 현재 잔액: "+balance+"원");
        }
        else{
            System.out.println("잔액 부족 또는 잘못된 금액입니다.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void showAccountInfo(){
        System.out.println("계좌번호: "+accountNumber+", 예금주: "+owner+", 잔액: " + balance + "원");
    }
    public void transfer(BankAccount otherAccount, int amount){
        this.withdraw(amount);
        otherAccount.deposit(amount);
    }

    @Override
    public String toString() {
        return "["+accountNumber+"("+owner+")]님의 잔액: "+balance;
    }

}




public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount ba[] = new BankAccount[5];
        String name;
        String accountNumber;

        int balance;
        for (int i = 0; i < 3; i++) {
            System.out.printf("[계좌 %d] 소유주: ", i);
            name = sc.next();
            System.out.printf("[계좌 %d] 계좌번호: ", i);
            accountNumber = sc.next();
            System.out.printf("[계좌 %d] 잔액: ", i);
            balance = sc.nextInt();
            ba[i] = new BankAccount(name, accountNumber, balance);
        }
        // 계좌 이체
        System.out.println("계좌 이체 0 ==> 2, 30000원 이체 실행");
        ba[0].transfer(ba[2], 30000);

        for (int i = 0; i < 3; i++)
            System.out.println(ba[i]);
    }
}
