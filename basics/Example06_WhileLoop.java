package basics;

// while 반복문 학습
// 조건이 참인 동안 반복

public class Example06_WhileLoop {
    public static void main(String[] args) {
        System.out.println("=== 기본 while 문 ===");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("\n=== 사용자 입력 시뮬레이션 (while) ===");
        int count = 1;
        while (count <= 3) {
            System.out.println("반복 " + count);
            count++;
        }

        System.out.println("\n=== 무한 루프 방지 ===");
        int sum = 0;
        int num = 1;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합: " + sum);

        System.out.println("\n=== 조건에 따른 while 문 ===");
        String input = "";
        int attempts = 0;
        while (!input.equals("exit") && attempts < 3) {
            input = "exit";  // 실제로는 Scanner로 입력받음
            attempts++;
        }
        System.out.println("반복 횟수: " + attempts);

        System.out.println("\n=== 반복 내에서 조건 확인 ===");
        int value = 100;
        while (true) {
            System.out.println("값: " + value);
            value -= 20;
            if (value < 0) {
                System.out.println("음수가 되었으므로 종료");
                break;
            }
        }

        System.out.println("\n=== 여러 조건의 while ===");
        int x = 1, y = 10;
        while (x < y && y > 5) {
            System.out.println("x: " + x + ", y: " + y);
            x++;
            y--;
        }
    }
}
