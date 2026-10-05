//작성자: 이유진(2514714)
//작성일: 2026.09.29
//Lab03-1: MovieTest 클래스 작성

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args){
        //영화객체 저장 배열 선언
        Movie[] movies = new Movie[20];
        Scanner scan = new Scanner(System.in);

        //반복문으로 영화 5개 입력받음
        for (int i = 0; i<5; i++){
            System.out.println("-----영화 정보 "+ (i+1) +" 입력-----");
            System.out.print("제목: ");
            String title = scan.nextLine();
            System.out.print("감독: ");
            String director = scan.nextLine();
            System.out.print("개봉 연도: ");
            String year = scan.nextLine();
            System.out.print("평점: ");
            String rate = scan.nextLine();

            //입력받은대로 Movie 객체 생성하여 배열에 저장
            movies[i] = new Movie(title, director, year, rate);


        }
        //입력된 영화 개수(Movie.count)만큼 반복하며 저장된 영화 목록 출력
        for(int i = 0; i<Movie.count; i++){
            System.out.println("["+(i+1)+"]"+movies[i]);
        }
    }
}
