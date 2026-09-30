//작성자: 신지민
//작성일: 9월 10일
//Lab01-4: 동전 변환 예제


import java.util.Scanner;

public class MoneyChange {
    static void main(String[] args) {
        //필요한 변수와 배열 선언
        int money;
        int[] won = new int[9];
        int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        //입력을 위한 메시지 출력
        System.out.print("금액을 입력하세요: ");

        //사용자로부터 금액을 입력 받음
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();

        //반복문을 사용하여 각 단위별로 몇장(개)인지 계산함
        for (int i = 0; i< unit.length; i++){
            won[i] = money / unit[i];
            money %= unit[i];

            //결과 출력 (지폐의 단위는 '원권'과 '장', 동전의 단위는 '원'과 '개'로 함.)
            if (won[i] > 0)
                if (unit[i]>=1000)
                    System.out.println(unit[i] + "원권: " + won[i] + "장");
                else
                    System.out.println(unit[i] + "원: " + won[i] + "개");
            }
        }
    }