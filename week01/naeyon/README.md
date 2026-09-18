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
System.out.println("Hello");
```

출력 결과

```text
Hello
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

| 자료형 | 설명 | 예시 |
|---|---|---|
| `byte` | 작은 범위의 정수 | `byte num = 10;` |
| `short` | 정수 | `short num = 100;` |
| `int` | 일반적으로 사용하는 정수 | `int age = 20;` |
| `long` | 큰 범위의 정수 | `long population = 8000000000L;` |
| `float` | 실수 | `float height = 165.5F;` |
| `double` | 일반적으로 사용하는 실수 | `double height = 165.5;` |
| `char` | 한 글자의 문자 | `char grade = 'A';` |
| `boolean` | 참 또는 거짓 | `boolean student = true;` |

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

## 11. 조건문

조건에 따라 실행할 코드를 다르게 할 때 사용한다.

### if문

조건식이 `true`일 경우 중괄호 안의 코드를 실행한다.

```java
int age = 20;

if (age >= 19) {
    System.out.println("성인입니다.");
}
```

### if - else문

조건이 참일 때와 거짓일 때 서로 다른 코드를 실행한다.

```java
int num = 7;

if (num % 2 == 0) {
    System.out.println("짝수입니다.");
} else {
    System.out.println("홀수입니다.");
}
```

### if - else if - else문

여러 조건을 순서대로 비교할 때 사용한다.

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```

조건은 위에서부터 차례대로 확인하며, 처음 `true`가 된 부분만 실행된다.

### switch문

하나의 값을 여러 경우와 비교할 때 사용한다.

```java
int menu = 2;

switch (menu) {
    case 1:
        System.out.println("아메리카노");
        break;

    case 2:
        System.out.println("카페라떼");
        break;

    case 3:
        System.out.println("녹차");
        break;

    default:
        System.out.println("없는 메뉴입니다.");
}
```

- `case` : 값에 따라 실행할 코드를 구분한다.
- `break` : 해당 case 실행 후 switch문을 종료한다.
- `default` : 일치하는 case가 없을 때 실행된다.

---

## 12. 반복문

같은 코드를 여러 번 반복해서 실행할 때 사용한다.

### for문

반복 횟수가 정해져 있을 때 주로 사용한다.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

출력 결과

```text
1
2
3
4
5
```

for문의 기본 구조

```java
for (초기값; 조건식; 증감식) {
    반복할 코드
}
```

예시

```java
for (int i = 0; i < 3; i++) {
    System.out.println("Java");
}
```

출력 결과

```text
Java
Java
Java
```

### while문

조건이 `true`인 동안 계속 반복한다.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### do-while문

코드를 먼저 한 번 실행한 뒤 조건을 확인한다.

따라서 조건이 처음부터 거짓이어도 최소 한 번은 실행된다.

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### break

반복문을 즉시 종료한다.

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

출력 결과

```text
1
2
3
4
```

### continue

현재 반복을 건너뛰고 다음 반복으로 넘어간다.

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

출력 결과

```text
1
2
4
5
```

### 중첩 반복문

반복문 안에 또 다른 반복문을 사용할 수 있다.

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {
        System.out.println("i = " + i + ", j = " + j);
    }
}
```

### 반복문 비교

| 반복문 | 특징 | 주로 사용하는 경우 |
|---|---|---|
| `for` | 초기값, 조건, 증감식을 한 번에 작성 | 반복 횟수를 알고 있을 때 |
| `while` | 조건이 참인 동안 반복 | 반복 횟수를 정확히 모를 때 |
| `do-while` | 최소 한 번 실행 | 실행 후 조건을 확인해야 할 때 |

---

## 13. 배열

같은 자료형의 여러 값을 하나의 변수로 관리하기 위해 사용한다.

### 배열 선언

```java
int[] numbers;
```

### 배열 생성

```java
numbers = new int[5];
```

선언과 생성을 한 번에 할 수도 있다.

```java
int[] numbers = new int[5];
```

위 코드는 정수 5개를 저장할 수 있는 배열을 만든다.

### 배열 초기화

배열을 생성하면서 값을 바로 넣을 수도 있다.

```java
int[] numbers = {10, 20, 30, 40, 50};
```

### 배열의 인덱스

배열의 위치를 나타내는 번호를 인덱스라고 한다.

배열의 인덱스는 `0`부터 시작한다.

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[0]);
System.out.println(numbers[1]);
System.out.println(numbers[2]);
```

출력 결과

```text
10
20
30
```

### 배열 값 변경

```java
int[] numbers = {10, 20, 30};

numbers[0] = 100;

System.out.println(numbers[0]);
```

출력 결과

```text
100
```

### 배열 길이

`length`를 사용하면 배열의 길이를 확인할 수 있다.

```java
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers.length);
```

출력 결과

```text
5
```

### 반복문을 이용한 배열 출력

```java
int[] numbers = {10, 20, 30, 40, 50};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

배열에서는 보통

```java
i < numbers.length
```

형태를 많이 사용한다.

### 향상된 for문

배열의 값을 처음부터 끝까지 순서대로 확인할 때 사용할 수 있다.

```java
int[] numbers = {10, 20, 30};

for (int num : numbers) {
    System.out.println(num);
}
```

### 배열의 합 구하기

```java
int[] numbers = {10, 20, 30, 40, 50};

int sum = 0;

for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}

System.out.println(sum);
```

출력 결과

```text
150
```

### 배열의 최댓값 구하기

```java
int[] numbers = {3, 7, 2, 9, 5};

int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {

    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("최댓값: " + max);
```

출력 결과

```text
최댓값: 9
```

---

## 14. 2차원 배열

배열 안에 또 다른 배열이 들어있는 형태이다.

행과 열 형태의 데이터를 표현할 때 사용할 수 있다.

```java
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6}
};
```

값에 접근할 때는 두 개의 인덱스를 사용한다.

```java
System.out.println(numbers[0][0]);
System.out.println(numbers[1][2]);
```

출력 결과

```text
1
6
```

### 2차원 배열 전체 출력

```java
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int i = 0; i < numbers.length; i++) {

    for (int j = 0; j < numbers[i].length; j++) {
        System.out.print(numbers[i][j] + " ");
    }

    System.out.println();
}
```

출력 결과

```text
1 2 3
4 5 6
```
