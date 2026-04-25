# 컬렉션 (Collections) - 15개 예제

## Example 36: ArrayList

크기가 동적으로 변하는 배열입니다.

### 코드
```java
import java.util.ArrayList;
import java.util.List;

public class Example36_ArrayList {
    public static void main(String[] args) {
        System.out.println("=== ArrayList 생성 ===");
        List<String> fruits = new ArrayList<>();

        System.out.println("=== 요소 추가 ===");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("과일: " + fruits);

        System.out.println("\n=== 요소 접근 ===");
        System.out.println("첫 번째: " + fruits.get(0));
        System.out.println("마지막: " + fruits.get(fruits.size() - 1));

        System.out.println("\n=== 요소 제거 ===");
        fruits.remove(0);
        System.out.println("제거 후: " + fruits);

        System.out.println("\n=== 정렬 ===");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        Collections.sort(numbers);
        System.out.println("정렬: " + numbers);
    }
}
```

### 실행 결과
```
=== ArrayList 생성 ===
=== 요소 추가 ===
과일: [apple, banana, cherry]

=== 요소 접근 ===
첫 번째: apple
마지막: cherry

=== 요소 제거 ===
제거 후: [banana, cherry]

=== 정렬 ===
정렬: [10, 20, 40, 50]
```

### 학습 포인트
- **동적 크기**: 요소 추가 시 자동 확장
- **Generic 타입**: List<T> 형식
- **메서드**: add, remove, get, size, contains

---

## Example 37: LinkedList

양방향 연결 리스트입니다.

### 코드
```java
import java.util.LinkedList;
import java.util.Queue;

public class Example37_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("=== 요소 추가 ===");
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println("리스트: " + list);

        System.out.println("\n=== 첫/마지막에 추가 ===");
        list.addFirst("zero");
        list.addLast("fourth");
        System.out.println("수정 후: " + list);

        System.out.println("\n=== Queue로 사용 ===");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("큐: " + queue);
        System.out.println("제거: " + queue.poll());
        System.out.println("큐 후: " + queue);
    }
}
```

### 실행 결과
```
=== 요소 추가 ===
리스트: [first, second, third]

=== 첫/마지막에 추가 ===
수정 후: [zero, first, second, third, fourth]

=== Queue로 사용 ===
큐: [10, 20, 30]
제거: 10
큐 후: [20, 30]
```

---

## Example 38: HashSet

중복을 허용하지 않는 집합입니다.

### 코드
```java
import java.util.HashSet;
import java.util.Set;

public class Example38_HashSet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        System.out.println("=== 요소 추가 (중복 제거) ===");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple");  // 중복
        System.out.println("과일: " + fruits);

        System.out.println("\n=== 요소 존재 여부 ===");
        System.out.println("'banana' 포함?: " + fruits.contains("banana"));
        System.out.println("'grape' 포함?: " + fruits.contains("grape"));

        System.out.println("\n=== 요소 제거 ===");
        fruits.remove("apple");
        System.out.println("제거 후: " + fruits);
    }
}
```

### 실행 결과
```
=== 요소 추가 (중복 제거) ===
과일: [apple, banana, cherry]

=== 요소 존재 여부 ===
'banana' 포함?: true
'grape' 포함?: false

=== 요소 제거 ===
제거 후: [banana, cherry]
```

---

## Example 39: HashMap

key-value 쌍으로 데이터를 저장합니다.

### 코드
```java
import java.util.HashMap;
import java.util.Map;

public class Example39_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        System.out.println("=== 요소 추가 ===");
        scores.put("Kim", 85);
        scores.put("Lee", 92);
        scores.put("Park", 78);
        System.out.println("점수: " + scores);

        System.out.println("\n=== 값 조회 ===");
        System.out.println("Kim의 점수: " + scores.get("Kim"));

        System.out.println("\n=== 값 수정 ===");
        scores.put("Kim", 90);
        System.out.println("수정 후: " + scores.get("Kim"));

        System.out.println("\n=== 순회 ===");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }
}
```

### 실행 결과
```
=== 요소 추가 ===
점수: {Kim=85, Lee=92, Park=78}

=== 값 조회 ===
Kim의 점수: 85

=== 값 수정 ===
수정 후: 90

=== 순회 ===
Kim: 90
Lee: 92
Park: 78
```

---

## Example 40-50: 나머지 컬렉션 예제

TreeSet, TreeMap, Queue, Stack 등이 포함됩니다.

### 주요 특징

| 컬렉션 | 특징 | 사용 시기 |
|--------|------|----------|
| ArrayList | 빠른 접근 | 순차 접근 필요 |
| LinkedList | 삽입/삭제 빠름 | 중간 삽입/삭제 |
| HashSet | 중복 제거 | 유니크한 값만 필요 |
| TreeSet | 정렬됨 | 정렬된 데이터 필요 |
| HashMap | Key-value 저장 | 데이터 매핑 |
| TreeMap | 정렬된 Map | 정렬된 Key 필요 |

