package oop;

// 메서드 오버로딩 학습
// 같은 이름의 메서드를 다른 매개변수로 정의

class Calculator {
    // int 2개
    public int add(int a, int b) {
        return a + b;
    }

    // double 2개
    public double add(double a, double b) {
        return a + b;
    }

    // int 3개
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // double 3개
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // int와 double
    public double add(int a, double b) {
        return a + b;
    }

    // 뺄셈
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // 곱셈
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // 나눗셈
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            return 0;
        }
        return (double) a / b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            return 0;
        }
        return a / b;
    }
}

public class Example24_MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== 덧셈 ===");
        System.out.println("add(5, 3) = " + calc.add(5, 3));
        System.out.println("add(5.5, 3.2) = " + calc.add(5.5, 3.2));
        System.out.println("add(1, 2, 3) = " + calc.add(1, 2, 3));
        System.out.println("add(1.1, 2.2, 3.3) = " + calc.add(1.1, 2.2, 3.3));
        System.out.println("add(5, 3.5) = " + calc.add(5, 3.5));

        System.out.println("\n=== 뺄셈 ===");
        System.out.println("subtract(10, 3) = " + calc.subtract(10, 3));
        System.out.println("subtract(10.5, 3.2) = " + calc.subtract(10.5, 3.2));

        System.out.println("\n=== 곱셈 ===");
        System.out.println("multiply(4, 5) = " + calc.multiply(4, 5));
        System.out.println("multiply(4.5, 2.5) = " + calc.multiply(4.5, 2.5));

        System.out.println("\n=== 나눗셈 ===");
        System.out.println("divide(10, 3) = " + calc.divide(10, 3));
        System.out.println("divide(10.5, 2.5) = " + calc.divide(10.5, 2.5));
        System.out.println("divide(10, 0) = " + calc.divide(10, 0));
    }
}
