
## 1. 상속(Inheritance)

상속은 기존 클래스의 필드와 메서드를 새로운 클래스가 물려받아 사용하는 것이다.

기존 클래스를 **부모 클래스(상위 클래스)**라고 하고,  
부모 클래스를 상속받는 클래스를 **자식 클래스(하위 클래스)**라고 한다.

```java
class Animal {
    String name;

    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
```

```java
class Dog extends Animal {

}
```

`Dog` 클래스는 `Animal` 클래스를 상속받았기 때문에  
`Animal` 클래스의 필드와 메서드를 사용할 수 있다.

```java
Dog dog = new Dog();

dog.name = "초코";
dog.sound();
```

---

## 2. 부모 클래스와 자식 클래스

부모 클래스는 여러 자식 클래스에서 공통으로 사용하는 기능을 정의할 수 있다.

예를 들어 자동차를 나타내는 부모 클래스가 있다고 하자.

```java
class Car {
    String color;
    int speed;

    public void drive() {
        System.out.println("자동차가 주행합니다.");
    }
}
```

이를 상속받는 자식 클래스를 만들 수 있다.

```java
class SportsCar extends Car {

}
```

`SportsCar`는 `Car`의 필드와 메서드를 사용할 수 있다.

```java
SportsCar car = new SportsCar();

car.color = "빨간색";
car.speed = 100;
car.drive();
```

상속을 사용하면 여러 클래스에서 반복되는 코드를 줄일 수 있다.

---

## 3. `extends`

Java에서 클래스를 상속할 때 `extends` 키워드를 사용한다.

기본 형식은 다음과 같다.

```java
class 자식클래스 extends 부모클래스 {

}
```

예시:

```java
class Person {
    String name;

    public void introduce() {
        System.out.println("안녕하세요.");
    }
}
```

```java
class Student extends Person {
    int studentId;
}
```

`Student`는 `Person`을 상속받았기 때문에 다음과 같이 사용할 수 있다.

```java
Student student = new Student();

student.name = "지우";
student.studentId = 2511811;

student.introduce();
```

즉, 자식 클래스는 부모 클래스의 기능을 물려받으면서  
자신만의 필드나 메서드를 추가할 수도 있다.

---

## 4. `super`

`super`는 **부모 클래스의 객체 부분을 가리키는 키워드**이다.

부모 클래스의 필드나 메서드에 접근할 때 사용할 수 있다.

```java
class Parent {
    String name = "부모";
}
```

```java
class Child extends Parent {
    String name = "자식";

    public void showName() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
```

실행하면:

```text
자식
부모
```

여기서

```java
name
```

은 자식 클래스의 필드를 의미하고,

```java
super.name
```

은 부모 클래스의 필드를 의미한다.

---

## 5. `super()`를 이용한 부모 생성자 호출

`super()`는 부모 클래스의 생성자를 호출할 때 사용한다.

```java
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}
```

자식 클래스에서 부모 생성자를 호출할 수 있다.

```java
class Student extends Person {
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
}
```

여기서

```java
super(name);
```

은 부모 클래스인 `Person`의 생성자

```java
public Person(String name)
```

을 호출한다.

자식 객체를 생성하면 부모 생성자가 먼저 실행되고,  
그다음 자식 클래스의 생성자가 실행된다.

```java
Student student = new Student("지우", 2511811);
```

---

## 6. 메서드 오버라이딩(Method Overriding)

메서드 오버라이딩은 부모 클래스에서 정의한 메서드를  
자식 클래스에서 자신의 기능에 맞게 다시 정의하는 것이다.

예를 들어 부모 클래스에 다음과 같은 메서드가 있다고 하자.

```java
class Animal {

    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
```

`Dog` 클래스에서는 같은 메서드를 다르게 동작하도록 만들 수 있다.

```java
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
```

실행:

```java
Dog dog = new Dog();
dog.sound();
```

출력:

```text
멍멍
```

부모 클래스의 `sound()`가 아니라  
자식 클래스에서 새롭게 정의한 `sound()`가 실행된다.

---

## 7. `@Override`

메서드를 오버라이딩할 때 `@Override`를 작성할 수 있다.

```java
@Override
public void sound() {
    System.out.println("멍멍");
}
```

`@Override`는 아래 메서드가 부모 클래스의 메서드를  
재정의한 것이라는 의미이다.

필수는 아니지만 작성하는 것이 좋다.

메서드 이름이나 매개변수를 잘못 작성했을 경우  
컴파일러가 오류를 알려주기 때문에 실수를 줄일 수 있다.

---

## 8. 오버라이딩하면서 부모 메서드 사용하기

오버라이딩한 메서드에서도 부모 클래스의 기존 메서드를 사용할 수 있다.

이때 `super.메서드명()`을 사용한다.

```java
class Parent {

    public void show() {
        System.out.println("부모 클래스");
    }
}
```

```java
class Child extends Parent {

    @Override
    public void show() {
        super.show();
        System.out.println("자식 클래스");
    }
}
```

실행:

```java
Child child = new Child();
child.show();
```

출력:

```text
부모 클래스
자식 클래스
```

여기서

```java
super.show();
```

는 부모 클래스의 `show()` 메서드를 호출한다.

---

## 9. 실습 예제

```java
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    public void showInfo() {
        System.out.println("이름: " + name);
    }
}
```

```java
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void showDogInfo() {
        super.showInfo();
        System.out.println("강아지입니다.");
    }
}
```

객체 생성 및 메서드 호출:

```java
public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("초코");

        dog.showInfo();
        dog.sound();
        dog.showDogInfo();
    }
}
```

실행 결과:

```text
이름: 초코
멍멍
이름: 초코
강아지입니다.
```

---

## 10. 핵심 정리

### 부모 클래스

공통으로 사용할 필드와 메서드를 정의하는 클래스이다.

```java
class Animal {

}
```

### 자식 클래스

부모 클래스를 상속받아 기능을 물려받는 클래스이다.

```java
class Dog extends Animal {

}
```

### `extends`

클래스를 상속할 때 사용한다.

```java
class Dog extends Animal
```

### `super`

부모 클래스의 필드나 메서드에 접근할 때 사용한다.

```java
super.name;
super.showInfo();
```

### `super()`

부모 클래스의 생성자를 호출한다.

```java
super(name);
```

### 메서드 오버라이딩

부모 클래스의 메서드를 자식 클래스에서 다시 정의하는 것이다.

```java
@Override
public void sound() {
    System.out.println("멍멍");
}
```

---

## 11. 학습 내용 정리

이번 주에는 클래스 간의 상속 관계에 대해 학습하였다.

상속을 이용하면 부모 클래스에서 정의한 필드와 메서드를  
자식 클래스에서 다시 작성하지 않고 사용할 수 있어 코드의 중복을 줄일 수 있다.

`extends`를 사용하여 부모 클래스를 상속할 수 있으며,  
`super`를 이용하면 부모 클래스의 필드나 메서드에 접근할 수 있다.

또한 `super()`를 사용하여 부모 클래스의 생성자를 호출할 수 있다는 것을 배웠다.

메서드 오버라이딩을 사용하면 부모 클래스에서 정의한 메서드를  
자식 클래스의 특성에 맞게 다시 정의할 수 있다.

이번 학습을 통해 상속을 이용하여 클래스 간의 관계를 만들고  
공통 기능을 재사용하는 방법을 이해할 수 있었다.
