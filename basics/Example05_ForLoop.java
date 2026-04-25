package basics;

// for 반복문 학습
// 고정 횟수 반복, 배열 순회

public class Example05_ForLoop {
    public static void main(String[] args) {
        System.out.println("=== 기본 for 문 ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n=== 중첩 for 문 (구구단) ===");
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단:");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
        }

        System.out.println("\n=== 배열 순회 ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\n=== 향상된 for 문 (for-each) ===");
        for (int num : numbers) {
            System.out.println("숫자: " + num);
        }

        System.out.println("\n=== 문자열 배열 순회 ===");
        String[] fruits = {"apple", "banana", "cherry"};
        for (String fruit : fruits) {
            System.out.println("과일: " + fruit);
        }

        System.out.println("\n=== 역방향 반복 ===");
        for (int i = 5; i > 0; i--) {
            System.out.println("카운트다운: " + i);
        }

        System.out.println("\n=== 별 찍기 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
