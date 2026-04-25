package oop;

// 생성자 학습
// 객체 초기화

class Student {
    String name;
    int studentId;
    double gpa;

    // 기본 생성자 (매개변수 없음)
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

    // 모든 매개변수를 받는 생성자
    Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    void displayInfo() {
        System.out.println("이름: " + name + ", ID: " + studentId + ", GPA: " + gpa);
    }
}

class Book {
    String title;
    String author;
    int pages;
    double price;

    // 생성자
    Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    void printDetails() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("페이지: " + pages);
        System.out.println("가격: " + price);
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

        System.out.println("\n=== Book 클래스 생성자 ===");
        Book book1 = new Book("자바의 정석", "남궁성", 1000, 50000);
        book1.printDetails();

        System.out.println("\n");
        Book book2 = new Book("Effective Java", "Joshua Bloch", 416, 45000);
        book2.printDetails();
    }
}
