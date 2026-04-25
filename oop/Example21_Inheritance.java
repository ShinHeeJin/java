package oop;

// 상속 학습
// 부모 클래스와 자식 클래스

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "이 먹이를 먹습니다");
    }

    public void sleep() {
        System.out.println(name + "이 자고 있습니다");
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);  // 부모 클래스 생성자 호출
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + "이 멍멍하고 짖습니다");
    }

    @Override
    public void eat() {
        System.out.println(name + "이 개사료를 먹습니다");
    }

    public void printInfo() {
        super.printInfo();  // 부모 클래스 메서드 호출
        System.out.println("품종: " + breed);
    }
}

class Cat extends Animal {
    boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public void meow() {
        System.out.println(name + "이 야옹하고 웁니다");
    }

    @Override
    public void eat() {
        System.out.println(name + "이 생선을 먹습니다");
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("실내묘: " + (isIndoor ? "예" : "아니오"));
    }
}

public class Example21_Inheritance {
    public static void main(String[] args) {
        System.out.println("=== Dog 객체 생성 ===");
        Dog dog = new Dog("뽀삐", 3, "골든 리트리버");
        dog.printInfo();
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\n=== Cat 객체 생성 ===");
        Cat cat = new Cat("나비", 2, true);
        cat.printInfo();
        cat.eat();
        cat.sleep();
        cat.meow();

        System.out.println("\n=== 다형성 (Polymorphism) ===");
        Animal animal1 = new Dog("치치", 4, "푸들");
        Animal animal2 = new Cat("초코", 3, false);

        animal1.eat();  // Dog의 eat() 호출
        animal2.eat();  // Cat의 eat() 호출

        System.out.println("\n=== instanceof 확인 ===");
        System.out.println("animal1은 Dog인가? " + (animal1 instanceof Dog));
        System.out.println("animal1은 Animal인가? " + (animal1 instanceof Animal));
        System.out.println("animal2은 Cat인가? " + (animal2 instanceof Cat));
    }
}
