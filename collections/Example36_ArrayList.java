package collections;

import java.util.ArrayList;
import java.util.List;

// ArrayList 학습
// 크기가 동적으로 변하는 배열

public class Example36_ArrayList {
    public static void main(String[] args) {
        System.out.println("=== ArrayList 생성 ===");
        List<String> fruits = new ArrayList<>();

        System.out.println("=== 요소 추가 (add) ===");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        System.out.println("과일 목록: " + fruits);
        System.out.println("크기: " + fruits.size());

        System.out.println("\n=== 특정 위치에 추가 ===");
        fruits.add(1, "blueberry");
        System.out.println("수정 후: " + fruits);

        System.out.println("\n=== 요소 접근 (get) ===");
        System.out.println("첫 번째: " + fruits.get(0));
        System.out.println("마지막: " + fruits.get(fruits.size() - 1));

        System.out.println("\n=== 요소 제거 (remove) ===");
        fruits.remove(0);
        System.out.println("첫 번째 제거 후: " + fruits);

        fruits.remove("cherry");
        System.out.println("cherry 제거 후: " + fruits);

        System.out.println("\n=== 요소 존재 여부 (contains) ===");
        System.out.println("'banana' 포함?: " + fruits.contains("banana"));
        System.out.println("'grape' 포함?: " + fruits.contains("grape"));

        System.out.println("\n=== 요소 위치 찾기 (indexOf) ===");
        System.out.println("'banana'의 위치: " + fruits.indexOf("banana"));
        System.out.println("'date'의 위치: " + fruits.indexOf("date"));

        System.out.println("\n=== 요소 수정 (set) ===");
        fruits.set(1, "elderberry");
        System.out.println("수정 후: " + fruits);

        System.out.println("\n=== 리스트 순회 ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== 정수형 ArrayList ===");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("숫자: " + numbers);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("합계: " + sum);

        System.out.println("\n=== ArrayList 비우기 ===");
        fruits.clear();
        System.out.println("비운 후 크기: " + fruits.size());
        System.out.println("비어있는가?: " + fruits.isEmpty());
    }
}
