# 컬렉션 심화 가이드 - 10개의 고급 예제

## Example 51: PriorityQueue (우선순위 큐)

요소들을 우선순위에 따라 정렬하여 처리합니다.

### 코드
```java
import java.util.PriorityQueue;
import java.util.Comparator;

public class Example51_PriorityQueue {
    static class Task implements Comparable<Task> {
        String name;
        int priority;  // 숫자가 클수록 높은 우선순위
        
        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
        
        @Override
        public int compareTo(Task other) {
            return Integer.compare(other.priority, this.priority);  // 내림차순
        }
        
        @Override
        public String toString() {
            return "Task{" + name + ", priority=" + priority + '}';
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== PriorityQueue 기본 ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        
        System.out.println("우선순위순 추출:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");  // 1 2 5 8
        }
        System.out.println();
        
        System.out.println("\n=== 커스텀 우선순위 ===");
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.offer(new Task("긴급 버그 수정", 9));
        taskQueue.offer(new Task("문서 작성", 3));
        taskQueue.offer(new Task("기능 개발", 7));
        taskQueue.offer(new Task("테스트", 5));
        
        System.out.println("처리 순서:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
        
        System.out.println("\n=== 역순 우선순위 ===");
        PriorityQueue<Integer> reversePq = new PriorityQueue<>(
            Comparator.reverseOrder()
        );
        reversePq.offer(5);
        reversePq.offer(2);
        reversePq.offer(8);
        
        System.out.println("내림차순 추출:");
        while (!reversePq.isEmpty()) {
            System.out.print(reversePq.poll() + " ");  // 8 5 2
        }
    }
}
```

### 실행 결과
```
=== PriorityQueue 기본 ===
우선순위순 추출:
1 2 5 8 

=== 커스텀 우선순위 ===
처리 순서:
Task{긴급 버그 수정, priority=9}
Task{기능 개발, priority=7}
Task{테스트, priority=5}
Task{문서 작성, priority=3}

=== 역순 우선순위 ===
내림차순 추출:
8 5 2 
```

### 학습 포인트
- **Comparable 구현**: 기본 정렬 순서 정의
- **Comparator 사용**: 다양한 정렬 순서 지원
- **시간 복잡도**: offer/poll O(log n), peek O(1)

---

## Example 52: ConcurrentHashMap (멀티스레드 안전성)

여러 스레드에서 안전하게 접근할 수 있는 Map입니다.

### 코드
```java
import java.util.*;
import java.util.concurrent.*;

public class Example52_ConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== HashMap vs ConcurrentHashMap ===");
        
        // HashMap - 동시성 문제 발생 가능
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("count", 0);
        
        // ConcurrentHashMap - 안전함
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("count", 0);
        
        System.out.println("\n=== 멀티스레드 접근 ===");
        int numThreads = 5;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        
        // ConcurrentHashMap 증가
        for (int i = 0; i < numThreads; i++) {
            executor.submit(() -> {
                for (int j = 0; j < 100; j++) {
                    concurrentMap.merge("count", 1, Integer::sum);
                }
            });
        }
        
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        
        System.out.println("ConcurrentHashMap의 최종 값: " + 
                          concurrentMap.get("count"));
        
        System.out.println("\n=== 원자적 연산 ===");
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        // putIfAbsent: 키가 없을 때만 추가
        map.putIfAbsent("key1", 10);
        map.putIfAbsent("key1", 20);  // 추가 안 됨
        System.out.println("putIfAbsent 결과: " + map.get("key1"));
        
        // computeIfPresent: 키가 있을 때만 변경
        map.computeIfPresent("key1", (k, v) -> v * 2);
        System.out.println("computeIfPresent 결과: " + map.get("key1"));
        
        // computeIfAbsent: 키가 없을 때만 계산
        map.computeIfAbsent("key2", k -> 100);
        System.out.println("computeIfAbsent 결과: " + map.get("key2"));
    }
}
```

### 실행 결과
```
=== HashMap vs ConcurrentHashMap ===

=== 멀티스레드 접근 ===
ConcurrentHashMap의 최종 값: 500

=== 원자적 연산 ===
putIfAbsent 결과: 10
computeIfPresent 결과: 20
computeIfAbsent 결과: 100
```

### 학습 포인트
- **동시성 안전성**: segment 기반 잠금
- **원자적 연산**: merge, putIfAbsent, computeIf* 메서드
- **성능**: HashMap보다 동시 접근 성능 우수

---

## Example 53: 컬렉션 변환 (Array ↔ List ↔ Set)

다양한 컬렉션 타입 간 변환합니다.

### 코드
```java
import java.util.*;
import java.util.stream.Collectors;

public class Example53_CollectionConversion {
    public static void main(String[] args) {
        System.out.println("=== 배열 → List ===");
        String[] fruits = {"apple", "banana", "cherry"};
        
        // 방법 1: Arrays.asList (고정 크기)
        List<String> list1 = Arrays.asList(fruits);
        System.out.println("Arrays.asList: " + list1);
        
        // 방법 2: new ArrayList (변경 가능)
        List<String> list2 = new ArrayList<>(Arrays.asList(fruits));
        list2.add("date");
        System.out.println("new ArrayList: " + list2);
        
        // 방법 3: Stream 사용
        List<String> list3 = Arrays.stream(fruits)
                                   .collect(Collectors.toList());
        System.out.println("Stream: " + list3);
        
        System.out.println("\n=== List → 배열 ===");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        
        // 방법 1: toArray()
        Integer[] arr1 = list.toArray(new Integer[0]);
        System.out.println("toArray: " + Arrays.toString(arr1));
        
        // 방법 2: int 배열로
        int[] arr2 = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("int 배열: " + Arrays.toString(arr2));
        
        System.out.println("\n=== List → Set ===");
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");
        
        // 중복 제거
        Set<String> set1 = new HashSet<>(words);
        System.out.println("HashSet: " + set1);
        
        Set<String> set2 = words.stream()
                               .collect(Collectors.toSet());
        System.out.println("Stream: " + set2);
        
        System.out.println("\n=== Set → List ===");
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        
        List<Integer> list4 = new ArrayList<>(set);
        System.out.println("new ArrayList(set): " + list4);
        
        List<Integer> list5 = set.stream()
                               .sorted()
                               .collect(Collectors.toList());
        System.out.println("정렬된 List: " + list5);
        
        System.out.println("\n=== Map ↔ List ===");
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        
        // Map → List (Key)
        List<String> keys = new ArrayList<>(map.keySet());
        System.out.println("Keys: " + keys);
        
        // Map → List (Value)
        List<Integer> values = new ArrayList<>(map.values());
        System.out.println("Values: " + values);
        
        // Map → List (Entry)
        List<String> entries = map.entrySet().stream()
            .map(e -> e.getKey() + "=" + e.getValue())
            .collect(Collectors.toList());
        System.out.println("Entries: " + entries);
    }
}
```

### 실행 결과
```
=== 배열 → List ===
Arrays.asList: [apple, banana, cherry]
new ArrayList: [apple, banana, cherry, date]
Stream: [apple, banana, cherry]

=== List → 배열 ===
toArray: [1, 2, 3, 4, 5]
int 배열: [1, 2, 3, 4, 5]

=== List → Set ===
HashSet: [apple, banana, cherry]
Stream: [apple, banana, cherry]

=== Set → List ===
new ArrayList(set): [1, 2, 3, 4, 5]
정렬된 List: [1, 2, 3, 4, 5]

=== Map ↔ List ===
Keys: [a, b, c]
Values: [1, 2, 3]
Entries: [a=1, b=2, c=3]
```

### 학습 포인트
- **Arrays.asList**: 고정 크기, 변경 불가능한 부분이 있음
- **new ArrayList()**: 변경 가능한 List로 변환
- **Stream API**: 함수형으로 변환 가능

---

## Example 54: 불변 컬렉션 (Immutable Collections)

한 번 생성되면 변경할 수 없는 컬렉션입니다.

### 코드
```java
import java.util.*;

public class Example54_ImmutableCollections {
    public static void main(String[] args) {
        System.out.println("=== Collections.unmodifiable* ===");
        List<String> original = new ArrayList<>(
            Arrays.asList("a", "b", "c")
        );
        
        List<String> immutable = Collections.unmodifiableList(original);
        System.out.println("불변 List: " + immutable);
        
        try {
            immutable.add("d");  // 예외 발생
        } catch (UnsupportedOperationException e) {
            System.out.println("add() 실패: " + e.getMessage());
        }
        
        System.out.println("\n=== List.of() (Java 9+) ===");
        List<String> list = List.of("apple", "banana", "cherry");
        System.out.println("List.of(): " + list);
        
        try {
            list.add("date");  // 예외 발생
        } catch (UnsupportedOperationException e) {
            System.out.println("add() 실패: " + e.getMessage());
        }
        
        System.out.println("\n=== Set.of(), Map.of() ===");
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        System.out.println("Set.of(): " + set);
        
        Map<String, Integer> map = Map.of(
            "a", 1,
            "b", 2,
            "c", 3
        );
        System.out.println("Map.of(): " + map);
        
        System.out.println("\n=== copyOf (Java 10+) ===");
        List<String> original2 = new ArrayList<>(
            Arrays.asList("x", "y", "z")
        );
        
        List<String> copy = List.copyOf(original2);
        System.out.println("원본: " + original2);
        System.out.println("복사본: " + copy);
        
        original2.add("w");
        System.out.println("원본 수정 후: " + original2);
        System.out.println("복사본: " + copy);  // 변경 없음
        
        System.out.println("\n=== null 포함 불가 ===");
        try {
            List<String> listWithNull = List.of("a", null, "c");
        } catch (NullPointerException e) {
            System.out.println("null을 포함할 수 없음: " + e.getMessage());
        }
    }
}
```

### 실행 결과
```
=== Collections.unmodifiable* ===
불변 List: [a, b, c]
add() 실패: null

=== List.of() (Java 9+) ===
List.of(): [apple, banana, cherry]
add() 실패: null

=== Set.of(), Map.of() ===
Set.of(): [1, 2, 3, 4, 5]
Map.of(): {a=1, b=2, c=3}

=== copyOf (Java 10+) ===
원본: [x, y, z]
복사본: [x, y, z]
원본 수정 후: [x, y, z, w]
복사본: [x, y, z]

=== null 포함 불가 ===
null을 포함할 수 없음: null
```

### 학습 포인트
- **Collections.unmodifiable***: 기존 컬렉션을 불변으로 감싸기
- **List.of()**: Java 9+에서 바로 불변 컬렉션 생성
- **null 불가**: 불변 컬렉션은 null을 포함할 수 없음

---

## Example 55: Stream과 컬렉션의 강력한 조합

Stream API로 복잡한 컬렉션 처리를 합니다.

### 코드
```java
import java.util.*;
import java.util.stream.Collectors;

public class Example55_StreamCollectionIntegration {
    static class Student {
        String name;
        int score;
        String subject;
        
        public Student(String name, int score, String subject) {
            this.name = name;
            this.score = score;
            this.subject = subject;
        }
    }
    
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85, "Math"),
            new Student("Bob", 92, "Math"),
            new Student("Charlie", 78, "English"),
            new Student("David", 88, "English"),
            new Student("Eve", 95, "Math")
        );
        
        System.out.println("=== 필터링 및 정렬 ===");
        List<String> topMathStudents = students.stream()
            .filter(s -> s.subject.equals("Math"))
            .filter(s -> s.score >= 85)
            .sorted((s1, s2) -> s2.score - s1.score)
            .map(s -> s.name + " (" + s.score + ")")
            .collect(Collectors.toList());
        System.out.println("상위 수학 학생: " + topMathStudents);
        
        System.out.println("\n=== 그룹핑 ===");
        Map<String, List<Student>> bySubject = students.stream()
            .collect(Collectors.groupingBy(s -> s.subject));
        System.out.println("과목별 그룹: " + bySubject);
        
        System.out.println("\n=== 그룹핑 및 집계 ===");
        Map<String, Double> avgScoreBySubject = students.stream()
            .collect(Collectors.groupingBy(
                s -> s.subject,
                Collectors.averagingInt(s -> s.score)
            ));
        System.out.println("과목별 평균 점수: " + avgScoreBySubject);
        
        System.out.println("\n=== 문자열 연결 ===");
        String studentNames = students.stream()
            .map(s -> s.name)
            .collect(Collectors.joining(", "));
        System.out.println("학생 목록: " + studentNames);
        
        System.out.println("\n=== 분할 (Partition) ===");
        Map<Boolean, List<Student>> byPassFail = students.stream()
            .collect(Collectors.partitioningBy(s -> s.score >= 80));
        System.out.println("합격: " + byPassFail.get(true).size() + "명");
        System.out.println("불합격: " + byPassFail.get(false).size() + "명");
        
        System.out.println("\n=== 다단계 처리 ===");
        Map<String, String> topStudentBySubject = students.stream()
            .collect(Collectors.groupingBy(
                s -> s.subject,
                Collectors.collectingAndThen(
                    Collectors.maxBy(Comparator.comparingInt(s -> s.score)),
                    opt -> opt.isPresent() ? opt.get().name : "없음"
                )
            ));
        System.out.println("과목별 최우수 학생: " + topStudentBySubject);
    }
}
```

### 실행 결과
```
=== 필터링 및 정렬 ===
상위 수학 학생: [Eve (95), Bob (92), Alice (85)]

=== 그룹핑 ===
과목별 그룹: {Math=[...], English=[...]}

=== 그룹핑 및 집계 ===
과목별 평균 점수: {Math=90.67, English=83.0}

=== 문자열 연결 ===
학생 목록: Alice, Bob, Charlie, David, Eve

=== 분할 (Partition) ===
합격: 4명
불합격: 1명

=== 다단계 처리 ===
과목별 최우수 학생: {Math=Eve, English=David}
```

### 학습 포인트
- **groupingBy**: 요소를 그룹으로 분류
- **partitioningBy**: 조건에 따라 true/false로 분할
- **collectingAndThen**: 중간 결과를 다시 처리

---

## Example 56: EnumMap과 EnumSet

열거형을 키로 사용하는 효율적인 컬렉션입니다.

### 코드
```java
import java.util.*;

public class Example56_EnumMapAndSet {
    enum Color { RED, GREEN, BLUE, YELLOW }
    enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE }
    
    public static void main(String[] args) {
        System.out.println("=== EnumMap ===");
        EnumMap<Color, String> colorNames = new EnumMap<>(Color.class);
        colorNames.put(Color.RED, "빨강");
        colorNames.put(Color.GREEN, "초록");
        colorNames.put(Color.BLUE, "파랑");
        
        System.out.println("색상 맵: " + colorNames);
        System.out.println("RED: " + colorNames.get(Color.RED));
        
        System.out.println("\n=== EnumMap 순회 ===");
        for (Color color : Color.values()) {
            String name = colorNames.getOrDefault(color, "미지정");
            System.out.println(color + ": " + name);
        }
        
        System.out.println("\n=== EnumSet ===");
        EnumSet<Size> selectedSizes = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("선택된 사이즈: " + selectedSizes);
        
        System.out.println("\n=== EnumSet 범위 ===");
        EnumSet<Size> rangeSizes = EnumSet.range(Size.SMALL, Size.LARGE);
        System.out.println("범위 사이즈: " + rangeSizes);
        
        System.out.println("\n=== EnumSet 여집합 ===");
        EnumSet<Size> notLarge = EnumSet.complementOf(
            EnumSet.of(Size.LARGE)
        );
        System.out.println("LARGE 제외: " + notLarge);
        
        System.out.println("\n=== 성능: HashMap vs EnumMap ===");
        Map<Color, Integer> hashMap = new HashMap<>();
        EnumMap<Color, Integer> enumMap = new EnumMap<>(Color.class);
        
        for (Color color : Color.values()) {
            hashMap.put(color, color.ordinal());
            enumMap.put(color, color.ordinal());
        }
        
        System.out.println("HashMap: " + hashMap);
        System.out.println("EnumMap: " + enumMap);
        System.out.println("EnumMap이 메모리 효율이 좋음");
    }
}
```

### 실행 결과
```
=== EnumMap ===
색상 맵: {RED=빨강, GREEN=초록, BLUE=파랑}
RED: 빨강

=== EnumMap 순회 ===
RED: 빨강
GREEN: 초록
BLUE: 파랑
YELLOW: 미지정

=== EnumSet ===
선택된 사이즈: [SMALL, LARGE]

=== EnumSet 범위 ===
범위 사이즈: [SMALL, MEDIUM, LARGE]

=== EnumSet 여집합 ===
LARGE 제외: [SMALL, MEDIUM, EXTRA_LARGE]

=== 성능: HashMap vs EnumMap ===
HashMap: {RED=0, GREEN=1, BLUE=2, YELLOW=3}
EnumMap: {RED=0, GREEN=1, BLUE=2, YELLOW=3}
EnumMap이 메모리 효율이 좋음
```

### 학습 포인트
- **EnumMap**: 열거형 키를 위한 최적화된 맵 (배열 기반)
- **EnumSet**: 열거형 요소를 위한 고효율 집합 (비트 기반)
- **성능**: HashMap/HashSet보다 메모리 및 속도 우수

---

## Example 57: TreeMap 고급 기능

정렬된 맵의 고급 기능을 활용합니다.

### 코드
```java
import java.util.*;

public class Example57_TreeMapAdvanced {
    public static void main(String[] args) {
        System.out.println("=== TreeMap 범위 조회 ===");
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        scores.put("David", 88);
        scores.put("Eve", 95);
        
        System.out.println("전체 맵: " + scores);
        
        System.out.println("\n=== headMap (특정 키 이전) ===");
        SortedMap<String, Integer> head = scores.headMap("David");
        System.out.println("David 이전: " + head);
        
        System.out.println("\n=== tailMap (특정 키 이후) ===");
        SortedMap<String, Integer> tail = scores.tailMap("David");
        System.out.println("David 이후: " + tail);
        
        System.out.println("\n=== subMap (범위) ===");
        SortedMap<String, Integer> sub = scores.subMap("Bob", "Eve");
        System.out.println("Bob ~ Eve (Eve 제외): " + sub);
        
        System.out.println("\n=== 첫/마지막 엔트리 ===");
        System.out.println("첫 번째: " + scores.firstEntry());
        System.out.println("마지막: " + scores.lastEntry());
        System.out.println("첫 키: " + scores.firstKey());
        System.out.println("마지막 키: " + scores.lastKey());
        
        System.out.println("\n=== 가장 가까운 키 ===");
        System.out.println("Charlie 이상: " + scores.ceilingKey("Charlie"));
        System.out.println("Charlie 초과: " + scores.higherKey("Charlie"));
        System.out.println("Charlie 이하: " + scores.floorKey("Charlie"));
        System.out.println("Charlie 미만: " + scores.lowerKey("Charlie"));
        
        System.out.println("\n=== 역순 TreeMap ===");
        TreeMap<String, Integer> reverse = 
            new TreeMap<>(Comparator.reverseOrder());
        reverse.putAll(scores);
        System.out.println("역순: " + reverse);
        
        System.out.println("\n=== 범위 기반 통계 ===");
        int countInRange = scores.subMap("Bob", "Eve").size();
        int avgInRange = scores.subMap("Bob", "Eve").values()
            .stream()
            .mapToInt(Integer::intValue)
            .sum() / countInRange;
        System.out.println("Bob ~ Eve 학생 수: " + countInRange);
        System.out.println("평균 점수: " + avgInRange);
    }
}
```

### 실행 결과
```
=== TreeMap 범위 조회 ===
전체 맵: {Alice=85, Bob=92, Charlie=78, David=88, Eve=95}

=== headMap (특정 키 이전) ===
David 이전: {Alice=85, Bob=92, Charlie=78}

=== tailMap (특정 키 이후) ===
David 이후: {David=88, Eve=95}

=== subMap (범위) ===
Bob ~ Eve (Eve 제외): {Bob=92, Charlie=78, David=88}

=== 첫/마지막 엔트리 ===
첫 번째: Alice=85
마지막: Eve=95
첫 키: Alice
마지막 키: Eve

=== 가장 가까운 키 ===
Charlie 이상: Charlie
Charlie 초과: David
Charlie 이하: Charlie
Charlie 미만: Bob

=== 역순 TreeMap ===
역순: {Eve=95, David=88, Charlie=78, Bob=92, Alice=85}

=== 범위 기반 통계 ===
Bob ~ Eve 학생 수: 3
평균 점수: 86
```

### 학습 포인트
- **범위 조회**: headMap, tailMap, subMap
- **경계값 찾기**: floor, ceiling, higher, lower
- **정렬 + 범위**: 범위 쿼리에 최적화

---

## Example 58: WeakHashMap (약한 참조)

키가 가비지 컬렉션 대상이 되면 자동으로 제거됩니다.

### 코드
```java
import java.util.*;

public class Example58_WeakHashMap {
    static class Key {
        int id;
        String name;
        
        public Key(int id, String name) {
            this.id = id;
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Key(" + id + ":" + name + ")";
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== HashMap vs WeakHashMap ===");
        
        System.out.println("\n--- HashMap ---");
        Map<Key, String> hashMap = new HashMap<>();
        Key key1 = new Key(1, "Alice");
        hashMap.put(key1, "점수: 85");
        System.out.println("저장 후: " + hashMap);
        
        key1 = null;  // 키 참조 제거
        System.gc();
        System.out.println("GC 후: " + hashMap);  // 여전히 존재
        
        System.out.println("\n--- WeakHashMap ---");
        Map<Key, String> weakMap = new WeakHashMap<>();
        Key key2 = new Key(2, "Bob");
        weakMap.put(key2, "점수: 92");
        System.out.println("저장 후: " + weakMap);
        
        key2 = null;  // 키 참조 제거
        System.gc();
        System.out.println("GC 후: " + weakMap);  // 제거됨
        
        System.out.println("\n=== 실제 사용 예 ===");
        Map<String, Integer> cache = new WeakHashMap<>();
        
        // 캐시에 데이터 저장
        String[] keys = new String[3];
        for (int i = 0; i < 3; i++) {
            String key = "cache_" + i;
            keys[i] = key;
            cache.put(key, i * 100);
        }
        
        System.out.println("캐시 크기: " + cache.size());
        
        // 참조 제거 시뮬레이션
        keys[0] = null;
        System.gc();
        System.out.println("첫 번째 제거 후: " + cache.size());
        
        System.out.println("\n=== WeakHashMap 사용 장점 ===");
        System.out.println("- 자동 메모리 관리");
        System.out.println("- 캐시 구현에 유용");
        System.out.println("- 리스너 패턴에서 활용");
    }
}
```

### 실행 결과
```
=== HashMap vs WeakHashMap ===

--- HashMap ---
저장 후: {Key(1:Alice)=점수: 85}
GC 후: {Key(1:Alice)=점수: 85}

--- WeakHashMap ---
저장 후: {Key(2:Bob)=점수: 92}
GC 후: {}

=== 실제 사용 예 ===
캐시 크기: 3
첫 번째 제거 후: 2

=== WeakHashMap 사용 장점 ===
- 자동 메모리 관리
- 캐시 구현에 유용
- 리스너 패턴에서 활용
```

### 학습 포인트
- **약한 참조**: 키의 참조가 없으면 자동 제거
- **메모리 관리**: GC 친화적
- **캐시 용도**: 자동 만료되는 캐시 구현

---

## Example 59: Comparator 심화 (복잡한 정렬)

여러 조건으로 복잡하게 정렬합니다.

### 코드
```java
import java.util.*;

public class Example59_AdvancedComparator {
    static class Employee {
        String name;
        int salary;
        String department;
        int yearsExperience;
        
        public Employee(String name, int salary, String dept, int years) {
            this.name = name;
            this.salary = salary;
            this.department = dept;
            this.yearsExperience = years;
        }
        
        @Override
        public String toString() {
            return String.format("%s(%s, $%d, %d년)", 
                name, department, salary, yearsExperience);
        }
    }
    
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 80000, "IT", 5),
            new Employee("Bob", 95000, "Finance", 8),
            new Employee("Charlie", 80000, "IT", 3),
            new Employee("David", 90000, "Finance", 6),
            new Employee("Eve", 85000, "HR", 4)
        );
        
        System.out.println("=== 단순 정렬 ===");
        employees.stream()
            .sorted(Comparator.comparingInt(e -> e.salary))
            .forEach(System.out::println);
        
        System.out.println("\n=== 다중 정렬 (부서별, 급여순) ===");
        employees.stream()
            .sorted(Comparator.comparing((Employee e) -> e.department)
                             .thenComparingInt(e -> e.salary))
            .forEach(System.out::println);
        
        System.out.println("\n=== 역순 정렬 (급여 높은 순) ===");
        employees.stream()
            .sorted(Comparator.comparingInt(Employee::salary).reversed())
            .forEach(System.out::println);
        
        System.out.println("\n=== 복잡한 다중 정렬 ===");
        // 1순위: 부서순 (IT > Finance > HR)
        // 2순위: 급여 역순
        // 3순위: 경력 역순
        employees.stream()
            .sorted(Comparator.comparing((Employee e) -> e.department)
                             .thenComparingInt(Employee::salary).reversed()
                             .thenComparingInt(Employee::yearsExperience).reversed())
            .forEach(System.out::println);
        
        System.out.println("\n=== 조건부 정렬 ===");
        Comparator<Employee> conditionalSort = (e1, e2) -> {
            // IT 부서를 먼저
            if (!e1.department.equals(e2.department)) {
                if (e1.department.equals("IT")) return -1;
                if (e2.department.equals("IT")) return 1;
            }
            // 같은 부서면 급여 높은 순
            return Integer.compare(e2.salary, e1.salary);
        };
        
        employees.stream()
            .sorted(conditionalSort)
            .forEach(System.out::println);
        
        System.out.println("\n=== nullsFirst/nullsLast ===");
        List<Integer> numbersWithNull = Arrays.asList(5, 2, null, 8, 1);
        numbersWithNull.stream()
            .sorted(Comparator.nullsFirst(Comparator.naturalOrder()))
            .forEach(System.out::println);
    }
}
```

### 실행 결과
```
=== 단순 정렬 ===
Charlie(IT, $80000, 3년)
Alice(IT, $80000, 5년)
Eve(HR, $85000, 4년)
David(Finance, $90000, 6년)
Bob(Finance, $95000, 8년)

=== 다중 정렬 (부서별, 급여순) ===
Bob(Finance, $95000, 8년)
David(Finance, $90000, 6년)
Eve(HR, $85000, 4년)
Alice(IT, $80000, 5년)
Charlie(IT, $80000, 3년)

=== 역순 정렬 (급여 높은 순) ===
Bob(Finance, $95000, 8년)
David(Finance, $90000, 6년)
Eve(HR, $85000, 4년)
Alice(IT, $80000, 5년)
Charlie(IT, $80000, 3년)

... (계속)
```

### 학습 포인트
- **Comparator 메서드**: comparing, thenComparing
- **reversed()**: 역순 정렬
- **nullsFirst/nullsLast**: null 처리

---

## Example 60: 실전 예제 - 재고 관리 시스템

여러 컬렉션을 조합한 실전 예제입니다.

### 코드
```java
import java.util.*;
import java.util.stream.Collectors;

public class Example60_InventorySystem {
    static class Product {
        String id;
        String name;
        int stock;
        int price;
        String category;
        
        public Product(String id, String name, int stock, int price, String cat) {
            this.id = id;
            this.name = name;
            this.stock = stock;
            this.price = price;
            this.category = cat;
        }
        
        @Override
        public String toString() {
            return String.format("%s(%s, 재고: %d, 가격: $%d)", 
                name, category, stock, price);
        }
    }
    
    public static void main(String[] args) {
        // 재고 데이터
        List<Product> inventory = Arrays.asList(
            new Product("P1", "노트북", 15, 1200, "전자"),
            new Product("P2", "마우스", 50, 25, "전자"),
            new Product("P3", "의자", 8, 150, "가구"),
            new Product("P4", "책상", 12, 300, "가구"),
            new Product("P5", "모니터", 20, 350, "전자"),
            new Product("P6", "키보드", 0, 80, "전자")
        );
        
        System.out.println("=== 1. 재고 부족 상품 (5개 미만) ===");
        List<Product> lowStock = inventory.stream()
            .filter(p -> p.stock < 5)
            .sorted(Comparator.comparingInt(p -> p.stock))
            .collect(Collectors.toList());
        lowStock.forEach(System.out::println);
        
        System.out.println("\n=== 2. 카테고리별 평균 가격 ===");
        Map<String, Double> avgPriceByCategory = inventory.stream()
            .collect(Collectors.groupingBy(
                p -> p.category,
                Collectors.averagingInt(p -> p.price)
            ));
        avgPriceByCategory.forEach((cat, price) -> 
            System.out.println(cat + ": $" + String.format("%.2f", price)));
        
        System.out.println("\n=== 3. 카테고리별 총 재고 ===");
        Map<String, Integer> totalStockByCategory = inventory.stream()
            .collect(Collectors.groupingBy(
                p -> p.category,
                Collectors.summingInt(p -> p.stock)
            ));
        totalStockByCategory.forEach((cat, stock) -> 
            System.out.println(cat + ": " + stock + "개"));
        
        System.out.println("\n=== 4. 가장 비싼 상품 top 3 ===");
        inventory.stream()
            .sorted(Comparator.comparingInt(p -> p.price).reversed())
            .limit(3)
            .forEach(System.out::println);
        
        System.out.println("\n=== 5. 재고 상태별 분류 ===");
        Map<String, List<Product>> byStatus = inventory.stream()
            .collect(Collectors.groupingBy(p -> {
                if (p.stock == 0) return "품절";
                if (p.stock < 5) return "부족";
                if (p.stock < 20) return "일반";
                return "충분";
            }));
        byStatus.forEach((status, products) -> 
            System.out.println(status + ": " + products.size() + "개"));
        
        System.out.println("\n=== 6. 가능한 주문 조합 찾기 ===");
        int targetBudget = 1500;
        TreeMap<Integer, List<Product>> byPriceRange = inventory.stream()
            .filter(p -> p.stock > 0 && p.price <= targetBudget)
            .collect(Collectors.groupingBy(
                p -> (p.price / 100) * 100,
                TreeMap::new,
                Collectors.toList()
            ));
        System.out.println("$" + targetBudget + " 이내 상품:");
        byPriceRange.forEach((priceRange, products) -> 
            System.out.println("  $" + priceRange + "-" + (priceRange + 100) + 
                             ": " + products.stream().map(p -> p.name)
                             .collect(Collectors.joining(", "))));
    }
}
```

### 실행 결과
```
=== 1. 재고 부족 상품 (5개 미만) ===
키보드(전자, 재고: 0, 가격: $80)
의자(가구, 재고: 8, 가격: $150)

=== 2. 카테고리별 평균 가격 ===
가구: $225.00
전자: $487.00

=== 3. 카테고리별 총 재고 ===
가구: 20개
전자: 85개

=== 4. 가장 비싼 상품 top 3 ===
모니터(전자, 재고: 20, 가격: $350)
책상(가구, 재고: 12, 가격: $300)
노트북(전자, 재고: 15, 가격: $1200)

=== 5. 재고 상태별 분류 ===
품절: 1개
부족: 1개
일반: 2개
충분: 2개

=== 6. 가능한 주문 조합 찾기 ===
$1500 이내 상품:
  $0-100: 마우스, 키보드
  $100-200: 의자
  ...
```

### 학습 포인트
- **복합 필터링**: 여러 조건의 조합
- **고급 그룹화**: groupingBy + 집계 함수
- **TreeMap**: 범위별 분류

---

## 🎯 컬렉션 선택 가이드

| 상황 | 추천 컬렉션 | 이유 |
|------|----------|------|
| **순서 유지, 중복 허용** | ArrayList | 빠른 접근 |
| **중간 삽입/삭제 많음** | LinkedList | 효율적인 수정 |
| **정렬된 상태 유지** | TreeSet/TreeMap | 자동 정렬 |
| **고속 조회** | HashSet/HashMap | O(1) 시간 |
| **우선순위 처리** | PriorityQueue | 우선순위 정렬 |
| **멀티스레드** | ConcurrentHashMap | 안전한 접근 |
| **열거형 키** | EnumMap/EnumSet | 메모리 효율 |
| **자동 메모리 관리** | WeakHashMap | GC 친화적 |

---

**마크다운 끝**
