package oop;

// super 키워드 학습
// 부모 클래스의 메서드와 생성자 호출

class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle 생성자 호출");
    }

    public void displayInfo() {
        System.out.println("브랜드: " + brand + ", 년도: " + year);
    }

    public void drive() {
        System.out.println(brand + " 자동차가 달린다");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);  // 부모 클래스 생성자 호출
        this.doors = doors;
        System.out.println("Car 생성자 호출");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // 부모 클래스 메서드 호출
        System.out.println("문의 수: " + doors);
    }

    @Override
    public void drive() {
        super.drive();  // 부모 클래스 메서드 호출
        System.out.println("편안하게 운전한다");
    }
}

class Bike extends Vehicle {
    private boolean hasSidecar;

    public Bike(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
        System.out.println("Bike 생성자 호출");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("사이드카: " + (hasSidecar ? "있음" : "없음"));
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("스릴 있게 운전한다");
    }
}

public class Example22_SuperKeyword {
    public static void main(String[] args) {
        System.out.println("=== Car 객체 생성 ===");
        Car car = new Car("현대", 2023, 4);
        System.out.println();

        System.out.println("=== Car 정보 출력 ===");
        car.displayInfo();
        System.out.println();

        System.out.println("=== Car 운전 ===");
        car.drive();

        System.out.println("\n=== Bike 객체 생성 ===");
        Bike bike = new Bike("할리", 2022, true);
        System.out.println();

        System.out.println("=== Bike 정보 출력 ===");
        bike.displayInfo();
        System.out.println();

        System.out.println("=== Bike 운전 ===");
        bike.drive();
    }
}
