//작성자: 2514714 이유진
//작성일: 2026.10.01
//Lab04-4 : 쇼핑몰 관리 시스템 확장


public class ProductTest2 {
    public static void main(String[] args) {
// 상품 객체 배열 생성
        Product[] products = new Product[6];
        products[0] = new CSBook("자바 프로그래밍", 25000, "이순신", "코딩출판사");
        products[1] = new CSBook("데이터베이스 개론", 30000, "김유신", "IT출판사");
        products[2] = new Electronics("노트북", 1200000, "삼성", 24);
        products[3] = new Electronics("스마트폰", 900000, "애플", 12);
        products[4] = new CSBook("알고리즘 문제해결", 28000, "강감찬", "AlgorithmBooks");
        products[5] = new Electronics("TV", 1500000, "LG", 36);
// 전체 상품 출력 및 통계 계산
        double total_pay = 0;
        int bookcount = 0;
        int eleccount = 0;
        System.out.println("===== 쇼핑몰 상품 목록 =====");
        for (int i=0; i<products.length; i++){
            System.out.println(products[i]);
            if (products[i] instanceof CSBook){
                bookcount++;
            }
            else if (products[i] instanceof Electronics){
                eleccount++;
            }
            total_pay += products[i].getPrice();
        }

        System.out.println("===== 통계정보 =====");
        System.out.println("전체 상품 수: "+ (bookcount + eleccount));
        System.out.println("도서 개수: "+bookcount);
        System.out.println("전자제품 개수: "+ eleccount);
        System.out.println("전체 상품 총액: "+total_pay +"원");
        System.out.println("상품 평균 가격: " + total_pay/(bookcount+eleccount));
    }
}
