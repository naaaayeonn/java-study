//작성자: 신지민
//작성일: 9월 10일
//Lab01-1: 자릿수별 숫자 비교
import java.util.Scanner;
public class NumberTest {
    static void main(String[] args) {
        //필요한 변수 선언
        int num;

        //입력을 위한 메시지 출력
        System.out.printf("두 자리 수 정수 입력(10~99): ");

        //사용자로부터 두 자리 정수를 입력 받음
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //값의 유효범위 체크, 범위가 오버될 경우 잘못된 입력 메시지 출력
        if(num < 10)
            System.out.println("잘못된 입력입니다. 10~99 사이의 정수를 입력하세요.");
        else if (num > 99)
            System.out.println("잘못된 입력입니다. 10~99 사이의 정수를 입력하세요.");

        //두 자리 수가 맞다면, 십의 자리와 일의 자리를 분리, 판단 및 결과 출력
        else
            if((int) num / 10 == (int) num % 10)
                System.out.println("십의 자리와 일의 자리가 같습니다.");
            else
                System.out.println("십의 자리와 일의 자리가 다릅니다.");

    }
}
