//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-5: BankAccountTest 클래스 작성

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BankAccount ba[] = new BankAccount[5];

        String name;
        String accountNumber;
        int balance;

        //계좌의 소유주, 계좌번호, 잔액을 사용자에게 입력받고 저장하기
        for (int i = 0; i<3; i++){
            System.out.printf("[계좌 %d] 소유주: ",i);
            name = sc.next();
            System.out.printf("[계좌 %d] 계좌번호: ",i);
            accountNumber = sc.next();
            System.out.printf("[계좌 %d] 잔액: ",i);
            balance = sc.nextInt();
            ba[i] = new BankAccount(name, accountNumber, balance);
        }
        //0->2번 계좌로 30,000원 계좌 이체 실행
        System.out.println("계좌 이체 0 ==> 2, 30000원 이체 실행");
        ba[0].transfer(ba[2], 30000);
        for (int i = 0; i < 3; i++)
            System.out.println(ba[i]);
    }
}
