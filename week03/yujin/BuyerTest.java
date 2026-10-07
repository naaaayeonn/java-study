//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-5 : 쇼핑몰 구매 시뮬레이션

import java.util.Scanner;

public class BuyerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 시작 금액 입력
        System.out.print("보유 금액을 입력하세요: ");
        int money = sc.nextInt();
        Buyer buyer = new Buyer(money);
// 상품 목록
        Item[] items = {
                new Food("비빔밥", 9000),
                new Food("라면", 6000),
                new Food("김밥", 5000),
                new Book("자바야 놀자", 20000, "오라클"),
                new Movie("케이팝데몬헌터스", 15000, "매기 강")};
        while (true) {
            System.out.println("===== 상품 목록 =====");
            System.out.println("0. Food: 비빔밥(9000원)\n" +
                    "1. Food: 라면(6000원)\n" +
                    "2. Food: 김밥(5000원)\n" +
                    "3. Book: 자바야 놀자 - 오라클(20000원)\n" +
                    "4. Movie: 케이팝데몬헌터스 - 매기 강(15000원)\n" + "-1. 종료");
            System.out.print("구매할 상품 번호를 입력하세요: ");
            int num = sc.nextInt();

            if (num == -1){
                System.out. println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매 개수를 입력하세요: ");
            int cnt = sc.nextInt();

            buyer.buy(items[num], cnt);

            System.out.println("----------------");
        }
    }
}
