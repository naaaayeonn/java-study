/// /////////////////////////////////////////////////
/// 작성자 : 이서연(2513707)
/// 작성일 : 2026-09-10
/// Lab01-4 : 동전 변환 예제
/// /////////////////////////////////////////////////

import java.util.Scanner;

public class MoneyChange{
    public static void main(String[] args) {

        //변수 선언
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
        int money;
        int num;
        Scanner sc = new Scanner(System.in);

        //금액 입력 멘트 출력
        System.out.printf("금액을 입력하세요: ");

        //금액 입력받기
        money = sc.nextInt();

        //금액을 단위별로 몇개인지 계산
        for(int i=0; i<unit.length; i++){
            num = money / unit[i];
            if(num==0)
                continue;
            //지폐일때는 '장'으로, 동전일때는 '개'로 출력
            System.out.printf("%d원%s: %d%s\n",unit[i],(unit[i]>=1000)? "권":"",num,(unit[i]>=1000)? "장":"개");
            money -= unit[i]*num;
        }
    }
}
