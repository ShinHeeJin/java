package basics;

// 변수와 데이터 타입 학습
// 자바의 8가지 기본 타입: byte, short, int, long, float, double, char, boolean

public class Example01_Variables {
    public static void main(String[] args) {
        // 정수 타입
        byte byteVar = 127;                    // 1바이트 (-128 ~ 127)
        short shortVar = 32767;                // 2바이트 (-32768 ~ 32767)
        int intVar = 2147483647;               // 4바이트 (기본 정수 타입)
        long longVar = 9223372036854775807L;   // 8바이트 (L 접미사 필요)

        // 실수 타입
        float floatVar = 3.14f;                // 4바이트 (f 접미사 필요)
        double doubleVar = 3.14159265359;      // 8바이트 (기본 실수 타입)

        // 문자 타입
        char charVar = 'A';

        // 논리 타입
        boolean boolVar = true;

        System.out.println("=== 기본 데이터 타입 ===");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        // 참조 타입 (Reference Type)
        String stringVar = "Hello, Java!";     // 문자열
        System.out.println("\nString: " + stringVar);

        // 타입의 크기
        System.out.println("\n=== 타입의 크기 (바이트) ===");
        System.out.println("Integer.BYTES: " + Integer.BYTES);
        System.out.println("Double.BYTES: " + Double.BYTES);
    }
}
