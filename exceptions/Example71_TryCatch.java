package exceptions;

// try-catch 학습

public class Example71_TryCatch {
    public static void main(String[] args) {
        System.out.println("=== 기본 try-catch ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("에러: 0으로 나눌 수 없습니다");
            System.out.println("메시지: " + e.getMessage());
        }

        System.out.println("\n=== 배열 인덱스 에러 ===");
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("에러: 배열 범위 초과");
        }

        System.out.println("\n=== 타입 변환 에러 ===");
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("에러: 숫자로 변환할 수 없습니다");
        }

        System.out.println("\n=== null 참조 에러 ===");
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("에러: null 참조입니다");
        }

        System.out.println("\nprogram ended");
    }
}
