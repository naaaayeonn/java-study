//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-1 : 직원 관리 시스템 테스트

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1, e2;
        e1 = new FullTimeEmployee("홍길동", "개발팀", 3000000);
        e2 = new PartTimeEmployee("김철수", "디자인팀", 20000, 80);
        System.out.println(e1);
        System.out.println("급여: " + e1.calculatePay());
        System.out.println(e2);
        System.out.println("급여: " + e2.calculatePay());
    }
}
