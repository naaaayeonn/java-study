# Week 02 - 클래스와 객체

## 1. 클래스란?

클래스는 객체를 만들기 위한 설계도이다.

예를 들어 학생을 표현하고 싶다면 학생의 이름, 나이와 같은 정보와
자기소개를 하는 기능 등을 하나의 클래스로 만들 수 있다.

```java
class Student {
    String name;
    int age;
}
```

`Student`라는 클래스 안에

- `name`
- `age`

라는 데이터를 저장할 수 있다.

---

## 2. 객체란?

객체는 클래스를 바탕으로 실제로 만들어진 대상이다.

```java
Student s1 = new Student();
```

`Student`라는 클래스를 이용하여 `s1`이라는 객체를 생성한 것이다.

클래스와 객체의 관계는 다음과 같이 생각할 수 있다.

| 구분 | 의미 | 예시 |
|---|---|---|
| 클래스 | 객체를 만들기 위한 설계도 | Student |
| 객체 | 클래스를 이용해 만들어진 실제 대상 | s1, s2 |
| new | 새로운 객체를 생성할 때 사용 | new Student() |

---

## 3. 필드(Field)

필드는 객체가 가지고 있는 데이터를 저장하는 변수이다.

```java
class Student {
    String name;
    int age;
}
```

여기서

```java
String name;
int age;
```

가 필드이다.

객체를 만든 후 값을 넣을 수 있다.

```java
Student s1 = new Student();

s1.name = "나연";
s1.age = 20;
```

값을 출력할 수도 있다.

```java
System.out.println(s1.name);
System.out.println(s1.age);
```

출력 결과

```text
나연
20
```

---

## 4. 여러 객체 생성하기

하나의 클래스로 여러 객체를 만들 수 있다.

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "나연";
s1.age = 20;

s2.name = "nayeon";
s2.age = 21;
```

각 객체는 서로 다른 값을 저장한다.

```java
System.out.println(s1.name);
System.out.println(s2.name);
```

출력 결과

```text
나연
nayeon
```

---

## 5. 메서드(Method)

메서드는 객체가 수행할 수 있는 기능을 정의한다.

```java
class Student {
    String name;
    int age;

    void introduce() {
        System.out.println("안녕하세요. 저는 " + name + "입니다.");
    }
}
```

객체를 만든 후 메서드를 호출할 수 있다.

```java
Student s1 = new Student();

s1.name = "나연";
s1.age = 20;

s1.introduce();
```

출력 결과

```text
안녕하세요. 저는 나연입니다.
```

---

## 6. 생성자(Constructor)

생성자는 객체가 만들어질 때 처음 실행되는 특별한 메서드이다.

객체를 생성하면서 필요한 값을 바로 저장할 때 사용할 수 있다.

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

객체를 생성할 때 값을 전달한다.

```java
Student s1 = new Student("나연", 20);
Student s2 = new Student("nayeon", 21);
```

생성자의 특징

- 클래스 이름과 이름이 같다.
- 반환형을 작성하지 않는다.
- 객체를 생성할 때 자동으로 실행된다.

---

## 7. this

`this`는 현재 객체 자신을 의미한다.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

여기서

```java
this.name
```

은 객체의 필드 `name`을 의미하고,

```java
name
```

은 생성자로 전달받은 매개변수를 의미한다.

따라서

```java
this.name = name;
```

은 전달받은 `name` 값을 현재 객체의 `name` 필드에 저장한다는 뜻이다.

---

## 클래스와 객체 정리

| 개념 | 의미 |
|---|---|
| 클래스 | 객체를 만들기 위한 설계도 |
| 객체 | 클래스를 이용해 생성한 실제 대상 |
| 필드 | 객체가 가지고 있는 데이터 |
| 메서드 | 객체가 수행하는 기능 |
| 생성자 | 객체가 만들어질 때 실행되는 코드 |
| new | 객체를 생성하는 키워드 |
| this | 현재 객체 자신을 가리키는 키워드 |
```
