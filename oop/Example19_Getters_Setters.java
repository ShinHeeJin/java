package oop;

// Getter와 Setter 학습
// 캡슐화를 통한 데이터 보호

class Employee {
    private String name;
    private int age;
    private double salary;

    // 생성자
    public Employee(String name, int age, double salary) {
        this.name = name;
        setAge(age);  // setter 사용해 유효성 검사
        setSalary(salary);  // setter 사용해 유효성 검사
    }

    // name에 대한 getter와 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("유효하지 않은 이름입니다");
        }
    }

    // age에 대한 getter와 setter (유효성 검사 포함)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("유효하지 않은 나이입니다");
        }
    }

    // salary에 대한 getter와 setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("급여는 음수일 수 없습니다");
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

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("너비는 양수여야 합니다");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("높이는 양수여야 합니다");
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
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
        emp.setAge(-5);  // 유효성 검사
        emp.setSalary(-1000);  // 유효성 검사

        System.out.println("\n=== 급여 인상 ===");
        emp.raiseSalary(10);
        emp.displayInfo();

        System.out.println("\n=== Rectangle getter/setter ===");
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("너비: " + rect.getWidth());
        System.out.println("높이: " + rect.getHeight());
        System.out.println("넓이: " + rect.getArea());
        System.out.println("둘레: " + rect.getPerimeter());

        System.out.println("\n=== 크기 변경 ===");
        rect.setWidth(8);
        rect.setHeight(12);
        System.out.println("넓이: " + rect.getArea());
        System.out.println("둘레: " + rect.getPerimeter());

        System.out.println("\n=== 유효하지 않은 크기 ===");
        rect.setWidth(-5);  // 유효성 검사
    }
}
