package oop;

// 인터페이스(Interface) 학습
// 계약(contract)을 정의하는 완전 추상 타입

interface Drawable {
    void draw();
    void erase();
}

interface Resizable {
    void resize(double factor);
}

interface Shape2 extends Drawable, Resizable {
    double getArea();
    double getPerimeter();
}

class Circle2 implements Shape2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다. 반지름: " + radius);
    }

    @Override
    public void erase() {
        System.out.println("원을 지웁니다");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("원의 크기를 " + factor + "배로 변경합니다. 새 반지름: " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle3 implements Shape2 {
    private double width, height;

    public Rectangle3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다. " + width + "x" + height);
    }

    @Override
    public void erase() {
        System.out.println("사각형을 지웁니다");
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("사각형의 크기를 " + factor + "배로 변경합니다");
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

interface Printable {
    void print();
}

class Document implements Printable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("문서 출력: " + content);
    }
}

public class Example32_Interface {
    public static void main(String[] args) {
        System.out.println("=== 인터페이스 구현 (Circle) ===");
        Circle2 circle = new Circle2(5);
        circle.draw();
        System.out.println("넓이: " + circle.getArea());
        System.out.println("둘레: " + circle.getPerimeter());
        circle.resize(2);
        System.out.println("새 넓이: " + circle.getArea());
        circle.erase();

        System.out.println("\n=== 인터페이스 구현 (Rectangle) ===");
        Rectangle3 rect = new Rectangle3(4, 6);
        rect.draw();
        System.out.println("넓이: " + rect.getArea());
        System.out.println("둘레: " + rect.getPerimeter());

        System.out.println("\n=== 다형성 (인터페이스) ===");
        Shape2[] shapes = {
            new Circle2(5),
            new Rectangle3(3, 4)
        };

        for (Shape2 shape : shapes) {
            shape.draw();
            System.out.println("넓이: " + shape.getArea());
            System.out.println();
        }

        System.out.println("\n=== Drawable 인터페이스만 사용 ===");
        Drawable[] drawables = {
            new Circle2(3),
            new Rectangle3(2, 5),
            new Document("테스트")
        };

        for (Drawable drawable : drawables) {
            drawable.draw();
        }

        System.out.println("\n=== 인터페이스의 장점 ===");
        System.out.println("- 계약 강제");
        System.out.println("- 다중 구현 가능");
        System.out.println("- 느슨한 결합");
    }
}
