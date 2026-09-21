//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-4: StudentTest 클래스 작성

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름: ");
        String name = sc.next();

        System.out.print("학번: ");
        String id = sc.next();

        System.out.print("나이: ");
        int age = sc.nextInt();

        Student s = new Student(name, id, age);
        System.out.println(s);
    }
}
