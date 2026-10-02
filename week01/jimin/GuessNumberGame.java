//작성자: 신지민
//작성일: 9월 10일
//Lab01-6: 숫자 추측 게임


import java.util.Scanner;

public class GuessNumberGame {
    static void main(String[] args) {
        //필요한 변수 선언
        int answer;
        int count = 0;

        //컴퓨터 난수 생성
        int num = (int) (Math.random()*100);

        //반복문 내에서
        while(true) {
            //입력을 위한 메시지 출력
            System.out.println("=== 숫자 맞추기 게임 (1~100) ===");
            System.out.print("숫자를 입력하세요: ");
            //사용자로부터 입력
            Scanner sc = new Scanner(System.in);
            answer = sc.nextInt();
            //정답이 맞지 않으면 비교 후 적절한 메세지 출력
            if (answer > num)
                System.out.println("더 작은 수를 입력하세요.");
            else if (answer < num)
                System.out.println("더 큰 수를 입력하세요.");
            //정답이 맞으면 반복문 빠져나가기
            else
                break;
            count++;
        }
        //축하 메시지와 시도횟수 출력
        System.out.println("정답입니다! 시도 횟수: " + count);


    }
}
