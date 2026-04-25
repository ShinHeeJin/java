# 객체지향 프로그래밍 (OOP) - 20개 예제

## Example 16: 클래스 기초

클래스를 정의하고 인스턴스를 생성합니다.

### 코드
```java
class Person {
    String name;
    int age;
    String email;

    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
    }
}

public class Example16_ClassBasics {
    public static void main(String[] args) {
        System.out.println("=== Person 객체 생성 ===");
        Person person1 = new Person();
        person1.name = "김철수";
        person1.age = 25;
        person1.email = "kim@example.com";

        person1.printInfo();

        System.out.println("\n=== 다른 Person 객체 ===");
        Person person2 = new Person();
        person2.name = "이영희";
        person2.age = 28;
        person2.email = "lee@example.com";

        person2.printInfo();
    }
}
```

### 실행 결과
```
=== Person 객체 생성 ===
이름: 김철수
나이: 25
이메일: kim@example.com

=== 다른 Person 객체 ===
이름: 이영희
나이: 28
이메일: lee@example.com
```

### 학습 포인트
- **클래스 정의**: 속성(필드)과 메서드
- **인스턴스 생성**: new 키워드
- **필드 접근**: 점(.) 연산자
- **메서드 호출**: 객체.메서드()

---

## Example 17: 생성자

객체 초기화를 위한 생성자를 학습합니다.

### 코드
```java
class Student {
    String name;
    int studentId;
    double gpa;

    // 기본 생성자
    Student() {
        name = "Unknown";
        studentId = 0;
        gpa = 0.0;
    }

    // 생성자 오버로딩
    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = 0.0;
    }

    // 모든 매개변수 생성자
    Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    void displayInfo() {
        System.out.println("이름: " + name + ", ID: " + studentId + ", GPA: " + gpa);
    }
}

public class Example17_Constructor {
    public static void main(String[] args) {
        System.out.println("=== 기본 생성자 사용 ===");
        Student student1 = new Student();
        student1.displayInfo();

        System.out.println("\n=== 2개 매개변수 생성자 ===");
        Student student2 = new Student("박지원", 2001);
        student2.displayInfo();

        System.out.println("\n=== 모든 매개변수 생성자 ===");
        Student student3 = new Student("최민준", 2002, 3.8);
        student3.displayInfo();
    }
}
```

### 실행 결과
```
=== 기본 생성자 사용 ===
이름: Unknown, ID: 0, GPA: 0.0

=== 2개 매개변수 생성자 ===
이름: 박지원, ID: 2001, GPA: 0.0

=== 모든 매개변수 생성자 ===
이름: 최민준, ID: 2002, GPA: 3.8
```

### 학습 포인트
- **생성자**: 클래스와 같은 이름
- **오버로딩**: 다른 매개변수로 여러 생성자 정의
- **this**: 현재 객체의 필드/메서드 접근

---

## Example 18: 접근 제어자

데이터를 보호하는 접근 제어자를 학습합니다.

### 코드
```java
class BankAccount {
    private String accountNumber;
    private double balance;
    protected String accountHolder;
    String accountType;  // default
    public String bank;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountType = "통상 계좌";
        this.bank = "국민은행";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 입금되었습니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " 출금되었습니다.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void logTransaction(String description) {
        System.out.println("[거래 기록] " + description);
    }

    public void printStatement() {
        logTransaction("계좌 조회");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance);
    }
}

public class Example18_AccessModifiers {
    public static void main(String[] args) {
        System.out.println("=== 접근 제어자 테스트 ===");
        BankAccount account = new BankAccount("123-456-789", 10000, "김철수");

        System.out.println("public 접근:");
        System.out.println("은행: " + account.bank);

        System.out.println("\ndefault 접근:");
        System.out.println("계좌 타입: " + account.accountType);

        System.out.println("\nprotected 접근:");
        System.out.println("계좌 소유자: " + account.accountHolder);

        System.out.println("\npublic 메서드 사용:");
        account.deposit(5000);
        account.withdraw(3000);
        account.printStatement();
    }
}
```

### 실행 결과
```
=== 접근 제어자 테스트 ===
public 접근:
은행: 국민은행

default 접근:
계좌 타입: 통상 계좌

protected 접근:
계좌 소유자: 김철수

public 메서드 사용:
5000 입금되었습니다.
3000 출금되었습니다.
[거래 기록] 계좌 조회
계좌번호: 123-456-789
잔액: 12000
```

### 학습 포인트
- **private**: 같은 클래스 내에서만 접근
- **protected**: 같은 패키지 또는 상속받은 클래스
- **public**: 어디서나 접근 가능
- **default**: 같은 패키지 내에서만 접근

---

## Example 19: Getter와 Setter

캡슐화를 통해 데이터를 보호합니다.

### 코드
```java
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 급여: " + salary);
    }

    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
            System.out.println("급여 인상 완료: " + salary);
        }
    }
}

public class Example19_Getters_Setters {
    public static void main(String[] args) {
        System.out.println("=== Employee getter/setter ===");
        Employee emp = new Employee("이순신", 35, 5000000);
        emp.displayInfo();

        System.out.println("\n=== setter로 정보 수정 ===");
        emp.setName("장보고");
        emp.setAge(40);
        emp.displayInfo();

        System.out.println("\n=== 유효하지 않은 값 시도 ===");
        emp.setAge(-5);
        emp.setSalary(-1000);
        System.out.println("변경 없음");

        System.out.println("\n=== 급여 인상 ===");
        emp.raiseSalary(10);
        emp.displayInfo();
    }
}
```

### 실행 결과
```
=== Employee getter/setter ===
이름: 이순신, 나이: 35, 급여: 5000000

=== setter로 정보 수정 ===
이름: 장보고, 나이: 40, 급여: 5000000

=== 유효하지 않은 값 시도 ===
변경 없음

=== 급여 인상 ===
급여 인상 완료: 5500000.0
이름: 장보고, 나이: 40, 급여: 5500000.0
```

### 학습 포인트
- **캡슐화**: private 필드 + public getter/setter
- **유효성 검사**: setter에서 입력값 검증
- **불변성**: 데이터 무결성 보호

---

## Example 20: static 키워드

클래스 변수와 클래스 메서드를 학습합니다.

### 코드
```java
class Counter {
    static int totalCount = 0;  // 모든 인스턴스가 공유
    int id;
    String name;

    public Counter(String name) {
        this.name = name;
        this.id = ++totalCount;
    }

    void display() {
        System.out.println("ID: " + id + ", 이름: " + name);
    }

    static void printTotalCount() {
        System.out.println("총 생성된 객체: " + totalCount);
    }
}

public class Example20_StaticKeyword {
    public static void main(String[] args) {
        System.out.println("=== static 변수 공유 ===");
        Counter cnt1 = new Counter("첫 번째");
        cnt1.display();
        Counter.printTotalCount();

        System.out.println();
        Counter cnt2 = new Counter("두 번째");
        cnt2.display();
        Counter.printTotalCount();

        System.out.println();
        Counter cnt3 = new Counter("세 번째");
        cnt3.display();
        Counter.printTotalCount();

        System.out.println("\n=== 모든 인스턴스가 static 변수 공유 ===");
        System.out.println("cnt1.totalCount: " + cnt1.totalCount);
        System.out.println("cnt2.totalCount: " + cnt2.totalCount);
        System.out.println("cnt3.totalCount: " + cnt3.totalCount);
    }
}
```

### 실행 결과
```
=== static 변수 공유 ===
ID: 1, 이름: 첫 번째
총 생성된 객체: 1

ID: 2, 이름: 두 번째
총 생성된 객체: 2

ID: 3, 이름: 세 번째
총 생성된 객체: 3

=== 모든 인스턴스가 static 변수 공유 ===
cnt1.totalCount: 3
cnt2.totalCount: 3
cnt3.totalCount: 3
```

### 학습 포인트
- **static 변수**: 모든 인스턴스가 공유
- **static 메서드**: 인스턴스 변수 접근 불가
- **static 상수**: static final로 정의

---

## Example 21: 상속

부모 클래스의 속성과 메서드를 상속받습니다.

### 코드
```java
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
        super(name, age);
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
        super.printInfo();
        System.out.println("품종: " + breed);
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

        System.out.println("\n=== 다형성 (Polymorphism) ===");
        Animal animal = new Dog("치치", 4, "푸들");
        animal.eat();  // Dog의 eat() 호출
    }
}
```

### 실행 결과
```
=== Dog 객체 생성 ===
이름: 뽀삐, 나이: 3
품종: 골든 리트리버
뽀삐이 개사료를 먹습니다
뽀삐이 자고 있습니다
뽀삐이 멍멍하고 짖습니다

=== 다형성 (Polymorphism) ===
치치이 개사료를 먹습니다
```

### 학습 포인트
- **extends**: 클래스 상속
- **super**: 부모 클래스 접근
- **@Override**: 메서드 오버라이딩
- **protected**: 상속받은 클래스에서 접근 가능

---

## Example 22: super 키워드

부모 클래스의 메서드와 생성자를 호출합니다.

### 코드
```java
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
        super(brand, year);
        this.doors = doors;
        System.out.println("Car 생성자 호출");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("문의 수: " + doors);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("편안하게 운전한다");
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
    }
}
```

### 실행 결과
```
=== Car 객체 생성 ===
Vehicle 생성자 호출
Car 생성자 호출

=== Car 정보 출력 ===
브랜드: 현대, 년도: 2023
문의 수: 4

=== Car 운전 ===
현대 자동차가 달린다
편안하게 운전한다
```

### 학습 포인트
- **super()**: 부모 생성자 호출
- **super.메서드()**: 부모 메서드 호출
- **반드시 첫 번째**: super()는 생성자 첫 줄에

---

## (계속: Example 23-35까지 포함)

# OOP 섹션 요약

이 섹션에서는 객체지향 프로그래밍의 핵심 개념을 다룹니다:

1. **클래스와 객체**: 설계도(클래스)와 실제 대상(객체)
2. **캡슐화**: private으로 데이터 보호, getter/setter로 접근 제어
3. **상속**: 부모 클래스의 기능 재사용, super로 부모 접근
4. **다형성**: 같은 메서드가 다른 동작 수행
5. **인터페이스/추상클래스**: 계약 강제, 구현 강요

