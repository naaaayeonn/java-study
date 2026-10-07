//작성자: 이유진(2514714)
//작성일: 2026.09.29
//Lab03-1: BookTest 클래스 작성

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        //책 객체 저장 배열 생성(최대 20개)
        Book[] books = new Book[20];
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("======================");
            System.out.println("1. 책 등록\n2. 책 검색\n3. 모든 책 출력\n4. 종료");
            System.out.println("======================");

            System.out.print("메뉴선택: ");
            int menu = scan.nextInt();
            scan.nextLine();    //버퍼에 남아있는 엔터 제거

            if (menu == 4){
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            if (menu == 1){
                System.out.print("책 제목: ");
                String title = scan.nextLine();

                System.out.print("책 평점: ");
                String score = scan.nextLine();
                // 입력받은 정보로 Book 객체 생성하여 배열에 저장 (생성자 내부에서 Book.count 증가)
                books[Book.count] = new Book(title, score);
            }
            if(menu == 2){
                int i = 0;
                System.out.print("책 제목: ");
                String title = scan.nextLine();
                for(i=0; i<Book.count; i++){
                    if (books[i].title.equals(title)){
                        System.out.println(books[i]);   // toString() 자동 호출
                        break;  // 찾으면 반복문 탈출
                    }
                }
                //끝까지 다 돌았는데 못찾은 경우(끝까지 돌면 i=Book.count가 됨)
                if (Book.count == i){ System.out.println("일치하는 책이 없습니다.");}
                }


            if (menu ==3){
                if (Book.count == 0){System.out.println("등록된 책이 없습니다.");}
                else{
                    for (int i=0; i<Book.count; i++){    //등록된 책 개수만큼 반복
                        System.out.println(books[i]);
                    }
                }
            }

        }
    }
}
