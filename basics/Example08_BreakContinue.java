package basics;

// break와 continue 학습
// 반복문 제어

public class Example08_BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== break 기본 사용 ===");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i가 5이므로 반복 종료");
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== continue 기본 사용 ===");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // 짝수는 건너뛰고 다음 반복으로
            }
            System.out.println("홀수: " + i);
        }

        System.out.println("\n=== 특정 조건에서 break ===");
        int[] numbers = {1, 2, 3, 4, 5, 0, 6, 7};
        for (int num : numbers) {
            if (num == 0) {
                System.out.println("0을 발견했으므로 반복 종료");
                break;
            }
            System.out.println("숫자: " + num);
        }

        System.out.println("\n=== continue로 특정 값 건너뛰기 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n=== 중첩 반복에서 break ===");
        boolean found = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("찾음: (" + i + ", " + j + ")");
                    found = true;
                    break;  // 내부 loop만 종료
                }
            }
            if (found) break;  // 외부 loop 종료
        }

        System.out.println("\n=== 합계 계산하다가 음수 만나면 중단 ===");
        int[] values = {10, 20, 30, -5, 40};
        int sum = 0;
        for (int val : values) {
            if (val < 0) {
                System.out.println("음수 발견: " + val);
                break;
            }
            sum += val;
        }
        System.out.println("합계: " + sum);

        System.out.println("\n=== 소수 찾기 (break 사용) ===");
        int n = 17;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + "은 소수인가? " + isPrime);
    }
}
