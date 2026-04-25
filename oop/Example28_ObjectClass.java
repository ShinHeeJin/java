package oop;

// Object 클래스 학습
// 모든 클래스의 부모 클래스

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2(이름: " + name + ", 나이: " + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person2 person = (Person2) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

class Book2 {
    private String title;
    private String author;

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book2(제목: " + title + ", 저자: " + author + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book2)) {
            return false;
        }
        Book2 book = (Book2) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return (title + author).hashCode();
    }
}

public class Example28_ObjectClass {
    public static void main(String[] args) {
        System.out.println("=== toString() 메서드 ===");
        Person2 person1 = new Person2("김철수", 25);
        Person2 person2 = new Person2("이영희", 28);
        System.out.println(person1.toString());
        System.out.println(person2);  // toString() 자동 호출

        System.out.println("\n=== equals() 메서드 ===");
        Person2 person3 = new Person2("김철수", 25);
        System.out.println("person1과 person3이 같은가? " + person1.equals(person3));
        System.out.println("person1과 person2가 같은가? " + person1.equals(person2));
        System.out.println("person1과 person1이 같은가? " + person1.equals(person1));

        System.out.println("\n=== hashCode() 메서드 ===");
        System.out.println("person1의 hashCode: " + person1.hashCode());
        System.out.println("person3의 hashCode: " + person3.hashCode());
        System.out.println("person2의 hashCode: " + person2.hashCode());

        System.out.println("\n=== 참조 비교와 값 비교 ===");
        Book2 book1 = new Book2("자바의 정석", "남궁성");
        Book2 book2 = new Book2("자바의 정석", "남궁성");
        Book2 book3 = book1;

        System.out.println("book1 == book2: " + (book1 == book2));  // 참조 비교
        System.out.println("book1.equals(book2): " + book1.equals(book2));  // 값 비교
        System.out.println("book1 == book3: " + (book1 == book3));  // 참조 비교 (같은 객체)

        System.out.println("\n=== getClass() 메서드 ===");
        System.out.println("person1의 클래스: " + person1.getClass());
        System.out.println("person1의 클래스명: " + person1.getClass().getName());

        System.out.println("\n=== instanceof 연산자 ===");
        Object obj = new Person2("박지원", 30);
        System.out.println("obj는 Person2인가? " + (obj instanceof Person2));
        System.out.println("obj는 Object인가? " + (obj instanceof Object));
        System.out.println("obj는 String인가? " + (obj instanceof String));
    }
}
