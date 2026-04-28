# Java 버전별 주요 변경사항 (Java 8 ~ 21)

Java의 진화 과정을 버전별로 정리했습니다. 각 버전의 주요 기능과 코드 예제를 포함합니다.

---

## 📌 Java 8 (2014) - 함수형 프로그래밍 혁명

### 주요 기능

#### 1. Lambda 표현식
익명 클래스를 간결하게 표현합니다.

```java
// Before (Java 7)
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
});

// After (Java 8)
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Collections.sort(names, (a, b) -> a.compareTo(b));
names.sort(String::compareTo);  // 메서드 참조
```

#### 2. Stream API
함수형 방식의 데이터 처리를 제공합니다.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

// Before
List<Integer> evenNumbers = new ArrayList<>();
for (Integer num : numbers) {
    if (num % 2 == 0) {
        evenNumbers.add(num);
    }
}
int sum = 0;
for (Integer num : evenNumbers) {
    sum += num;
}

// After (Java 8)
int sum = numbers.stream()
                 .filter(n -> n % 2 == 0)
                 .mapToInt(Integer::intValue)
                 .sum();
```

#### 3. Optional<T>
null 값을 안전하게 다룹니다.

```java
Optional<String> optional = Optional.of("Hello");
optional.ifPresent(System.out::println);

Optional<String> empty = Optional.empty();
String value = empty.orElse("default");  // "default"
```

#### 4. 함수형 인터페이스
@FunctionalInterface 어노테이션으로 표시합니다.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

Calculator add = (a, b) -> a + b;
System.out.println(add.calculate(5, 3));  // 8
```

#### 5. Default 메서드
인터페이스에 구현체를 가질 수 있습니다.

```java
interface Animal {
    void sound();
    
    default void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
    // sleep()은 자동으로 상속됨
}
```

**영향**: 자바 개발 패러다임 변화, 함수형 프로그래밍 지원 시작

---

## 📌 Java 9 (2017) - 모듈 시스템 도입

### 주요 기능

#### 1. 모듈 시스템 (JPMS)
대규모 애플리케이션의 의존성을 관리합니다.

```java
// module-info.java
module com.example.app {
    requires java.base;
    requires java.logging;
    
    exports com.example.app.api;
    exports com.example.app.service;
}
```

#### 2. 인터페이스의 Private 메서드
인터페이스에서 코드 중복을 줄입니다.

```java
interface DataProcessor {
    void process();
    
    default void validate() {
        validateInput();
        processData();
    }
    
    private void validateInput() {
        System.out.println("Validating...");
    }
    
    private void processData() {
        System.out.println("Processing...");
    }
}
```

#### 3. 향상된 try-with-resources
이전에 선언한 리소스를 재사용할 수 있습니다.

```java
// Java 7
BufferedReader br1 = new BufferedReader(new FileReader("file.txt"));
try (BufferedReader br = br1) {
    // 사용
}

// Java 9
BufferedReader br = new BufferedReader(new FileReader("file.txt"));
try (br) {
    // 사용 - br을 바로 참조 가능
}
```

#### 4. Reactive Streams
비동기 데이터 처리를 지원합니다.

```java
Flow.Publisher<String> publisher = ...;
Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
    @Override
    public void onSubscribe(Flow.Subscription subscription) { }
    
    @Override
    public void onNext(String item) {
        System.out.println("Received: " + item);
    }
    
    @Override
    public void onError(Throwable throwable) { }
    
    @Override
    public void onComplete() { }
};

publisher.subscribe(subscriber);
```

**영향**: 대규모 애플리케이션 개발 개선, 마이크로서비스 아키텍처 지원

---

## 📌 Java 10 (2018) - 로컬 변수 타입 추론

### 주요 기능

#### 1. var 키워드 (Local Variable Type Inference)
컴파일러가 타입을 추론합니다.

```java
// Before
List<String> names = new ArrayList<>();
Map<String, Integer> scores = new HashMap<>();
int count = 10;

// After (Java 10)
var names = new ArrayList<String>();
var scores = new HashMap<String, Integer>();
var count = 10;

// Stream에서 유용
var result = Stream.of(1, 2, 3, 4, 5)
                   .filter(n -> n > 2)
                   .map(n -> n * 2)
                   .collect(Collectors.toList());
```

**제한사항**:
- 로컬 변수에만 사용 가능
- 클래스 멤버 변수에는 사용 불가
- 명시적 초기화 필수

#### 2. 불변 컬렉션 생성
List.copyOf(), Set.copyOf(), Map.copyOf() 추가

```java
List<String> original = Arrays.asList("a", "b", "c");
List<String> copy = List.copyOf(original);
// copy.add("d");  // UnsupportedOperationException
```

**영향**: 코드 간결성 증대, 타입 추론으로 인한 가독성 개선

---

## 📌 Java 11 (2018) - LTS 버전, 성능 개선

### 주요 기능

#### 1. String 메서드 추가

```java
String text = "Hello\nWorld\nJava";

// isBlank() - 공백만 있는지 확인
" \n\t ".isBlank();  // true

// lines() - 줄 단위로 분할
text.lines().forEach(System.out::println);
// Hello
// World
// Java

// strip() - 양쪽 공백 제거
"  Hello  ".strip();  // "Hello"

// repeat() - 반복
"abc".repeat(3);  // "abcabcabc"
```

#### 2. HTTP Client API (표준)

```java
HttpClient httpClient = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://api.example.com/data"))
    .GET()
    .build();

HttpResponse<String> response = httpClient.send(request, 
    HttpResponse.BodyHandlers.ofString());

System.out.println(response.statusCode());
System.out.println(response.body());
```

#### 3. var 확장 (람다 매개변수)

```java
// Java 11 - var 사용 가능
var myFunction = (var a, var b) -> a + b;  // 컴파일 에러

// 정확한 형태
var myFunction = (Integer a, Integer b) -> a + b;
```

**영향**: LTS 버전으로 장기 지원, HTTP 통신 표준화

---

## 📌 Java 12 ~ 13 (2019) - 미리보기 기능

### Java 12: Switch 표현식 (미리보기)

```java
// Before
int dayType;
switch (day) {
    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
        dayType = 0;
        break;
    case SATURDAY, SUNDAY:
        dayType = 1;
        break;
    default:
        dayType = -1;
}

// After (Java 12)
int dayType = switch (day) {
    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 0;
    case SATURDAY, SUNDAY -> 1;
    default -> -1;
};
```

### Java 13: Text Blocks (미리보기)

```java
// Before
String json = "{\n" +
    "  \"name\": \"John\",\n" +
    "  \"age\": 30\n" +
    "}";

// After (Java 13)
String json = """
    {
      "name": "John",
      "age": 30
    }
    """;

String sql = """
    SELECT id, name, email
    FROM users
    WHERE age > 18
    ORDER BY name
    """;
```

**영향**: 언어 기능 개선 및 미리보기 프로세스 도입

---

## 📌 Java 14 (2020) - Records 소개

### 주요 기능

#### 1. Records (미리보기)
데이터 클래스를 간결하게 선언합니다.

```java
// Before (Java 13)
class Person {
    private final String name;
    private final int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public boolean equals(Object obj) { ... }
    
    @Override
    public int hashCode() { ... }
    
    @Override
    public String toString() { ... }
}

// After (Java 14)
record Person(String name, int age) {}

// 자동으로 생성됨:
// - Constructor
// - Getters (name(), age())
// - equals()
// - hashCode()
// - toString()
```

#### 2. Pattern Matching for instanceof (미리보기)

```java
// Before
if (obj instanceof String) {
    String str = (String) obj;
    System.out.println(str.length());
}

// After (Java 14)
if (obj instanceof String str) {
    System.out.println(str.length());
}
```

#### 3. NullPointerException 메시지 개선

```java
// Java 14 이전
NullPointerException

// Java 14 이후
Cannot invoke method because "variable" is null
```

**영향**: 보일러플레이트 코드 감소, 데이터 클래스 표준화

---

## 📌 Java 15 (2020) - Text Blocks 확정

### 주요 기능

#### 1. Text Blocks (확정)
이제 정식 기능입니다.

```java
String html = """
    <!DOCTYPE html>
    <html>
      <head>
        <title>Hello</title>
      </head>
      <body>
        <h1>Hello, World!</h1>
      </body>
    </html>
    """;

String query = """
    query {
      user(id: 1) {
        name
        email
      }
    }
    """;
```

#### 2. Sealed Classes (미리보기)
상속 계층을 제어합니다.

```java
public sealed class Animal permits Dog, Cat, Bird {
    // Dog, Cat, Bird만 상속 가능
}

public final class Dog extends Animal {}
public final class Cat extends Animal {}
public final class Bird extends Animal {}

// 다른 클래스는 상속 불가
// public class Fish extends Animal {}  // 컴파일 에러
```

**영향**: 멀티라인 문자열 표현 개선, 타입 시스템 강화

---

## 📌 Java 16 (2021) - Records와 Pattern Matching 확정

### 주요 기능

#### 1. Records (확정)
이제 정식 기능입니다.

```java
// 일반 사용
record Point(int x, int y) {}

// 커스텀 생성자
record Rectangle(int width, int height) {
    public Rectangle {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }
    }
}

// 컴팩트 생성자 사용
var rect = new Rectangle(10, 20);
```

#### 2. Pattern Matching for instanceof (확정)

```java
Object obj = "Hello";

// 이제 안전하게 타입 확인과 캐스팅
if (obj instanceof String str) {
    System.out.println("String length: " + str.length());
} else if (obj instanceof Integer num) {
    System.out.println("Integer value: " + num);
} else if (obj instanceof Double d) {
    System.out.println("Double value: " + d);
}
```

#### 3. Unix-Domain Socket 채널

```java
SocketChannel channel = SocketChannel.open(UnixDomainSocketAddress
    .of(Path.of("/tmp/socket.sock")));
```

**영향**: 모던 자바 개발 패러다임 정립

---

## 📌 Java 17 (2021) - LTS 버전

### 주요 기능

#### 1. Sealed Classes (확정)

```java
public sealed class Shape permits Circle, Rectangle, Triangle {
    public abstract double area();
}

public final class Circle extends Shape {
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public non-sealed class Rectangle extends Shape {
    // 다른 클래스에서 상속 가능
}
```

#### 2. Pattern Matching 확장

```java
// Switch에서 Pattern Matching (미리보기)
String result = switch (obj) {
    case Integer i -> "Integer: " + i;
    case String s -> "String: " + s;
    case Double d -> "Double: " + d;
    default -> "Unknown";
};
```

#### 3. Strongly Encapsulated JDK Internals

```java
// Java 17부터 강제됨
// sun.misc.Unsafe 등의 internal API 접근 불가
// --add-opens 옵션 필요
```

**영향**: LTS 버전으로 장기 지원 (2026년까지), 패턴 매칭 강화

---

## 📌 Java 18 (2023) - UTF-8 기본값

### 주요 기능

#### 1. UTF-8 by Default

```java
// 이제 모든 플랫폼에서 UTF-8이 기본값
Files.writeString(path, "안녕하세요");  // UTF-8로 자동 저장
String content = Files.readString(path);  // UTF-8로 자동 읽음

System.out.println("한글 출력 가능");
```

#### 2. Vector API (인큐베이터)

```java
// SIMD 연산 지원 (미리보기)
IntVector a = IntVector.fromArray(IntVector.SPECIES_256, array1, 0);
IntVector b = IntVector.fromArray(IntVector.SPECIES_256, array2, 0);
IntVector c = a.add(b);
```

**영향**: 국제화 개선, 성능 최적화 기초 제공

---

## 📌 Java 19 (2022) - Virtual Threads 소개

### 주요 기능

#### 1. Virtual Threads (미리보기)
경량 스레드로 대규모 동시성을 지원합니다.

```java
// 기존 Thread
ExecutorService executor = Executors.newFixedThreadPool(10);
for (int i = 0; i < 10000; i++) {
    executor.submit(() -> {
        // 작업 수행 - 최대 10개만 동시 실행
    });
}

// Virtual Thread (Java 19+)
try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
    for (int i = 0; i < 10000; i++) {
        executor.submit(() -> {
            // 작업 수행 - 10000개 모두 동시 실행 가능
        });
    }
}

// 직접 생성
Thread vThread = Thread.startVirtualThread(() -> {
    System.out.println("Virtual Thread");
});
```

#### 2. Record Patterns (미리보기)

```java
record Point(int x, int y) {}
record Rectangle(Point topLeft, Point bottomRight) {}

// 중첩된 패턴 매칭
if (obj instanceof Rectangle(Point(int x1, int y1), Point(int x2, int y2))) {
    System.out.println("Area: " + (x2-x1) * (y2-y1));
}
```

**영향**: I/O 바운드 애플리케이션 성능 획기적 개선

---

## 📌 Java 20 (2023) - Virtual Threads 확장

### 주요 기능

#### 1. Virtual Threads 개선
구조화된 동시성 추가 (미리보기)

```java
// 구조화된 동시성 (미리보기)
try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
    Future<String> result1 = scope.fork(() -> fetchUserData(1));
    Future<String> result2 = scope.fork(() -> fetchUserData(2));
    
    scope.joinUntil(Instant.now().plusSeconds(1));
    
    String user1 = result1.resultNow();
    String user2 = result2.resultNow();
}
```

#### 2. Scoped Values (미리보기)
컨텍스트 정보 전달

```java
static final ScopedValue<String> userId = ScopedValue.newInstance();

ScopedValue.where(userId, "user123")
    .run(() -> {
        String id = userId.get();  // "user123"
    });
```

**영향**: Virtual Thread의 실용적 활용 개선

---

## 📌 Java 21 (2023) - LTS 버전, 가상 스레드 확정

### 주요 기능

#### 1. Virtual Threads (확정)
이제 정식 기능입니다.

```java
// 대규모 웹 서버 예제
ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

for (Socket clientSocket : serverSocket.accept()) {
    executor.submit(() -> {
        handleClient(clientSocket);  // 각 클라이언트마다 별도 Virtual Thread
    });
}

// 기존 Platform Thread 대비 메모리 100배 이상 절감
```

#### 2. Pattern Matching (확정)

```java
// Switch에서 패턴 매칭 정식 지원
String format(Object obj) {
    return switch (obj) {
        case Integer i -> "Int: " + i;
        case Long l -> "Long: " + l;
        case Double d -> "Double: " + d;
        case String s -> "String: " + s;
        case null -> "null";
        default -> "Unknown";
    };
}

// Guard 패턴
String checkNumber(Integer n) {
    return switch (n) {
        case Integer i when i > 0 -> "Positive";
        case Integer i when i < 0 -> "Negative";
        default -> "Zero";
    };
}
```

#### 3. Record Patterns (확정)

```java
record Point(int x, int y) {}
record ColoredPoint(Point point, String color) {}

// 중첩된 record 패턴
if (obj instanceof ColoredPoint(Point(var x, var y), var c)) {
    System.out.println("Color: " + c + " at (" + x + ", " + y + ")");
}
```

#### 4. String Templates (미리보기)

```java
// Java 21 (미리보기)
String name = "Alice";
int age = 30;

// 기존 방식
String s = "Name: " + name + ", Age: " + age;

// String templates (미리보기)
String s = "Name: \{name}, Age: \{age}";

// SQL 예제
String query = """
    SELECT * FROM users
    WHERE name = '\{name}'
    AND age > \{age}
    """;
```

**영향**: Virtual Thread로 혁신적 성능 개선, 패턴 매칭 완성

---

## 📌 Java 22 (2024) - 최신 기능

### 주요 기능

#### 1. Stream Gatherers (미리보기)

```java
// 복잡한 Stream 변환 간단히
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

numbers.gather(Gatherers.windowed(2))  // [1,2], [2,3], [3,4], [4,5]
       .forEach(System.out::println);

// 커스텀 Gatherer
Gatherer<Integer, ?, String> customGatherer = ...;
```

#### 2. Implicit Class Declarations

```java
// 파일 이름과 무관하게 실행 가능
void main() {
    System.out.println("Hello, World!");
}
```

---

## 📌 Java 23 (2024) - 최신 기능

### 주요 기능

#### 1. Collections 개선

```java
// 불변 컬렉션 생성 향상
List<Integer> list = ArrayList.of(1, 2, 3);
Set<String> set = HashSet.of("a", "b", "c");
Map<String, Integer> map = HashMap.of("x", 10, "y", 20);
```

#### 2. Thread per Task Executors

```java
// Virtual Thread 생성 더 간편
ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
executor.submit(task);
```

---

## 🎯 버전별 선택 가이드

| 버전 | LTS | 추천 대상 | 특징 |
|------|-----|---------|------|
| **Java 8** | ✅ | 레거시 시스템 | Lambda, Stream |
| **Java 11** | ✅ | 기존 프로젝트 | String API, HTTP Client |
| **Java 17** | ✅ | 현재 표준 | Sealed Classes, Pattern Matching |
| **Java 21** | ✅ | 신규 프로젝트 | Virtual Threads, Pattern Matching |
| **Java 22+** | ❌ | 최신 기술 | 실험적 기능 |

---

## 💡 마이그레이션 팁

### Java 8 → 11
```java
// String API 활용
"  text  ".strip();
"hello\nworld".lines();
```

### Java 11 → 17
```java
// Sealed Classes 활용
sealed class Vehicle permits Car, Truck { }

// Pattern Matching
if (obj instanceof String str) { }
```

### Java 17 → 21
```java
// Virtual Threads
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) { }

// Pattern Matching 확장
switch (obj) {
    case Point(int x, int y) -> { }
}
```

---

**최종 업데이트**: Java 23 (2024년 9월)
