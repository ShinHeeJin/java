package basics;

// if 문 학습
// if, else if, else 문의 사용법

public class Example03_IfStatement {
    public static void main(String[] args) {
        int score = 85;

        System.out.println("=== 기본 if 문 ===");
        if (score >= 90) {
            System.out.println("A 학점입니다");
        }

        System.out.println("\n=== if-else 문 ===");
        if (score >= 60) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }

        System.out.println("\n=== if-else if-else 문 ===");
        if (score >= 90) {
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70) {
            System.out.println("학점: C");
        } else if (score >= 60) {
            System.out.println("학점: D");
        } else {
            System.out.println("학점: F");
        }

        System.out.println("\n=== 중첩 if 문 ===");
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("운전할 수 있습니다");
            } else {
                System.out.println("면허를 취득하세요");
            }
        } else {
            System.out.println("성인이 되세요");
        }

        System.out.println("\n=== 복잡한 조건 ===");
        int temperature = 25;
        boolean isSunny = true;

        if (temperature > 20 && isSunny) {
            System.out.println("산책하기 좋은 날씨입니다");
        }

        if (temperature < 0 || temperature > 35) {
            System.out.println("바깥나가기 힘든 날씨입니다");
        }
    }
}
