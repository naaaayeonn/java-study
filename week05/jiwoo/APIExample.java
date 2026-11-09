<CodeBlock language="java" editable>
import java.util.Random;


public class APIExample {
public static void main(String[] args) {

// String 클래스 활용
String text = "Java Programming";

System.out.println("문자열: " + text);
System.out.println("문자열 길이: " + text.length());
System.out.println("대문자 변환: " + text.toUpperCase());

// Math 클래스 활용
System.out.println("최댓값: " + Math.max(10, 20));
System.out.println("제곱근: " + Math.sqrt(25));

// Random 클래스 활용
Random random = new Random();
int number = random.nextInt(100) + 1;

System.out.println("랜덤 숫자: " + number);
}
}
</CodeBlock>
