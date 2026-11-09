
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void introduce() {
        System.out.println("이름: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal dog = new Dog("초코");
        Animal cat = new Cat("나비");

        dog.introduce();
        dog.sound();

        cat.introduce();
        cat.sound();
    }
}
