<CodeBlock language="java" editable>
import java.util.Scanner;


public class ExceptionExample {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

try {
System.out.print("첫 번째 정수: ");
int num1 = Integer.parseInt(scanner.nextLine());

System.out.print("두 번째 정수: ");
int num2 = Integer.parseInt(scanner.nextLine());

int result = num1 / num2;

System.out.println("나눗셈 결과: " + result);

} catch (NumberFormatException e) {
System.out.println("정수를 입력해야 합니다.");

} catch (ArithmeticException e) {
System.out.println("0으로 나눌 수 없습니다.");

} finally {
System.out.println("프로그램을 종료합니다.");
scanner.close();
}
}
}
</CodeBlock>
