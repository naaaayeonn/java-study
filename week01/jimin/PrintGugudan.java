//작성자: 신지민
//작성일: 9월 10일
//Lab01-2: 구구단 출력

import java.util.Scanner;

public class PrintGugudan {
    static void main(String[] args) {
        //필요한 변수 선언
        int num;
        //입력을 위한 메시지 출력
        System.out.printf("출력할 단을 입력하세요(2~9): ");
        //사용지로부터 2~9 사이의 정수를 입력 받음
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //값의 유효범위 체크, 범위가 오버될 경우 잘못된 입력 메시지 출력
        if (num == 1)
            System.out.println("잘못된 입력입니다. 2~9 사이의 정수를 입력하세요.");
        else if (num > 9)
            System.out.println("잘못된 입력입니다. 2~9 사이의 정수를 입력하세요.");
        //2~9 사이의 정수가 맞다면, for문을 이용하여 구구단 출력
        else {
            System.out.println("=== " + num + "단 ===");
            for (int i = 1; i < 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
        }
    }
}


