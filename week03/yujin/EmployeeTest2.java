//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-2 : 직원 관리 시스템 확장

public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee[] employees = { // 여러 직원 객체 생성을 위한 적절한 타입 명시
                new FullTimeEmployee("홍길동", "개발팀", 3000000),
                new PartTimeEmployee("김철수", "디자인팀", 20000, 80),
                new FullTimeEmployee("이영희", "인사팀", 2800000),
                new PartTimeEmployee("박민수", "영업팀", 25000, 100),
                new FullTimeEmployee("최지우", "기획팀", 3200000)
        };
        System.out.println("===== 직원 급여 명단 =====");
        double totalPay = 0;

        for (int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
            System.out.println("이번 달 급여: " + employees[i].calculatePay() + "원");
            System.out.println("------------------------");
            totalPay += employees[i].calculatePay();
        }

        System.out.printf("총 인건비: %.1f원", totalPay);
    }
}