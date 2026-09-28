//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-4: Student 클래스 작성

public class Student {
    //필드 선언
    private String name;
    private String studentID;
    private int age;

    //생성자 정의
    public Student(String n, String s, int a){
        this.name = n;
        this.studentID = s;
        this.age = a;
    }

    //모든 필드에 대하여 접근자, 설정자 메소드 작성 (사용하지 않더라도 작성)
    public String getName() { return this.name; }
    public void setName(String n) { this.name = n; }

    public String getStudentID() { return this.studentID; }
    public void setStudentID(String s) { this.studentID = s; }

    public int getAge() { return this.age; }
    public void setAge(int a) { this.age = a; }

    //toString 메소드 작성
    @Override
    public String toString() {
        return "학생정보 [이름 = " + this.name + ", 학번 = " + this.studentID + ", 나이 = " + age + "]";
    }
}
