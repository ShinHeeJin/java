package exceptions;

// finally 블록 학습
// 예외 발생 여부와 관계없이 실행

public class Example74_Finally {
    public static void main(String[] args) {
        System.out.println("=== finally 블록 ===");

        System.out.println("예 1: 예외 발생");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("예외 처리됨");
        } finally {
            System.out.println("finally: 항상 실행됨\n");
        }

        System.out.println("예 2: 예외 미발생");
        try {
            System.out.println("try 블록 실행");
        } finally {
            System.out.println("finally: 항상 실행됨\n");
        }

        System.out.println("예 3: return이 있어도 finally 실행");
        testFinally();
    }

    public static void testFinally() {
        try {
            System.out.println("try 블록");
            return;
        } finally {
            System.out.println("finally: return 전에 실행됨");
        }
    }
}
