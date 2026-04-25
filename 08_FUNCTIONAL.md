# 함수형 프로그래밍 (Functional Programming) - 15개 예제

## Example 91: Lambda 표현식

함수형 프로그래밍의 기초입니다.

### 코드
```java
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Example91_Lambda {
    public static void main(String[] args) {
        System.out.println("=== Lambda 표현식 ===");

        MathOperation add = (a, b) -> a + b;
        System.out.println("5 + 3 = " + add.operation(5, 3));

        MathOperation subtract = (a, b) -> a - b;
        System.out.println("5 - 3 = " + subtract.operation(5, 3));

        MathOperation multiply = (a, b) -> a * b;
        System.out.println("5 * 3 = " + multiply.operation(5, 3));

        System.out.println("\n=== 메서드로 Lambda 전달 ===");
        executeOperation(10, 5, (a, b) -> a + b);
        executeOperation(10, 5, (a, b) -> a - b);
    }

    public static void executeOperation(int a, int b, MathOperation op) {
        System.out.println("결과: " + op.operation(a, b));
    }
}
```

### 실행 결과
```
=== Lambda 표현식 ===
5 + 3 = 8
5 - 3 = 2
5 * 3 = 15

=== 메서드로 Lambda 전달 ===
결과: 15
결과: 5
```

---

## Example 97: Stream 기초

Stream API를 학습합니다.

### 코드
```java
import java.util.Arrays;
import java.util.List;

public class Example97_StreamBasics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== forEach ===");
        numbers.stream().forEach(System.out::println);

        System.out.println("\n=== filter ===");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        System.out.println("\n=== map ===");
        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);

        System.out.println("\n=== count ===");
        long count = numbers.stream()
                           .filter(n -> n > 2)
                           .count();
        System.out.println("2보다 큰 숫자: " + count);

        System.out.println("\n=== reduce (합계) ===");
        int sum = numbers.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println("합계: " + sum);
    }
}
```

### 실행 결과
```
=== forEach ===
1
2
3
4
5

=== filter ===
2
4

=== map ===
2
4
6
8
10

=== count ===
2보다 큰 숫자: 3

=== reduce (합계) ===
합계: 15
```

---

## Example 98-105: 고급 Stream 연산

filter, map, reduce, collect, 병렬 Stream, 터미널 연산

### Stream 메서드 분류

**중간 연산** (Intermediate Operations):
- filter, map, sorted, distinct, limit, skip, flatMap

**터미널 연산** (Terminal Operations):
- forEach, collect, reduce, count, findFirst, findAny, anyMatch, allMatch

### 실제 활용 예제
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// 2보다 큰 짝수의 제곱값의 합계
int result = numbers.stream()
                   .filter(n -> n > 2)
                   .filter(n -> n % 2 == 0)
                   .map(n -> n * n)
                   .reduce(0, Integer::sum);
System.out.println("결과: " + result);  // 4+16+36+64 = 120
```

