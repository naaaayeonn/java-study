//작성자: 이유진(2514714)
//작성일: 2026.09.29
//Lab03-1: ContactsTest 클래스 작성

import java.util.Scanner;

public class ContactsTest {
    public static void main(String[] args){
        //연락처 객체 저장 배열 생성(최대 20개)
        Contacts[] contacts = new Contacts[20];
        Scanner scan = new Scanner(System.in);

        System.out.println("연락처를 입력하시오.(종료하려면 -1 입력)");

        //최대 10명까지 연락처 저장
        while (Contacts.count<10){
            System.out.print("이름 전화번호 이메일 입력: ");
            String input = scan.next(); //첫번째 단어 읽기

            //입력이 -1과 같을 시 반복문 종료
            if (input.equals("-1")) {
                break;}

            String name = input;    // 첫번째 입력받은 값 = 이름
            String tel = scan.next();   //띄어쓰기 다음 값들을 각각 tel, email에 저장
            String email = scan.next();
            contacts[Contacts.count] = new Contacts(name, tel, email);
        }
        System.out.println("지인들의 수는 " + Contacts.count + "입니다.");

        //등록된 연락처가 0개 이상일 때 실행
        if (Contacts.count > 0) {
            System.out.print("검색할 이름 입력: ");
            String searchName = scan.next();

            int i = 0;
            //반복문으로 일치하는 연락처 검색
            for (i = 0; i < Contacts.count; i++) {
                if (contacts[i].name.equals(searchName)) {
                    System.out.println("검색 결과: " + contacts[i]);
                    break;
                }
            }
            //끝까지 돌았을 때 : i와 Contacts.count가 같아짐
            if (i == Contacts.count) {
                System.out.println("일치하는 연락처가 없습니다.");
            }
        }

    }
}
