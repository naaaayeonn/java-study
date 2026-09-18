```md
# Week 01 - Java 기본 문법

## 1. Java 기본 구조

Java 프로그램의 가장 기본적인 형태이다.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

- `public class HelloWorld`
  - `HelloWorld`라는 이름의 클래스를 생성한다.

- `public static void main(String[] args)`
  - Java 프로그램이 실행될 때 시작되는 메서드이다.

- `System.out.println()`
  - 콘솔에 내용을 출력한다.

---

## 2. 출력

### println

내용을 출력한 뒤 줄을 바꾼다.

```java
System.out.println("안녕하세요");
System.out.println("Java 공부 시작!");
```

출력 결과

```text
안녕하세요
Java 공부 시작!
```

### print

내용을 출력하지만 줄을 바꾸지 않는다.

```java
System.out.print("안녕 ");
System.out.print("Java!");
```

출력 결과

```text
안녕 Java!
```

### 숫자 출력

```java
System.out.println(10);
System.out.println(20 + 30);
```

출력 결과

```text
10
50
```

문자열은 큰따옴표 `" "`를 사용한다.

```java
System.out.println("100"); // 문자열
System.out.println(100);   // 숫자
```

---

## 3. 세미콜론

Java에서는 대부분의 문장이 끝날 때 `;`를 사용한다.

```java
System.out.println("Hello");
int age = 20;
```

---

## 4. 주석

코드에 설명을 작성할 때 사용한다.

### 한 줄 주석

```java
// 이름을 출력한다.
System.out.println("나연");
```

### 여러 줄 주석

```java
/*
여러 줄에 걸쳐
설명을 작성할 수 있다.
*/
```

---

## 5. 변수

변수는 데이터를 저장하기 위한 공간이다.

```java
int age = 20;
```

- `int` : 저장할 데이터의 자료형
- `age` : 변수 이름
- `20` : 변수에 저장할 값

변수에 저장된 값을 출력할 수 있다.

```java
int age = 20;

System.out.println(age);
```

출력 결과

```text
20
```

변수의 값은 변경할 수도 있다.

```java
int age = 20;

age = 21;

System.out.println(age);
```

출력 결과

```text
21
```

---

## 6. 기본 자료형

### int

정수를 저장한다.

```java
int age = 20;
int score = 95;
```

### double

소수점이 있는 숫자를 저장한다.

```java
double height = 165.5;
```

### char

한 글자를 저장한다.

```java
char grade = 'A';
```

`char`는 작은따옴표 `' '`를 사용한다.

### String

문자열을 저장한다.

```java
String name = "나연";
```

`String`은 큰따옴표 `" "`를 사용한다.

### boolean

참 또는 거짓을 저장한다.

```java
boolean student = true;
boolean adult = false;
```

---

## 7. 문자열과 변수 함께 출력

`+`를 사용하면 문자열과 변수를 연결할 수 있다.

```java
String name = "나연";
int age = 20;

System.out.println("이름: " + name);
System.out.println("나이: " + age);
```

출력 결과

```text
이름: 나연
나이: 20
```

```java
System.out.println(name + "의 나이는 " + age + "살입니다.");
```

출력 결과

```text
나연의 나이는 20살입니다.
```

---

## 8. 산술 연산자

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

| 연산자 | 의미 |
|---|---|
| `+` | 덧셈 |
| `-` | 뺄셈 |
| `*` | 곱셈 |
| `/` | 나눗셈 |
| `%` | 나머지 |

예를 들어

```java
10 / 3
```

정수끼리 계산하면 결과는

```text
3
```

이 된다.

```java
10 % 3
```

의 결과는

```text
1
```

이다.

---

## 9. 비교 연산자

두 값을 비교할 때 사용한다.

| 연산자 | 의미 |
|---|---|
| `==` | 같다 |
| `!=` | 다르다 |
| `>` | 크다 |
| `<` | 작다 |
| `>=` | 크거나 같다 |
| `<=` | 작거나 같다 |

예시

```java
int age = 20;

System.out.println(age >= 19);
```

출력 결과

```text
true
```

### `=`와 `==`의 차이

```java
age = 20;
```

`=`는 값을 저장한다.

```java
age == 20
```

`==`는 두 값이 같은지 비교한다.

---

## 10. 사용자 입력

Java에서 값을 직접 입력받을 때 `Scanner`를 사용할 수 있다.

```java
import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println("입력한 나이: " + age);
    }
}
```

정수를 입력할 때는

```java
sc.nextInt();
```

문자열을 입력할 때는

```java
sc.next();
```

를 사용한다.

예시

```java
Scanner sc = new Scanner(System.in);

String name = sc.next();
int age = sc.nextInt();

System.out.println(name + " / " + age);
```

---

# 기본 실습

```java
public class BasicPractice {
    public static void main(String[] args) {

        String name = "나연";
        int age = 20;
        double height = 165.5;

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);

        int a = 10;
        int b = 3;

        System.out.println("더하기: " + (a + b));
        System.out.println("빼기: " + (a - b));
        System.out.println("곱하기: " + (a * b));
        System.out.println("나누기: " + (a / b));
        System.out.println("나머지: " + (a % b));
    }
}
```

## 이번 학습에서 익힌 내용

- Java 프로그램의 기본 구조
- 콘솔 출력 방법
- 변수와 기본 자료형
- 문자열과 변수 출력
- 산술 연산자
- 비교 연산자
- Scanner를 이용한 입력
```
