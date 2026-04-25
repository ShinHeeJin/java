# 예외 처리 (Exceptions) - 6개 예제

## Example 71: try-catch

예외를 처리합니다.

### 코드
```java
public class Example71_TryCatch {
    public static void main(String[] args) {
        System.out.println("=== 0으로 나누기 ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("에러: 0으로 나눌 수 없습니다");
        }

        System.out.println("\n=== 배열 범위 초과 ===");
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

        System.out.println("\nprogram ended");
    }
}
```

### 실행 결과
```
=== 0으로 나누기 ===
에러: 0으로 나눌 수 없습니다

=== 배열 범위 초과 ===
에러: 배열 범위 초과

=== 타입 변환 에러 ===
에러: 숫자로 변환할 수 없습니다

program ended
```

---

## Example 72: 다중 catch

여러 예외를 처리합니다.

### 코드
```java
public class Example72_MultipleCatch {
    public static void main(String[] args) {
        System.out.println("=== 다중 catch ===");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과");
        } catch (NullPointerException e) {
            System.out.println("null 참조");
        }

        System.out.println("\n=== 여러 예외 한 번에 처리 ===");
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("숫자 또는 산술 예외: " + e.getMessage());
        }
    }
}
```

### 실행 결과
```
=== 다중 catch ===
배열 범위 초과

=== 여러 예외 한 번에 처리 ===
숫자 또는 산술 예외: For input string: "abc"
```

---

## Example 73-76: 고급 예외 처리

try-with-resources, finally, throw/throws, 사용자 정의 예외

### try-with-resources 예제
```java
try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.out.println("에러: " + e.getMessage());
}
// reader는 자동으로 close됨
```

### 사용자 정의 예외
```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

void checkAge(int age) throws InvalidAgeException {
    if (age < 0) {
        throw new InvalidAgeException("나이는 음수일 수 없습니다");
    }
}
```

