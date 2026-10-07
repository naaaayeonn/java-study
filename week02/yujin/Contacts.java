//작성자: 이유진(2514714)
//작성일: 2026.09.29
//Lab03-1: Contacts 클래스 작성

public class Contacts {
    //field
    String name;
    String tel;
    String email;
    static int count = 0;

    //constructor
    public Contacts(String name, String tel, String email){
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++;
    }

    //toString
    public String toString(){
        return "name: " + name + ", tel: " + tel + ", email: " + email;
    }
}
