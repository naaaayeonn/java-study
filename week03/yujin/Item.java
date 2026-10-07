//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-5 : 쇼핑몰 구매 시뮬레이션

public class Item {
    String name;
    int price;

    public Item(String n, int p){
        this.name = n;
        this.price = p;
    }

    @Override
    public String toString() {
        return this.name+ "(" + this.price + "원)";
    }
}


class Food extends Item{
    public Food(String n, int p){
        super(n, p);
    }

    @Override
    public String toString() {
        return "Food: " + super.toString();
    }
}


class Book extends Item{
    String author;
    public Book(String n, int p, String a){
        super(n, p);
        this.author = a;
    }

    @Override
    public String toString() {
        return "Book: " + this.name + " - " + this.author + "(" + this.price + "원)";
    }
}

class Movie extends Item{
    String director;
    public Movie(String n, int p, String d){
        super(n, p);
        this.director = d;
    }

    @Override
    public String toString() {
        return "Movie: " + this.name +"-" + this.director + "(" + this.price + "원)";
    }
}

class Buyer{
    int money;
    public Buyer(int m){
        this.money = m;
    }
    public void buy(Item t, int n){
        if (this.money >= t.price*n){
            this.money -= t.price * n;
            System.out.println("구매 성공 : " + t + " => " + n + "개 구매\n남은 잔액: " + this.money + "원");
        }
        else {
            System.out.println("잔액 부족!" + t + " 구매 불가");
            System.out.println("현재잔액: " + this.money + "원");
        }
    }
}
