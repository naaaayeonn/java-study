/// /////////////////////////////////////////////////
/// 작성자 : 이서연(2513707)
/// 작성일 : 2026-09-29
/// Lab3-2 : Book 클래스 작성
/// /////////////////////////////////////////////////

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        Book[] books = new Book[20];

        Scanner sc = new Scanner(System.in);

        // 사용자가 종료(4번)를 선택할 때까지 무한 루프
        while(true){
            System.out.println("=======================");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 출력");
            System.out.println("4. 종료");
            System.out.println("=======================");
            System.out.print("메뉴를 선택하시오: ");
            String menu = sc.next();

            // 4번 입력 시 프로그램 종료 안내 후 반복문 break
            if(menu.equals("4")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            // 선택한 메뉴 번호에 따른 기능 수행
            switch(menu) {
                case "1":
                    sc.nextLine(); // 이전 입력 후 버퍼에 남아있는 \n 비우기
                    System.out.print("책 제목: ");
                    String title = sc.nextLine(); // 공백을 포함한 책 제목 입력
                    System.out.print("책 평점: ");
                    int rate = sc.nextInt();
                    // 정적 변수 Book.count 위치에 새 Book 객체 생성 및 저장
                    books[Book.count] = new Book(title, rate);
                    break;
                case "2":
                    sc.nextLine(); // 버퍼 비우기
                    System.out.print("책 제목: ");
                    String search = sc.nextLine();
                    boolean found = false; // 검색 성공 여부를 기록할 변수 (초기값: false)

                    // 등록된 총 책 개수(Book.count)만큼 순회하며 제목 비교
                    for (int i = 0; i < Book.count; i++) {
                        if (books[i].getTitle().equals(search)) {
                            System.out.println(books[i]);
                            found = true; // 책을 찾았으므로 플래그를 true로 변경
                            break;
                        }
                    }
                    // for문이 끝난 후에도 책을 찾지 못했을 경우 예외 메시지 출력
                    if (!found) {
                        System.out.println("검색하신 책이 없습니다");
                    }
                    break;
                case "3":
                    for (int j = 0; j < Book.count; j++) {
                        System.out.println(books[j]);
                    }
                    break;
                default: // 메뉴 범위(1~4) 외의 잘못된 번호 입력 시 예외 처리
                    System.out.println("잘못된 숫자입니다. 다시 입력하세요.");
                    break;
            }
            }


        }
    }

