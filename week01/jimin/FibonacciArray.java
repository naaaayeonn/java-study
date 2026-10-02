//작성자: 신지민
//작성일: 9월 10일
//Lab01-5: 피보나치 수열


import java.util.Scanner;

public class FibonacciArray {
    static void main(String[] args) {
        //필요한 변수 선언
        Scanner sc = new Scanner(System.in);
        int num = 0;

        //사용자로부터 입력 받기(출력문+입력)
        System.out.print("출력할 항의 개수를 입력하세요: ");
        num = sc.nextInt();

        //입력받은 항의 개수를 크기로 배열 생성
        int[] fib = new int[num];

        //초기값 설정(fib[0]=1, fib[1]=1)
        fib[0] = 1;
        fib[1] = 1;

        //배열에 피보나치 값 저장(인덱스2부터 마지막 항까지)
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        //피보나치 수열 결과 출력
        System.out.print("피보나치 수열: ");
        for (int i = 0; i <fib.length; i++) {
            System.out.printf("%d", fib[i]);
            System.out.print(" ");
        }
    }
}
