//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-1: PersonTest 클래스 수정

public class PersonTest {       //합쳐줄 땐 실행하는 class가 메인, 합치려면 Person코드를 붙이고 public은 지우기(한 class안에 public은 하나만)
    public static void main(String args[]) {
        Person p1 = new Person("Park", "010-1111-1111", "02-222-2222", "soda@gmail.com");
        Person p2 = new Person("Seo", "010-2222-2222", "02-333-3333", "beach@gmail.com");
        Person p3 = new Person("HaHa", "010-3333-4444");

        System.out.println(p1); //p1, p2, p3 각각 출력
        System.out.println(p2);
        System.out.println(p3);
    }
}

