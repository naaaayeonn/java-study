//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-3 : 쇼핑몰 관리 시스템

public class Product {
    //property
    String name;
    double price;

    //constructor
    public Product(String n, double p){
        this.name = n;
        this.price = p;
    }

   public double getPrice() { return this.price; }

    @Override
    public String toString() {
        return "상품명: "+ this.name + ", 가격: " + this.price + "원";
    }
}

class CSBook extends Product{
    private String author;
    private String publisher;

    public CSBook(String n, double p, String a, String pb) {
        super(n, p);
        this.author = a;
        this.publisher = pb;
    }

    @Override
    public String toString() {
        return "[도서] " + this.name + " (" + this.author +" 저"+ "," + this.publisher + "), 가격:" + this.price + "원";
    }
}

class Electronics extends Product{
    private String manufacturer;
    private int warrantyMonths;

    public Electronics(String n, double p, String m, int wM){
        super(n, p);
        this.manufacturer = m;
        this.warrantyMonths = wM;
    }

    @Override
    public String toString() {
        return  "[전자제품] " + this.name + " ("+this.manufacturer+"), 보증기간: "+ this.warrantyMonths +"개월, 가격: "+ this.price+"원";

    }
}