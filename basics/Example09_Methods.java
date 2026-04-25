package basics;

// 메서드 학습
// 메서드 선언, 호출, 반환값

public class Example09_Methods {

    // 매개변수 없고 반환값 없는 메서드
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // 매개변수 있고 반환값 없는 메서드
    public static void greet(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 매개변수 없고 반환값 있는 메서드
    public static int getRandomNumber() {
        return 42;
    }

    // 매개변수 있고 반환값 있는 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 여러 매개변수
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // 같은 이름의 메서드 (오버로딩)
    public static void print(int num) {
        System.out.println("정수: " + num);
    }

    public static void print(String str) {
        System.out.println("문자열: " + str);
    }

    public static void print(double num) {
        System.out.println("실수: " + num);
    }

    // 가변 길이 매개변수
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("=== 메서드 호출 ===");
        sayHello();
        greet("김철수");

        System.out.println("\n=== 반환값 받기 ===");
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);

        System.out.println("\n=== 메서드의 반환값 사용 ===");
        int randomNum = getRandomNumber();
        System.out.println("랜덤 숫자: " + randomNum);

        System.out.println("\n=== 평균 계산 ===");
        double avg = calculateAverage(80, 90, 100);
        System.out.println("평균: " + avg);

        System.out.println("\n=== 메서드 오버로딩 ===");
        print(100);
        print("Hello");
        print(3.14);

        System.out.println("\n=== 가변 길이 매개변수 ===");
        System.out.println("sum(1, 2) = " + sum(1, 2));
        System.out.println("sum(1, 2, 3, 4, 5) = " + sum(1, 2, 3, 4, 5));

        System.out.println("\n=== 메서드 체이닝 ===");
        int value = add(10, 20);
        int finalResult = add(value, 5);
        System.out.println("최종 결과: " + finalResult);
    }
}
