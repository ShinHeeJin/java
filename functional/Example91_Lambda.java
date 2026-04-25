package functional;

// Lambda 표현식 학습
// 함수형 프로그래밍

interface MathOperation {
    int operation(int a, int b);
}

interface Greeting {
    void greet(String name);
}

public class Example91_Lambda {
    public static void main(String[] args) {
        System.out.println("=== Lambda 표현식 ===");

        // 덧셈
        MathOperation add = (a, b) -> a + b;
        System.out.println("5 + 3 = " + add.operation(5, 3));

        // 뺄셈
        MathOperation subtract = (a, b) -> a - b;
        System.out.println("5 - 3 = " + subtract.operation(5, 3));

        // 곱셈
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("5 * 3 = " + multiply.operation(5, 3));

        // 나눗셈
        MathOperation divide = (a, b) -> a / b;
        System.out.println("5 / 3 = " + divide.operation(5, 3));

        System.out.println("\n=== 문자열 처리 ===");
        Greeting greet = name -> System.out.println("안녕하세요, " + name + "!");
        greet.greet("Kim");
        greet.greet("Lee");

        System.out.println("\n=== 메서드로 Lambda 전달 ===");
        executeOperation(10, 5, (a, b) -> a + b);
        executeOperation(10, 5, (a, b) -> a - b);
    }

    public static void executeOperation(int a, int b, MathOperation op) {
        System.out.println("결과: " + op.operation(a, b));
    }
}
