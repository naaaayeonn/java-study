자바 스터디 1주차 - 박지우

## 조건문, 반복문, 배열

Java에서 프로그램의 실행 흐름을 제어하기 위해 조건문과 반복문을 사용하며, 여러 개의 데이터를 저장하기 위해 배열을 사용한다.

### 조건문

조건에 따라 실행할 코드를 선택할 때 사용한다.

```java
if (score >= 60) {
    System.out.println("합격");
} else {
    System.out.println("불합격");
}
```

`switch`문은 하나의 값에 따라 여러 경우를 나눌 때 사용한다.

```java
switch (menu) {
    case 1:
        System.out.println("등록");
        break;
    case 2:
        System.out.println("검색");
        break;
    default:
        System.out.println("잘못된 입력");
}
```

### 반복문

같은 코드를 여러 번 실행할 때 사용한다.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

`while`문은 조건이 참인 동안 반복한다.

```java
while (count < 5) {
    count++;
}
```

`do-while`문은 조건을 검사하기 전에 코드를 최소 한 번 실행한다.

```java
do {
    count++;
} while (count < 5);
```

### 1차원 배열

같은 자료형의 여러 값을 하나의 변수 이름으로 관리할 수 있다. 배열의 인덱스는 `0`부터 시작한다.

```java
int[] scores = new int[3];

scores[0] = 80;
scores[1] = 90;
scores[2] = 100;
```

반복문과 함께 사용하면 배열 전체를 쉽게 처리할 수 있다.

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

### 2차원 배열

행과 열 형태로 데이터를 저장할 때 사용한다.

```java
int[][] scores = {
    {80, 90},
    {70, 100}
};

System.out.println(scores[0][1]); // 90
```

중첩 반복문을 사용하여 전체 값을 출력할 수 있다.

```java
for (int i = 0; i < scores.length; i++) {
    for (int j = 0; j < scores[i].length; j++) {
        System.out.println(scores[i][j]);
    }
}
```

**정리:** `if`, `switch`는 조건에 따른 실행 흐름을 결정하고, `for`, `while`, `do-while`은 반복 작업을 처리한다. 배열은 여러 데이터를 연속적으로 저장하며, 반복문과 함께 활용하는 경우가 많다.
