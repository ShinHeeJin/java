package exceptions;

// throw와 throws 학습

public class Example75_ThrowThrows {

    // throws: 메서드가 예외를 던진다는 선언
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("나이는 음수일 수 없습니다");
        }
        System.out.println("나이: " + age);
    }

    // throw: 명시적으로 예외 발생
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        System.out.println("결과: " + (a / b));
    }

    public static void main(String[] args) {
        System.out.println("=== throw 사용 ===");
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("에러: " + e.getMessage());
        }

        System.out.println("\n=== throws 사용 ===");
        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }
    }
}
