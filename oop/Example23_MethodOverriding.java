package oop;

// 메서드 오버라이딩 학습
// 부모 클래스의 메서드를 자식 클래스에서 재정의

class Shape {
    public void draw() {
        System.out.println("도형을 그립니다");
    }

    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("원을 그립니다");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("삼각형을 그립니다");
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}

public class Example23_MethodOverriding {
    public static void main(String[] args) {
        System.out.println("=== 메서드 오버라이딩 ===");
        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("넓이: " + circle.calculateArea());

        System.out.println();
        Shape rectangle = new Rectangle(4, 6);
        rectangle.draw();
        System.out.println("넓이: " + rectangle.calculateArea());

        System.out.println();
        Shape triangle = new Triangle(3, 8);
        triangle.draw();
        System.out.println("넓이: " + triangle.calculateArea());

        System.out.println("\n=== 배열로 다양한 도형 처리 ===");
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        };

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("넓이: " + shape.calculateArea());
            System.out.println();
        }
    }
}
