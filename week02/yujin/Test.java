//작성자 : 이유진(2514714)
//작성일 : 2026.09.10
//Lab01-ex
import java.util.Scanner;

public class Test{
    static void main(String[] args) {
        //필요한 변수 선언
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");   //사용자에게 메세지 출력
        num = sc.nextInt();

        //짝, 홀수 판별
        if (num % 2 == 0)
            System.out.println("짝수입니다");
        else
            System.out.println("홀수입니다");
    }

}
