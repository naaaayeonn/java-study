/// /////////////////////////////////////////////////
/// 작성자 : 이서연(2513707)
/// 작성일 : 2026-09-10
/// Lab01-2 : 구구단 출력
/// /////////////////////////////////////////////////

import java.util.Scanner;

public class PrintGugudan {
    public static void main(String[] args) {

        //필요한 변수 선언
        int num;
        Scanner sc = new Scanner(System.in);

        //입력을 위한 메시지 출력
        System.out.print("출력할 단을 입력하세요(2~9): ");

        //사용자로부터 하나의 정수를 입력받음
        num = sc.nextInt();

        //입력값이 2~9 사이인지 확인
        if(num < 2 || num > 9)
            //범위를 벗어난 입력값일 경우 오류 메시지를 출력
            System.out.println("잘못된 입력입니다. 2~9 사이의 정수를 입력하세요.");
        else {
            //해당 단의 구구단을 1부터 9까지 출력
            System.out.println("==="+num+"단 ===");
            for(int i=1; i<10; i++){
                System.out.printf("%d * %d = %d\n",num,i,num*i);
            }
        }


    }
}