package basics;

// 타입 변환(Casting) 학습
// 자동 변환과 강제 변환

public class Example15_Casting {
    public static void main(String[] args) {
        System.out.println("=== 자동 타입 변환 (Widening) ===");
        // 작은 크기 -> 큰 크기 (자동)
        int intVal = 100;
        long longVal = intVal;  // 자동 변환
        System.out.println("int -> long: " + longVal);

        int intVal2 = 50;
        double doubleVal = intVal2;  // 자동 변환
        System.out.println("int -> double: " + doubleVal);

        System.out.println("\n=== 강제 타입 변환 (Narrowing) ===");
        // 큰 크기 -> 작은 크기 (강제)
        double doubleVal2 = 3.14;
        int intVal3 = (int) doubleVal2;  // 강제 변환 (소수 부분 손실)
        System.out.println("double -> int: " + intVal3);

        long longVal2 = 100000;
        int intVal4 = (int) longVal2;  // 강제 변환
        System.out.println("long -> int: " + intVal4);

        System.out.println("\n=== 범위 초과 시 강제 변환 ===");
        long bigNum = 300;
        byte smallNum = (byte) bigNum;  // 범위 초과
        System.out.println("long(300) -> byte: " + smallNum);

        System.out.println("\n=== 문자와 숫자 변환 ===");
        char charVal = 'A';
        int asciiVal = charVal;  // 자동 변환
        System.out.println("'A' -> int: " + asciiVal);

        int asciiVal2 = 66;
        char charVal2 = (char) asciiVal2;  // 강제 변환
        System.out.println("int(66) -> char: " + charVal2);

        System.out.println("\n=== 부동소수점 연산 ===");
        int num1 = 7;
        int num2 = 2;
        System.out.println("7 / 2 (정수 나눗셈) = " + (num1 / num2));
        System.out.println("7 / 2.0 (실수 나눗셈) = " + (num1 / 2.0));
        System.out.println("(double)7 / 2 = " + ((double) num1 / num2));

        System.out.println("\n=== 문자열과 숫자 변환 ===");
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("문자열 \"123\" -> int: " + parsedInt);

        String doubleStr = "3.14";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("문자열 \"3.14\" -> double: " + parsedDouble);

        System.out.println("\n=== 숫자를 문자열로 변환 ===");
        int val = 42;
        String strVal = String.valueOf(val);
        System.out.println("int -> String: " + strVal);

        double val2 = 3.14;
        String strVal2 = String.valueOf(val2);
        System.out.println("double -> String: " + strVal2);

        System.out.println("\n=== Boolean 변환 ===");
        String boolStr = "true";
        boolean boolVal = Boolean.parseBoolean(boolStr);
        System.out.println("문자열 \"true\" -> boolean: " + boolVal);

        System.out.println("\n=== 타입 확인 및 변환 (instanceof) ===");
        Object obj = "Hello";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("String으로 안전하게 변환: " + str);
        }
    }
}
