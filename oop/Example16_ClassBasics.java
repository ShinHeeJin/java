package oop;

// 클래스 기초 학습
// 클래스 선언, 인스턴스 변수, 메서드

class Person {
    // 인스턴스 변수
    String name;
    int age;
    String email;

    // 메서드
    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
    }

    void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }

    int getAgeNextYear() {
        return age + 1;
    }
}

class Car {
    String brand;
    String color;
    int speed;

    void accelerate(int amount) {
        speed += amount;
        System.out.println("속도 증가: " + speed + " km/h");
    }

    void brake(int amount) {
        speed = Math.max(0, speed - amount);
        System.out.println("속도 감소: " + speed + " km/h");
    }

    void displayStatus() {
        System.out.println(brand + " " + color + " 자동차, 현재 속도: " + speed);
    }
}

public class Example16_ClassBasics {
    public static void main(String[] args) {
        System.out.println("=== Person 클래스 사용 ===");
        Person person1 = new Person();
        person1.name = "김철수";
        person1.age = 25;
        person1.email = "kim@example.com";

        person1.printInfo();
        System.out.println();
        person1.introduce();
        System.out.println("내년 나이: " + person1.getAgeNextYear());

        System.out.println("\n=== 다른 Person 인스턴스 ===");
        Person person2 = new Person();
        person2.name = "이영희";
        person2.age = 28;
        person2.email = "lee@example.com";

        person2.printInfo();

        System.out.println("\n=== Car 클래스 사용 ===");
        Car car1 = new Car();
        car1.brand = "현대";
        car1.color = "파란색";
        car1.speed = 0;

        car1.displayStatus();
        car1.accelerate(50);
        car1.accelerate(30);
        car1.brake(20);
        car1.displayStatus();

        System.out.println("\n=== 다른 Car 인스턴스 ===");
        Car car2 = new Car();
        car2.brand = "토요타";
        car2.color = "빨간색";
        car2.speed = 100;

        car2.displayStatus();
        car2.brake(50);
    }
}
