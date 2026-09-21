//작성자: 이유진(2514714)
//작성일: 2026.09.17
//Lab02-2: Song 클래스 작성

public class Song {
    //필드 선언
    String title;
    String artist;
    String length;

    //생성자 여러개 정의
    public Song(String t, String a, String l){
        this.title = t;
        this.artist = a;
        this.length = l;
    }
    public Song(String t, String a){
        this(t, a, "0");
    }
    public Song(String t){
        this(t, "정보 없음", "0");
    }
    public Song(){
        this("제목 없음", "정보 없음", "0");
    }

    //toString 메소드 작성
    @Override
    public String toString() {
        return "Song [제목: " + this.title + ", 가수: " + this.artist + ", 곡의 길이: " + this.length + "]";
    }
}
