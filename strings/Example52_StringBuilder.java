package strings;

// StringBuilder 학습
// 가변성 문자열

public class Example52_StringBuilder {
    public static void main(String[] args) {
        System.out.println("=== StringBuilder 생성 ===");
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("=== append (추가) ===");
        sb.append(" ");
        sb.append("World");
        System.out.println("결과: " + sb.toString());

        System.out.println("\n=== insert (삽입) ===");
        sb.insert(5, ",");
        System.out.println("결과: " + sb.toString());

        System.out.println("\n=== delete (삭제) ===");
        sb.delete(5, 6);
        System.out.println("결과: " + sb.toString());

        System.out.println("\n=== reverse (역순) ===");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("원본: " + sb2);
        System.out.println("역순: " + sb2.reverse());

        System.out.println("\n=== 성능 비교 ===");
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1000; i++) {
            str += "a";  // 느림
        }
        long stringTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb3.append("a");  // 빠름
        }
        long builderTime = System.currentTimeMillis() - startTime;

        System.out.println("String 연결 시간: " + stringTime + "ms");
        System.out.println("StringBuilder 시간: " + builderTime + "ms");
    }
}
