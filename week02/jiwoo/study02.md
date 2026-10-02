
## 1. 클래스와 객체

### 클래스(Class)

클래스는 객체를 만들기 위한 설계도이다.  
객체가 가지는 데이터인 **필드**와 객체가 수행하는 기능인 **메서드**를 정의한다.

```java
class Car {
    String color;
    int speed;

    void accelerate() {
        speed += 10;
    }
}
```

### 객체(Object)

객체는 클래스를 기반으로 실제 생성된 인스턴스이다.

```java
Car myCar = new Car();
```

- `Car` : 클래스 타입
- `myCar` : 객체를 참조하는 변수
- `new Car()` : 새로운 객체 생성

---

## 2. 필드(Field)

필드는 객체가 가지고 있는 데이터를 저장하는 변수이다.

```java
class Car {
    String color;
    int speed;
    int gear;
}
```

각 객체는 서로 다른 필드 값을 가질 수 있다.

```java
Car car1 = new Car();
Car car2 = new Car();

car1.color = "빨간색";
car2.color = "파란색";
```

---

## 3. 메서드(Method)

메서드는 객체가 수행할 동작을 정의한다.

```java
public void accelerate(int increment) {
    speed += increment;
    System.out.println("속도가 " + speed + "km/h로 증가했습니다.");
}
```

객체를 생성한 후 다음과 같이 메서드를 호출할 수 있다.

```java
myCar.accelerate(30);
```

`accelerate(30)`을 호출하면 `increment` 매개변수에 `30`이 전달되고, 기존 속도에 30이 더해진다.

---

## 4. 생성자(Constructor)

생성자는 객체가 생성될 때 자동으로 호출되는 특별한 메서드이다.

생성자의 특징은 다음과 같다.

- 클래스 이름과 동일한 이름을 사용한다.
- 반환형을 작성하지 않는다.
- 객체 생성 시 필드의 초기값을 설정할 수 있다.

```java
public CarClass(String color) {
    this.color = color;
    this.speed = 1;
    this.gear = 1;
}
```

객체를 생성할 때 생성자에 값을 전달할 수 있다.

```java
CarClass myCar = new CarClass("빨간색");
```

이 경우 `"빨간색"`이 생성자의 `color` 매개변수로 전달된다.

---

## 5. `this` 키워드

`this`는 **현재 객체 자신**을 의미한다.

필드 이름과 매개변수 이름이 같을 때 두 값을 구분하기 위해 사용할 수 있다.

```java
class BankAccount {
    private String owner;

    public BankAccount(String owner) {
        this.owner = owner;
    }
}
```

여기서

```java
this.owner
```

는 현재 객체의 `owner` 필드를 의미하고,

```java
owner
```

는 생성자로 전달받은 매개변수를 의미한다.

따라서

```java
this.owner = owner;
```

는 전달받은 `owner` 값을 현재 객체의 `owner` 필드에 저장한다는 의미이다.

---

## 6. `this`를 이용한 메서드 호출

`this`를 이용해 현재 객체의 메서드를 호출할 수도 있다.

```java
public void transfer(BankAccount otherAccount, double amount) {
    this.withdraw(amount);
    otherAccount.deposit(amount);
}
```

예를 들어 다음과 같이 호출하면

```java
ba[0].transfer(ba[2], 30000);
```

`transfer()` 내부에서는 다음과 같이 이해할 수 있다.

```text
this         → ba[0]
otherAccount → ba[2]
amount       → 30000
```

따라서

```java
this.withdraw(amount);
```

는 `ba[0]` 계좌에서 돈을 출금하고,

```java
otherAccount.deposit(amount);
```

는 `ba[2]` 계좌에 돈을 입금한다.

---

## 7. 실습 예제 - Car 클래스

```java
public class CarClass {
    private String color;
    private int speed;
    private int gear;

    public CarClass(String color) {
        this.color = color;
        this.speed = 1;
        this.gear = 1;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println("속도가 " + speed + "km/h로 증가했습니다.");
    }

    public void decelerate(int decrement) {
        speed -= decrement;

        if (speed < 0) {
            speed = 0;
        }

        System.out.println("속도가 " + speed + "km/h로 감소했습니다.");
    }

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("기어가 " + gear + "단으로 변경되었습니다.");
    }

    public void showStatus() {
        System.out.println(
                "색상:" + color +
                ", 속도:" + speed + "km/h" +
                ", 기어:" + gear
        );
    }
}
```

객체를 생성하고 메서드를 호출하는 코드는 다음과 같다.

```java
public class Car {
    public static void main(String[] args) {
        CarClass myCar = new CarClass("빨간색");

        myCar.showStatus();
        myCar.accelerate(30);
        myCar.changeGear(2);
        myCar.decelerate(10);
        myCar.showStatus();
    }
}
```

---

## 8. 학습 내용 정리

이번 주에는 클래스와 객체의 기본 개념을 학습하였다.

클래스는 객체를 만들기 위한 설계도이며, 객체는 클래스를 기반으로 실제 생성된 인스턴스이다.  
클래스 내부에는 객체의 상태를 저장하는 필드와 객체의 동작을 정의하는 메서드를 작성할 수 있다.

또한 생성자를 이용하면 객체가 생성되는 시점에 필드의 초기값을 설정할 수 있다.

`this` 키워드는 현재 객체 자신을 의미하며, 필드와 매개변수의 이름이 같을 때 구분하기 위해 사용할 수 있다. 또한 현재 객체의 메서드를 호출할 때도 활용할 수 있다.

이번 실습을 통해 클래스를 이용하여 데이터와 기능을 하나로 묶어 관리하는 객체지향 프로그래밍의 기본 구조를 이해할 수 있었다.
