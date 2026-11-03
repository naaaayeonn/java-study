/// /////////////////////////////////////////////////
/// 작성자 : 이서연(2513707)
/// 작성일 : 2026-09-29
/// Lab2-1 : Contacts 클래스 작성
/// /////////////////////////////////////////////////

public class Contacts {
    private String name;
    private String tel;
    private String email;
    static int count; // 정적 변수(static),  등록된 총 연락처 수를 카운트

    public Contacts(String name, String tel, String email){
        this.name = name;
        this.tel = tel;
        this.email = email;
        count++; // 객체가 생성될 때마다 정적 변수 count를 1씩 증가
    }
    //이름을 반환하는 Getter 메서드
    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return "name: "+name+", tel: "+tel+", email: "+email;
    }
}
