//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-1: Person 클래스 작성

public class Person {
    //field
    String name;
    String mobile;
    String office;
    String email;

    //constructor
    public Person(String n, String m, String o, String e){
        this.name = n;
        this.mobile = m;
        this.office = o;
        this.email = e;
    }

    public Person(String n, String m){
        this.name = n;
        this.mobile = m;
        this.office = "None";
        this.email = "None";
    }

    //method
    @Override
    public String toString() {      //public하게 접근할 수 있고 return값을 String으로 받는다.
        return "Person [name=" + this.name + ", moblie=" + this.mobile + ", office=" + this.office + ", email=" + this.email + "]";
    }
}
