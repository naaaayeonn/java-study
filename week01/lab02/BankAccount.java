//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-5: BankAccount 클래스 작성

public class BankAccount {
    //필드 작성
    String owner;   //예금주
    String accountNumber;   //계좌번호
    double balance; //잔액

    //생성자 작성
    public BankAccount(String o, String a, double b){
        this.owner = o;
        this.accountNumber = a;
        this.balance = b;
    }
    //입금 메서드
    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재잔액: " + this.balance);
    }
    //출금 메서드
    public void withdraw(double amount){
        this.balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 현재잔액: " + this.balance);
    }

    // 계좌 이체 메서드
    public void transfer(BankAccount otherAccount, double amount) {
        this.withdraw(amount);       // 현재 계좌에서 출금 (출금 메시지 출력 포함)
        otherAccount.deposit(amount);
    }
    //잔액 조회 메서드
    public double getBalance(){
        return this.balance;
    }
    //계좌 정보 출력
    public String showAccountinfo(){
        return "[" + accountNumber + "(" + owner + ")]님의 잔액: " + this.balance;
    }
    
    //toString 메소드 작성
    @Override
    public String toString() {
        return "[" + accountNumber + "(" + owner + ")]님의 잔액: " + this.balance;
    }
}