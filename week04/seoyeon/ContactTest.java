/// /////////////////////////////////////////////////
/// 작성자 : 이서연(2513707)
/// 작성일 : 2026-09-29
/// Lab2-2 : Contacts 클래스 작성
/// /////////////////////////////////////////////////
import java.util.Scanner;

public class ContactsTest {
    public static void main(String[] args){
        Contacts[] contacts = new Contacts[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("연락처를 입력하시오.(종료하려면 -1 입력)");
        // 사용자가 '-1'을 입력할 때까지 연락처 정보를 계속 입력받는 반복문
        while(true){

            System.out.print("이름 전화번호 이메일 입력: ");
            String name = sc.next();

            // '-1' 입력 시 연락처 입력 반복문 탈출
            if(name.equals("-1")){
                break;
            }
            String tel = sc.next();
            String email = sc.next();
            // 현재 Contacts.count 인덱스 위치에 객체 생성 및 저장
            contacts[Contacts.count] = new Contacts(name, tel, email);
        }
        // 등록 완료 후 총 지인 수(Contacts.count) 출력
        System.out.println("지인들의 수는 "+Contacts.count+"입니다");
        System.out.print("검색할 이름 입력: ");
        String search = sc.next();
        // 저장된 연락처 개수(Contacts.count)만큼 순회하며 이름 비교 및 검색
        for(int i=0; i<Contacts.count; i++){
            if(contacts[i].getName().equals(search)){
                System.out.println("검색결과: "+contacts[i]);
        }

        }
    }
}
