# 문자열과 정규표현식 (Strings & Regex) - 10개 예제

## Example 51: String 메서드

문자열의 주요 메서드들을 학습합니다.

### 코드
```java
public class Example51_StringMethods {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        System.out.println("=== 기본 메서드 ===");
        System.out.println("길이: " + str.length());
        System.out.println("첫 문자: " + str.charAt(0));
        System.out.println("마지막 문자: " + str.charAt(str.length()-1));

        System.out.println("\n=== 부분 문자열 ===");
        System.out.println("substring(0, 5): " + str.substring(0, 5));
        System.out.println("substring(7): " + str.substring(7));

        System.out.println("\n=== 검색 ===");
        System.out.println("indexOf('Java'): " + str.indexOf("Java"));
        System.out.println("contains('Java'): " + str.contains("Java"));

        System.out.println("\n=== 대소문자 ===");
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());

        System.out.println("\n=== 문자 교체 ===");
        System.out.println("replace('a', 'A'): " + str.replace('a', 'A'));

        System.out.println("\n=== 공백 제거 ===");
        String spaces = "  Hello  ";
        System.out.println("trim: '" + spaces.trim() + "'");
    }
}
```

### 실행 결과
```
=== 기본 메서드 ===
길이: 12
첫 문자: H
마지막 문자: !

=== 부분 문자열 ===
substring(0, 5): Hello
substring(7): Java!

=== 검색 ===
indexOf('Java'): 7
contains('Java'): true

=== 대소문자 ===
toUpperCase: HELLO, JAVA!
toLowerCase: hello, java!

=== 문자 교체 ===
replace('a', 'A'): Hello, JAvA!

=== 공백 제거 ===
trim: 'Hello'
```

---

## Example 52: StringBuilder

가변성 문자열입니다.

### 코드
```java
public class Example52_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("=== append ===");
        sb.append(" World");
        System.out.println("결과: " + sb.toString());

        System.out.println("\n=== insert ===");
        sb.insert(5, ",");
        System.out.println("결과: " + sb.toString());

        System.out.println("\n=== delete ===");
        sb.delete(5, 6);
        System.out.println("결과: " + sb.toString());

        System.out.println("\n=== reverse ===");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println("원본: " + sb2);
        System.out.println("역순: " + sb2.reverse());
    }
}
```

### 실행 결과
```
=== append ===
결과: Hello World

=== insert ===
결과: Hello, World

=== delete ===
결과: Hello World

=== reverse ===
원본: Java
역순: avaJ
```

---

## Example 56-60: 정규표현식과 고급 문자열

정규표현식, split/join, trim/strip 등을 학습합니다.

### 정규표현식 예제
```java
String email = "test@example.com";
boolean isValid = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+$");
System.out.println("유효한 이메일?: " + isValid);  // true
```

### split과 join
```java
String csv = "apple,banana,cherry";
String[] fruits = csv.split(",");  // ["apple", "banana", "cherry"]

String joined = String.join("-", fruits);  // "apple-banana-cherry"
```

