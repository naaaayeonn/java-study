//작성자: 이유진(2514714)
//작성일: 2026.09.29
//Lab03-1: Book 클래스 작성

public class Book {
    //field
    String title;
    String score;
    static int count = 0;

    //constructor
    public Book(String title, String score){
        this.title = title;
        this.score = score;
        count++;
    }

    //toString
    @Override
    public String toString() {
        return "Book [Title: "+ title+", Score: "+ score+"]";
    }
}
