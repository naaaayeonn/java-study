class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

public class StudentPractice {
    public static void main(String[] args) {
        Student s1 = new Student("나연", 20);
        Student s2 = new Student("유나", 21);

        s1.introduce();
        s2.introduce();
    }
}
