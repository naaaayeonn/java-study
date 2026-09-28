//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-3: 쇼핑몰 상품 할인 계산

public class Product {
    //필드 선언
    String name;
    int price;
    double discountRate;

    //생성자 정의
    public Product(String n, int p, double d){
        this.name = n;
        this.price = p;
        this.discountRate = d;
    }
    //toString 메소드 작성
    @Override
    public String toString() {
        return "상품명: " + this.name + ", 정가: " + this.price + "원, 할인율: " + this.discountRate + ", 할인 가격: " + (int)(price*(1-discountRate));
    }
}
