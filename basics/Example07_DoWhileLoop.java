package basics;

// do-while 반복문 학습
// 최소 한 번은 실행되는 반복문

public class Example07_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("=== 기본 do-while 문 ===");
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        System.out.println("\n=== while과 do-while의 차이 ===");
        System.out.println("while (0 < 0):");
        int count = 0;
        while (count < 0) {
            System.out.println("실행됨");
        }
        System.out.println("(실행 안 됨)");

        System.out.println("\ndo-while (0 < 0):");
        do {
            System.out.println("최소 한 번은 실행됨");
        } while (count < 0);

        System.out.println("\n=== 메뉴 선택 시뮬레이션 ===");
        int choice = 0;
        do {
            System.out.println("1. 계속");
            System.out.println("2. 종료");
            choice = 2;  // 실제로는 Scanner로 입력받음

            if (choice == 1) {
                System.out.println("계속합니다");
            } else if (choice == 2) {
                System.out.println("종료합니다");
            }
        } while (choice != 2);

        System.out.println("\n=== 입력 검증 시뮬레이션 ===");
        int score = 0;
        do {
            score = 95;  // 실제로는 사용자 입력
            if (score < 0 || score > 100) {
                System.out.println("유효하지 않은 점수입니다");
            } else {
                System.out.println("유효한 점수입니다: " + score);
            }
        } while (score < 0 || score > 100);

        System.out.println("\n=== 숫자 역순 출력 ===");
        int num = 5;
        do {
            System.out.print(num + " ");
            num--;
        } while (num > 0);
        System.out.println();
    }
}
