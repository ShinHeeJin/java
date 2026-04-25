package basics;

// 연산자 학습
// 산술연산자, 비교연산자, 논리연산자, 비트연산자

public class Example02_Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("=== 산술 연산자 ===");
        System.out.println("a + b = " + (a + b));     // 덧셈
        System.out.println("a - b = " + (a - b));     // 뺄셈
        System.out.println("a * b = " + (a * b));     // 곱셈
        System.out.println("a / b = " + (a / b));     // 정수 나눗셈 (몫)
        System.out.println("a % b = " + (a % b));     // 나머지
        System.out.println("a++ = " + (a++));         // 후위 증감
        System.out.println("++a = " + (++a));         // 전위 증감

        System.out.println("\n=== 비교 연산자 ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("\n=== 논리 연산자 ===");
        boolean x = true, y = false;
        System.out.println("x && y (AND): " + (x && y));
        System.out.println("x || y (OR): " + (x || y));
        System.out.println("!x (NOT): " + (!x));

        System.out.println("\n=== 단락 평가 (Short-circuit) ===");
        // && : 첫 번째가 false면 두 번째를 평가하지 않음
        // || : 첫 번째가 true면 두 번째를 평가하지 않음
        boolean result = false && (5 > 10);  // 두 번째 조건 평가 안 함
        System.out.println("false && (5 > 10): " + result);

        System.out.println("\n=== 조건 연산자 (삼항 연산자) ===");
        int max = (a > b) ? a : b;
        System.out.println("더 큰 값: " + max);

        System.out.println("\n=== 비트 연산자 ===");
        int num1 = 5;      // 0101
        int num2 = 3;      // 0011
        System.out.println("num1 & num2 (AND): " + (num1 & num2));   // 0001 = 1
        System.out.println("num1 | num2 (OR): " + (num1 | num2));    // 0111 = 7
        System.out.println("num1 ^ num2 (XOR): " + (num1 ^ num2));   // 0110 = 6
        System.out.println("~num1 (NOT): " + (~num1));
        System.out.println("num1 << 1 (좌측 시프트): " + (num1 << 1)); // 1010 = 10
        System.out.println("num1 >> 1 (우측 시프트): " + (num1 >> 1)); // 0010 = 2
    }
}
