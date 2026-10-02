//작성자: 신지민
//작성일: 9월 10일
//Lab01-3: 배열에서 최대/최소 찾기


public class ArrayMinMaxRandom {
    static void main(String[] args) {
        //필요한 변수 선언
        int[] numbers = new int[10];

        //배열 랜덤 초기화(1~100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }

        //최댓값과 최솟값 초기화
        int max = numbers[0];
        int min = numbers[0];

        //배열탐색 / 최댓값, 최솟값 저장
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        //배열 값 출력
        System.out.print("배열 값: ");
        for (int number : numbers) {
            System.out.printf("%d\t", number);
        }
        System.out.println();

        //결과 출력
        System.out.println("배열의 최댓값: " + max);
        System.out.println("배열의 최솟값: " + min);

        }
    }