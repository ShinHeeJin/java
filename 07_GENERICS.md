# 제네릭 (Generics) - 5개 예제

## Example 81: 제네릭 클래스

타입 안전성을 보장하는 제네릭을 학습합니다.

### 코드
```java
class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void show() {
        System.out.println("Item: " + item);
    }
}

public class Example81_GenericClass {
    public static void main(String[] args) {
        System.out.println("=== String Box ===");
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello");
        stringBox.show();

        System.out.println("\n=== Integer Box ===");
        Box<Integer> intBox = new Box<>();
        intBox.put(42);
        intBox.show();
    }
}
```

### 실행 결과
```
=== String Box ===
Item: Hello

=== Integer Box ===
Item: 42
```

---

## Example 82: 제네릭 메서드

메서드를 제네릭으로 정의합니다.

### 코드
```java
public class Example82_GenericMethod {
    
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("=== String 배열 ===");
        String[] strings = {"Apple", "Banana", "Cherry"};
        printArray(strings);

        System.out.println("\n=== Integer 배열 ===");
        Integer[] integers = {5, 2, 8, 1};
        printArray(integers);

        System.out.println("\n=== 최대값 ===");
        System.out.println("최대값: " + findMax(integers));
    }
}
```

### 실행 결과
```
=== String 배열 ===
Apple
Banana
Cherry

=== Integer 배열 ===
5
2
8
1

=== 최대값 ===
최대값: 8
```

---

## Example 83-85: 고급 제네릭

제한된 타입, 와일드카드, 타입 소거

### 와일드카드 예제
```java
public static void printList(List<?> list) {
    for (Object item : list) {
        System.out.println(item);
    }
}

public static double sumNumbers(List<? extends Number> list) {
    double sum = 0;
    for (Number num : list) {
        sum += num.doubleValue();
    }
    return sum;
}
```

