//작성자: 이유진(2514714)
//작성일: 2026.09.29
//Lab03-1: Movie 클래스 작성

public class Movie {
    //필드 작성
    private String title;
    private String director;
    private String year;
    private String rate;
    static int count = 0;

    //생성자 정의
    public Movie(String title, String director, String year, String rate){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rate = rate;
        count++;
    }

    //toString 출력부분
    public String toString(){
        return "영화 제목: " + title + ", 감독: " + director + ", 개봉 연도: " + year + ", 평점: " + rate;
    }
}
