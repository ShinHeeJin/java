# 자바 기초 (Basics) - 15개 예제

## Example 01: 변수와 데이터 타입

자바의 8가지 기본 데이터 타입을 학습합니다.

### 코드
```java
public class Example01_Variables {
    public static void main(String[] args) {
        // 정수 타입
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        // 실수 타입
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;

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

        String stringVar = "Hello, Java!";
        System.out.println("\nString: " + stringVar);

        System.out.println("\n=== 타입의 크기 (바이트) ===");
        System.out.println("Integer.BYTES: " + Integer.BYTES);
        System.out.println("Double.BYTES: " + Double.BYTES);
    }
}
```

### 실행 결과
```
=== 기본 데이터 타입 ===
byte: 127
short: 32767
int: 2147483647
long: 9223372036854775807
float: 3.14
double: 3.14159265359
char: A
boolean: true

String: Hello, Java!

=== 타입의 크기 (바이트) ===
Integer.BYTES: 4
Double.BYTES: 8
```

### 학습 포인트
- **기본 타입**: byte(1), short(2), int(4), long(8), float(4), double(8), char(2), boolean(1)
- **참조 타입**: String, 배열, 클래스 등
- **타입 접미사**: long은 L, float은 f 필수

---

## Example 02: 연산자

산술, 비교, 논리, 비트 연산자를 학습합니다.

### 코드
```java
public class Example02_Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("=== 산술 연산자 ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n=== 비교 연산자 ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("\n=== 논리 연산자 ===");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("\n=== 조건 연산자 (삼항) ===");
        int max = (a > b) ? a : b;
        System.out.println("더 큰 값: " + max);

        System.out.println("\n=== 비트 연산자 ===");
        int num1 = 5;      // 0101
        int num2 = 3;      // 0011
        System.out.println("num1 & num2: " + (num1 & num2));
        System.out.println("num1 | num2: " + (num1 | num2));
        System.out.println("num1 ^ num2: " + (num1 ^ num2));
        System.out.println("num1 << 1: " + (num1 << 1));
        System.out.println("num1 >> 1: " + (num1 >> 1));
    }
}
```

### 실행 결과
```
=== 산술 연산자 ===
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1

=== 비교 연산자 ===
a > b: true
a < b: false
a == b: false
a != b: true

=== 논리 연산자 ===
x && y: false
x || y: true
!x: false

=== 조건 연산자 (삼항) ===
더 큰 값: 10

=== 비트 연산자 ===
num1 & num2: 1
num1 | num2: 7
num1 ^ num2: 6
num1 << 1: 10
num1 >> 1: 2
```

### 학습 포인트
- **산술**: +, -, *, /, %
- **비교**: >, <, >=, <=, ==, !=
- **논리**: &&(AND), ||(OR), !(NOT)
- **비트**: &, |, ^, ~, <<, >>
- **삼항**: condition ? trueValue : falseValue

---

## Example 03: if 문

조건에 따라 코드를 실행하는 방법을 학습합니다.

### 코드
```java
public class Example03_IfStatement {
    public static void main(String[] args) {
        int score = 85;

        System.out.println("=== if-else if-else ===");
        if (score >= 90) {
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70) {
            System.out.println("학점: C");
        } else {
            System.out.println("학점: F");
        }

        System.out.println("\n=== 중첩 if ===");
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
        } else {
            System.out.println("괜찮은 날씨입니다");
        }
    }
}
```

### 실행 결과
```
=== if-else if-else ===
학점: B

=== 중첩 if ===
운전할 수 있습니다

=== 복잡한 조건 ===
산책하기 좋은 날씨입니다
괜찮은 날씨입니다
```

### 학습 포인트
- **if**: 단일 조건 처리
- **if-else**: 두 가지 경우 처리
- **if-else if-else**: 여러 조건 처리
- **논리 연산자 조합**: && (AND), || (OR)

---

## Example 04: switch 문

여러 조건을 효율적으로 처리합니다.

### 코드
```java
public class Example04_SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        System.out.println("=== 기본 switch 문 ===");
        switch (day) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            case 4:
                dayName = "목요일";
                break;
            case 5:
                dayName = "금요일";
                break;
            case 6:
                dayName = "토요일";
                break;
            case 7:
                dayName = "일요일";
                break;
            default:
                dayName = "유효하지 않은 날짜";
        }
        System.out.println("요일: " + dayName);

        System.out.println("\n=== fall-through (여러 case) ===");
        int month = 3;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "유효하지 않은 월";
        }
        System.out.println("계절: " + season);

        System.out.println("\n=== String switch (Java 7+) ===");
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("빨간 과일입니다");
                break;
            case "banana":
                System.out.println("노란 과일입니다");
                break;
            default:
                System.out.println("알 수 없는 과일입니다");
        }

        System.out.println("\n=== switch 표현식 (Java 14+) ===");
        int grade = 2;
        String message = switch (grade) {
            case 1 -> "좋은 성적입니다";
            case 2 -> "평범한 성적입니다";
            case 3 -> "안 좋은 성적입니다";
            default -> "유효하지 않은 성적";
        };
        System.out.println(message);
    }
}
```

### 실행 결과
```
=== 기본 switch 문 ===
요일: 수요일

=== fall-through (여러 case) ===
계절: 봄

=== String switch (Java 7+) ===
빨간 과일입니다

=== switch 표현식 (Java 14+) ===
평범한 성적입니다
```

### 학습 포인트
- **break**: case를 벗어나기 위해 필수
- **fall-through**: break 없으면 다음 case 실행
- **default**: 어떤 case도 일치하지 않을 때 실행
- **String 비교**: switch에서 String 사용 가능

---

## Example 05: for 반복문

정해진 횟수만큼 반복합니다.

### 코드
```java
public class Example05_ForLoop {
    public static void main(String[] args) {
        System.out.println("=== 기본 for 문 ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n=== 배열 순회 ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\n=== 향상된 for 문 (for-each) ===");
        for (int num : numbers) {
            System.out.println("숫자: " + num);
        }

        System.out.println("\n=== 중첩 for (구구단) ===");
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "×" + j + "=" + (i*j) + "  ");
            }
            System.out.println();
        }

        System.out.println("\n=== 별 찍기 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### 실행 결과
```
=== 기본 for 문 ===
i = 0
i = 1
i = 2
i = 3
i = 4

=== 배열 순회 ===
numbers[0] = 10
numbers[1] = 20
numbers[2] = 30
numbers[3] = 40
numbers[4] = 50

=== 향상된 for 문 (for-each) ===
숫자: 10
숫자: 20
숫자: 30
숫자: 40
숫자: 50

=== 중첩 for (구구단) ===
2×1=2  2×2=4  2×3=6  
3×1=3  3×2=6  3×3=9  
4×1=4  4×2=8  4×3=12  

=== 별 찍기 ===
* 
* * 
* * * 
* * * * 
* * * * * 
```

### 학습 포인트
- **기본 for**: 초기값, 조건, 증감식
- **for-each**: 배열/컬렉션 순회 (값만 필요할 때)
- **중첩 루프**: for 안에 for (2D 배열, 패턴 등)
- **break/continue**: 루프 제어

---

## Example 06: while 반복문

조건이 참인 동안 반복합니다.

### 코드
```java
public class Example06_WhileLoop {
    public static void main(String[] args) {
        System.out.println("=== 기본 while 문 ===");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("\n=== 누적 합계 ===");
        int sum = 0;
        int num = 1;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합: " + sum);

        System.out.println("\n=== 역방향 반복 ===");
        int x = 5;
        while (x > 0) {
            System.out.println("카운트다운: " + x);
            x--;
        }

        System.out.println("\n=== 여러 조건의 while ===");
        int a = 1, b = 10;
        while (a < b && b > 5) {
            System.out.println("a: " + a + ", b: " + b);
            a++;
            b--;
        }
    }
}
```

### 실행 결과
```
=== 기본 while 문 ===
i = 0
i = 1
i = 2
i = 3
i = 4

=== 누적 합계 ===
1부터 10까지의 합: 55

=== 역방향 반복 ===
카운트다운: 5
카운트다운: 4
카운트다운: 3
카운트다운: 2
카운트다운: 1

=== 여러 조건의 while ===
a: 1, b: 10
a: 2, b: 9
a: 3, b: 8
a: 4, b: 7
a: 5, b: 6
```

### 학습 포인트
- **while**: 조건이 false가 될 때까지 반복
- **무한 루프 방지**: 반드시 탈출 조건 필요
- **for vs while**: for는 횟수, while은 조건 기반

---

## Example 07: do-while 반복문

최소 한 번은 실행되는 반복문입니다.

### 코드
```java
public class Example07_DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("=== while과 do-while의 차이 ===");
        System.out.println("while (조건이 false):");
        int count = 0;
        while (count < 0) {
            System.out.println("실행됨");
        }
        System.out.println("(실행 안 됨)\n");

        System.out.println("do-while (조건이 false):");
        do {
            System.out.println("최소 한 번은 실행됨");
        } while (count < 0);

        System.out.println("\n=== do-while 기본 ===");
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        System.out.println("\n=== 입력 검증 (메뉴 선택) ===");
        int choice = 0;
        do {
            choice = 2;  // 실제로는 사용자 입력
            if (choice == 1) {
                System.out.println("선택: 계속");
            } else if (choice == 2) {
                System.out.println("선택: 종료");
            }
        } while (choice != 2);
    }
}
```

### 실행 결과
```
=== while과 do-while의 차이 ===
while (조건이 false):
(실행 안 됨)

do-while (조건이 false):
최소 한 번은 실행됨

=== do-while 기본 ===
i = 0
i = 1
i = 2
i = 3
i = 4

=== 입력 검증 (메뉴 선택) ===
선택: 종료
```

### 학습 포인트
- **do-while**: 조건 확인 전에 최소 1회 실행
- **while vs do-while**: while은 조건이 false면 미실행, do-while은 항상 1회 이상 실행
- **입력 검증**: 유효한 입력까지 반복

---

## Example 08: break와 continue

반복문을 제어합니다.

### 코드
```java
public class Example08_BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== break 사용 ===");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i가 5이므로 반복 종료");
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== continue 사용 ===");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;  // 짝수는 건너뛰기
            }
            System.out.println("홀수: " + i);
        }

        System.out.println("\n=== 배열에서 특정 값 찾기 ===");
        int[] numbers = {1, 2, 3, 4, 5, 0, 6, 7};
        for (int num : numbers) {
            if (num == 0) {
                System.out.println("0을 발견했으므로 반복 종료");
                break;
            }
            System.out.println("숫자: " + num);
        }

        System.out.println("\n=== 특정 값 건너뛰기 ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== 소수 찾기 ===");
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
```

### 실행 결과
```
=== break 사용 ===
i = 0
i = 1
i = 2
i = 3
i = 4
i가 5이므로 반복 종료

=== continue 사용 ===
홀수: 1
홀수: 3
홀수: 5
홀수: 7
홀수: 9

=== 배열에서 특정 값 찾기 ===
숫자: 1
숫자: 2
숫자: 3
숫자: 4
숫자: 5
0을 발견했으므로 반복 종료

=== 특정 값 건너뛰기 ===
1 2 4 5 6 8 9 10 

=== 소수 찾기 ===
17은 소수인가? true
```

### 학습 포인트
- **break**: 반복문 즉시 종료
- **continue**: 현재 반복 건너뛰고 다음 반복으로
- **중첩 루프**: break는 가장 가까운 루프만 종료
- **실무 활용**: 조기 종료, 조건 생략 등

---

## Example 09: 메서드

코드 재사용성을 높이기 위해 메서드를 정의합니다.

### 코드
```java
public class Example09_Methods {
    
    // 매개변수 없고 반환값 없는 메서드
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // 매개변수 있고 반환값 없는 메서드
    public static void greet(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 반환값 있는 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 여러 매개변수
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // 메서드 오버로딩
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
    }
}
```

### 실행 결과
```
=== 메서드 호출 ===
Hello!
안녕하세요, 김철수님!

=== 반환값 받기 ===
5 + 3 = 8

=== 평균 계산 ===
평균: 90.0

=== 메서드 오버로딩 ===
정수: 100
문자열: Hello
실수: 3.14

=== 가변 길이 매개변수 ===
sum(1, 2) = 3
sum(1, 2, 3, 4, 5) = 15
```

### 학습 포인트
- **메서드 구조**: 반환타입, 이름, 매개변수
- **오버로딩**: 같은 이름, 다른 매개변수
- **가변 길이 매개변수**: int... args (배열처럼 처리)
- **return**: 값 반환 및 메서드 종료

---

## Example 10: 재귀 (Recursion)

메서드가 자신을 호출합니다.

### 코드
```java
public class Example10_Recursion {

    // 팩토리얼
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 피보나치
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 거듭제곱
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // 합계
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== 팩토리얼 ===");
        System.out.println("5! = " + factorial(5));
        System.out.println("6! = " + factorial(6));

        System.out.println("\n=== 피보나치 수열 ===");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println("\n=== 거듭제곱 ===");
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("3^4 = " + power(3, 4));

        System.out.println("\n=== 합계 ===");
        System.out.println("sum(10) = " + sum(10));
        System.out.println("sum(100) = " + sum(100));
    }
}
```

### 실행 결과
```
=== 팩토리얼 ===
5! = 120
6! = 720

=== 피보나치 수열 ===
0 1 1 2 3 5 8 13 21 34 

=== 거듭제곱 ===
2^5 = 32
3^4 = 81

=== 합계 ===
sum(10) = 55
sum(100) = 5050
```

### 학습 포인트
- **기저 조건**: 재귀 종료 조건 필수
- **재귀 호출**: 자신을 작은 문제로 호출
- **호출 스택**: 깊이가 깊어지면 성능 저하
- **메모이제이션**: 중복 계산 피하기

---

## Example 11: 배열

여러 값을 하나의 변수에 저장합니다.

### 코드
```java
import java.util.Arrays;

public class Example11_Arrays {
    public static void main(String[] args) {
        System.out.println("=== 배열 선언 및 초기화 ===");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("배열: " + Arrays.toString(numbers));

        System.out.println("\n=== 배열 접근 ===");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[4] = " + numbers[4]);

        System.out.println("\n=== 배열 길이 ===");
        System.out.println("배열의 길이: " + numbers.length);

        System.out.println("\n=== 배열 수정 ===");
        numbers[2] = 35;
        System.out.println("수정 후: " + Arrays.toString(numbers));

        System.out.println("\n=== 배열 생성 (크기만 지정) ===");
        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        System.out.println("과일: " + Arrays.toString(fruits));

        System.out.println("\n=== 배열 순회 ===");
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("합계: " + sum);

        System.out.println("\n=== 배열 정렬 ===");
        int[] unsorted = {50, 20, 40, 10, 30};
        Arrays.sort(unsorted);
        System.out.println("정렬 후: " + Arrays.toString(unsorted));

        System.out.println("\n=== 배열 복사 ===");
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        copy[0] = 99;
        System.out.println("원본: " + Arrays.toString(original));
        System.out.println("복사본: " + Arrays.toString(copy));
    }
}
```

### 실행 결과
```
=== 배열 선언 및 초기화 ===
배열: [10, 20, 30, 40, 50]

=== 배열 접근 ===
numbers[0] = 10
numbers[2] = 30
numbers[4] = 50

=== 배열 길이 ===
배열의 길이: 5

=== 배열 수정 ===
수정 후: [10, 20, 35, 40, 50]

=== 배열 생성 (크기만 지정) ===
과일: [apple, banana, cherry]

=== 배열 순회 ===
합계: 155

=== 배열 정렬 ===
정렬 후: [10, 20, 30, 40, 50]

=== 배열 복사 ===
원본: [1, 2, 3]
복사본: [99, 2, 3]
```

### 학습 포인트
- **배열 선언**: type[] name 또는 type name[]
- **인덱스**: 0부터 시작 (length-1까지)
- **배열 초기화**: new 키워드 또는 리터럴
- **Arrays 유틸리티**: sort, copyOf, equals, toString

---

## Example 12: 2D 배열

행과 열을 가진 배열입니다.

### 코드
```java
public class Example12_2DArrays {
    public static void main(String[] args) {
        System.out.println("=== 2D 배열 선언 및 초기화 ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("행의 수: " + matrix.length);
        System.out.println("첫 번째 행의 열 수: " + matrix[0].length);

        System.out.println("\n=== 2D 배열 접근 ===");
        System.out.println("matrix[0][0] = " + matrix[0][0]);
        System.out.println("matrix[1][1] = " + matrix[1][1]);
        System.out.println("matrix[2][2] = " + matrix[2][2]);

        System.out.println("\n=== 2D 배열 순회 ===");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 행의 합계 ===");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("행 " + i + "의 합: " + sum);
        }

        System.out.println("\n=== 대각선 합계 ===");
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("대각선의 합: " + diagonalSum);
    }
}
```

### 실행 결과
```
=== 2D 배열 선언 및 초기화 ===
행의 수: 3
첫 번째 행의 열 수: 3

=== 2D 배열 접근 ===
matrix[0][0] = 1
matrix[1][1] = 5
matrix[2][2] = 9

=== 2D 배열 순회 ===
1 2 3 
4 5 6 
7 8 9 

=== 행의 합계 ===
행 0의 합: 6
행 1의 합: 15
행 2의 합: 24

=== 대각선 합계 ===
대각선의 합: 15
```

### 학습 포인트
- **2D 배열 선언**: int[][] name
- **인덱싱**: [행][열] 순서
- **불규칙 배열**: 각 행의 길이가 다를 수 있음
- **중첩 루프**: 2중 for 루프로 순회

---

## Example 13: 문자열 기초

문자열의 기본 메서드들을 학습합니다.

### 코드
```java
public class Example13_StringBasics {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        System.out.println("=== 문자열 기본 ===");
        System.out.println("문자열: " + str);
        System.out.println("길이: " + str.length());

        System.out.println("\n=== 문자 접근 ===");
        System.out.println("첫 문자: " + str.charAt(0));
        System.out.println("마지막 문자: " + str.charAt(str.length() - 1));

        System.out.println("\n=== 부분 문자열 ===");
        System.out.println("substring(0, 5): " + str.substring(0, 5));
        System.out.println("substring(7): " + str.substring(7));

        System.out.println("\n=== 문자열 검색 ===");
        System.out.println("'Java' 위치: " + str.indexOf("Java"));
        System.out.println("'a' 마지막 위치: " + str.lastIndexOf("a"));
        System.out.println("'Python' 포함: " + str.contains("Python"));

        System.out.println("\n=== 대소문자 변환 ===");
        System.out.println("대문자: " + str.toUpperCase());
        System.out.println("소문자: " + str.toLowerCase());

        System.out.println("\n=== 문자열 비교 ===");
        String str2 = "Hello, Java!";
        System.out.println("equals: " + str.equals(str2));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("HELLO, JAVA!"));
        System.out.println("compareTo: " + str.compareTo(str2));

        System.out.println("\n=== 공백 제거 ===");
        String spaces = "  Hello  ";
        System.out.println("원본: '" + spaces + "'");
        System.out.println("trim: '" + spaces.trim() + "'");

        System.out.println("\n=== 문자 교체 ===");
        System.out.println("replace('a', 'A'): " + str.replace('a', 'A'));
        System.out.println("replace(\"Java\", \"Python\"): " + str.replace("Java", "Python"));

        System.out.println("\n=== 시작/끝 확인 ===");
        System.out.println("startsWith(\"Hello\"): " + str.startsWith("Hello"));
        System.out.println("endsWith(\"!\"): " + str.endsWith("!"));
    }
}
```

### 실행 결과
```
=== 문자열 기본 ===
문자열: Hello, Java!
길이: 12

=== 문자 접근 ===
첫 문자: H
마지막 문자: !

=== 부분 문자열 ===
substring(0, 5): Hello
substring(7): Java!

=== 문자열 검색 ===
'Java' 위치: 7
'a' 마지막 위치: 9
'Python' 포함: false

=== 대소문자 변환 ===
대문자: HELLO, JAVA!
소문자: hello, java!

=== 문자열 비교 ===
equals: true
equalsIgnoreCase: true
compareTo: 0

=== 공백 제거 ===
원본: '  Hello  '
trim: 'Hello'

=== 문자 교체 ===
replace('a', 'A'): Hello, JAvA!
replace("Java", "Python"): Hello, Python!

=== 시작/끝 확인 ===
startsWith("Hello"): true
endsWith("!"): true
```

### 학습 포인트
- **불변 문자열**: String은 한 번 생성되면 변경 불가
- **주요 메서드**: length, charAt, substring, indexOf, equals
- **대소문자**: toUpperCase, toLowerCase
- **문자열 검색**: contains, startsWith, endsWith

---

## Example 14: 변수 범위 (Scope)

변수가 유효한 범위를 학습합니다.

### 코드
```java
public class Example14_Scope {

    public int instanceVar = 100;
    public static int classVar = 200;

    public static void main(String[] args) {
        System.out.println("=== 클래스 변수 (static) ===");
        System.out.println("classVar: " + classVar);

        System.out.println("\n=== 메서드 변수 (로컬) ===");
        int localVar = 300;
        System.out.println("localVar: " + localVar);

        System.out.println("\n=== 블록 범위 ===");
        {
            int blockVar = 400;
            System.out.println("blockVar: " + blockVar);
        }
        // blockVar는 여기서 접근 불가

        System.out.println("\n=== if 블록 범위 ===");
        if (localVar > 250) {
            int ifVar = 500;
            System.out.println("ifVar (if 내부): " + ifVar);
        }
        // ifVar는 여기서 접근 불가

        System.out.println("\n=== for 루프 범위 ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("i (for 내부): " + i);
        }
        // i는 여기서 접근 불가

        System.out.println("\n=== 메서드 호출과 범위 ===");
        testScope();
    }

    public static void testScope() {
        System.out.println("testScope() 메서드 내 로컬 변수");
        System.out.println("classVar (접근 가능): " + classVar);
    }
}
```

### 실행 결과
```
=== 클래스 변수 (static) ===
classVar: 200

=== 메서드 변수 (로컬) ===
localVar: 300

=== 블록 범위 ===
blockVar: 400

=== if 블록 범위 ===
ifVar (if 내부): 500

=== for 루프 범위 ===
i (for 내부): 0
i (for 내부): 1
i (for 내부): 2

=== 메서드 호출과 범위 ===
testScope() 메서드 내 로컬 변수
classVar (접근 가능): 200
```

### 학습 포인트
- **클래스 변수**: static, 모든 인스턴스가 공유
- **인스턴스 변수**: 객체마다 별도 존재
- **로컬 변수**: 메서드/블록 내에서만 유효
- **범위 규칙**: 좁은 범위가 넓은 범위를 overshadow

---

## Example 15: 타입 변환 (Casting)

타입을 다른 타입으로 변환합니다.

### 코드
```java
public class Example15_Casting {
    public static void main(String[] args) {
        System.out.println("=== 자동 타입 변환 (Widening) ===");
        int intVal = 100;
        long longVal = intVal;
        System.out.println("int -> long: " + longVal);

        int intVal2 = 50;
        double doubleVal = intVal2;
        System.out.println("int -> double: " + doubleVal);

        System.out.println("\n=== 강제 타입 변환 (Narrowing) ===");
        double doubleVal2 = 3.14;
        int intVal3 = (int) doubleVal2;
        System.out.println("double -> int: " + intVal3 + " (소수 부분 손실)");

        long longVal2 = 100000;
        int intVal4 = (int) longVal2;
        System.out.println("long -> int: " + intVal4);

        System.out.println("\n=== 범위 초과 시 강제 변환 ===");
        long bigNum = 300;
        byte smallNum = (byte) bigNum;
        System.out.println("long(300) -> byte: " + smallNum);

        System.out.println("\n=== 문자와 숫자 변환 ===");
        char charVal = 'A';
        int asciiVal = charVal;
        System.out.println("'A' -> int: " + asciiVal);

        int asciiVal2 = 66;
        char charVal2 = (char) asciiVal2;
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
        System.out.println("int 42 -> String: " + strVal);
    }
}
```

### 실행 결과
```
=== 자동 타입 변환 (Widening) ===
int -> long: 100
int -> double: 50.0

=== 강제 타입 변환 (Narrowing) ===
double -> int: 3 (소수 부분 손실)
long -> int: 100000

=== 범위 초과 시 강제 변환 ===
long(300) -> byte: 44

=== 문자와 숫자 변환 ===
'A' -> int: 65
int(66) -> char: B

=== 부동소수점 연산 ===
7 / 2 (정수 나눗셈) = 3
7 / 2.0 (실수 나눗셈) = 3.5
(double)7 / 2 = 3.5

=== 문자열과 숫자 변환 ===
문자열 "123" -> int: 123
문자열 "3.14" -> double: 3.14

=== 숫자를 문자열로 변환 ===
int 42 -> String: 42
```

### 학습 포인트
- **자동 변환**: 작은 범위 → 큰 범위
- **강제 변환**: (타입) 값
- **주의사항**: 데이터 손실 가능 (범위 초과, 소수 손실)
- **문자열 변환**: Integer.parseInt, Double.parseDouble, String.valueOf
