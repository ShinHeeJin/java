package oop;

// 추상 클래스(Abstract Class) 학습
// 미완성 클래스로 상속을 강제

abstract class Animal2 {
    protected String name;

    public Animal2(String name) {
        this.name = name;
    }

    // 추상 메서드 (구현 없음)
    abstract void makeSound();
    abstract void move();

    // 일반 메서드 (구현 있음)
    public void sleep() {
        System.out.println(name + "이 자고 있습니다");
    }

    public void eat() {
        System.out.println(name + "이 먹이를 먹고 있습니다");
    }
}

class Dog2 extends Animal2 {
    public Dog2(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + ": 멍멍!");
    }

    @Override
    void move() {
        System.out.println(name + "이 네발로 뛰어다닙니다");
    }
}

class Bird extends Animal2 {
    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + ": 짹짹!");
    }

    @Override
    void move() {
        System.out.println(name + "이 날아다닙니다");
    }
}

class Fish extends Animal2 {
    public Fish(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + ": 물소리");
    }

    @Override
    void move() {
        System.out.println(name + "이 헤엄쳐 다닙니다");
    }
}

abstract class Vehicle2 {
    protected String brand;
    protected int speed;

    public Vehicle2(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    abstract void start();
    abstract void stop();

    public void accelerate(int amount) {
        speed += amount;
        System.out.println("속도 증가: " + speed);
    }
}

class Car2 extends Vehicle2 {
    public Car2(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " 자동차 시동을 겁니다");
    }

    @Override
    void stop() {
        System.out.println(brand + " 자동차 시동을 끕니다");
        speed = 0;
    }
}

public class Example31_AbstractClass {
    public static void main(String[] args) {
        System.out.println("=== 추상 클래스 사용 ===");
        // Animal2 animal = new Animal2("동물");  // 에러: 추상 클래스 인스턴스화 불가

        System.out.println("=== Dog 객체 ===");
        Dog2 dog = new Dog2("뽀삐");
        dog.makeSound();
        dog.move();
        dog.eat();
        dog.sleep();

        System.out.println("\n=== Bird 객체 ===");
        Bird bird = new Bird("짹짹이");
        bird.makeSound();
        bird.move();
        bird.eat();

        System.out.println("\n=== Fish 객체 ===");
        Fish fish = new Fish("금붕어");
        fish.makeSound();
        fish.move();

        System.out.println("\n=== 다형성 (추상 클래스) ===");
        Animal2[] animals = {
            new Dog2("뽀삐"),
            new Bird("짹짹이"),
            new Fish("금붕어")
        };

        for (Animal2 animal : animals) {
            animal.makeSound();
            animal.move();
            System.out.println();
        }

        System.out.println("\n=== Vehicle 추상 클래스 ===");
        Car2 car = new Car2("현대");
        car.start();
        car.accelerate(50);
        car.accelerate(30);
        car.stop();

        System.out.println("\n=== 추상 클래스의 장점 ===");
        System.out.println("- 인터페이스를 강제");
        System.out.println("- 공통 코드 재사용");
        System.out.println("- 다형성 구현");
    }
}
