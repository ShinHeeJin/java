package oop;

// 인터페이스 다중 상속 학습
// 하나의 클래스가 여러 인터페이스 구현

interface Flyable {
    void fly();
    void land();
}

interface Swimmable {
    void swim();
    void dive();
}

interface Walkable {
    void walk();
    void run();
}

class Duck implements Flyable, Swimmable, Walkable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + "이 날아다닙니다");
    }

    @Override
    public void land() {
        System.out.println(name + "이 착륙합니다");
    }

    @Override
    public void swim() {
        System.out.println(name + "이 헤엄칩니다");
    }

    @Override
    public void dive() {
        System.out.println(name + "이 물속으로 잠수합니다");
    }

    @Override
    public void walk() {
        System.out.println(name + "이 걷습니다");
    }

    @Override
    public void run() {
        System.out.println(name + "이 뛰어다닙니다");
    }
}

class Penguin implements Swimmable, Walkable {
    private String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + "이 매우 빠르게 헤엄칩니다");
    }

    @Override
    public void dive() {
        System.out.println(name + "이 깊게 잠수합니다");
    }

    @Override
    public void walk() {
        System.out.println(name + "이 뒤뚱거리며 걷습니다");
    }

    @Override
    public void run() {
        System.out.println(name + "이 뛰어다닙니다");
    }
}

class Eagle implements Flyable, Walkable {
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + "이 높이 날아다닙니다");
    }

    @Override
    public void land() {
        System.out.println(name + "이 나뭇가지에 내려앉습니다");
    }

    @Override
    public void walk() {
        System.out.println(name + "이 걷습니다");
    }

    @Override
    public void run() {
        System.out.println(name + "이 뛰어다닙니다");
    }
}

public class Example33_InterfaceMultipleInheritance {
    public static void main(String[] args) {
        System.out.println("=== Duck (Flyable, Swimmable, Walkable) ===");
        Duck duck = new Duck("꽥꽥이");
        duck.fly();
        duck.swim();
        duck.walk();
        duck.land();
        duck.dive();

        System.out.println("\n=== Penguin (Swimmable, Walkable) ===");
        Penguin penguin = new Penguin("펭귄");
        penguin.swim();
        penguin.walk();
        penguin.dive();

        System.out.println("\n=== Eagle (Flyable, Walkable) ===");
        Eagle eagle = new Eagle("독수리");
        eagle.fly();
        eagle.walk();
        eagle.land();

        System.out.println("\n=== 인터페이스 타입으로 처리 ===");
        System.out.println("--- Flyable 인터페이스 ---");
        Flyable[] flyables = {duck, eagle};
        for (Flyable flyable : flyables) {
            flyable.fly();
            flyable.land();
        }

        System.out.println("\n--- Swimmable 인터페이스 ---");
        Swimmable[] swimmables = {duck, penguin};
        for (Swimmable swimmable : swimmables) {
            swimmable.swim();
            swimmable.dive();
        }

        System.out.println("\n--- Walkable 인터페이스 ---");
        Walkable[] walkables = {duck, penguin, eagle};
        for (Walkable walkable : walkables) {
            walkable.walk();
            walkable.run();
        }

        System.out.println("\n=== 다중 인터페이스의 장점 ===");
        System.out.println("- 클래스는 여러 인터페이스 구현 가능");
        System.out.println("- 클래스는 하나의 클래스만 상속 가능");
        System.out.println("- 더 유연한 다형성 제공");
    }
}
