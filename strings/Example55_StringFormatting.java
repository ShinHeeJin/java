package strings;

// 문자열 포매팅 학습

public class Example55_StringFormatting {
    public static void main(String[] args) {
        System.out.println("=== String.format() ===");
        String formatted = String.format("이름: %s, 나이: %d", "Kim", 25);
        System.out.println(formatted);

        System.out.println("\n=== 정수 포매팅 ===");
        System.out.println(String.format("정수: %d", 42));
        System.out.println(String.format("8진수: %o", 42));
        System.out.println(String.format("16진수: %x", 42));

        System.out.println("\n=== 실수 포매팅 ===");
        System.out.println(String.format("실수: %.2f", 3.14159));
        System.out.println(String.format("과학 표기법: %e", 1234.5));

        System.out.println("\n=== printf() ===");
        System.out.printf("이름: %s, 점수: %d점\n", "Lee", 85);
        System.out.printf("가격: $%.2f\n", 19.99);
    }
}
