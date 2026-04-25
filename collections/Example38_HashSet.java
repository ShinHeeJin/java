package collections;

import java.util.HashSet;
import java.util.Set;

// HashSet 학습
// 중복을 허용하지 않는 집합

public class Example38_HashSet {
    public static void main(String[] args) {
        System.out.println("=== HashSet 생성 ===");
        Set<String> fruits = new HashSet<>();

        System.out.println("=== 요소 추가 ===");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple");  // 중복
        System.out.println("과일: " + fruits);
        System.out.println("크기: " + fruits.size());

        System.out.println("\n=== 요소 존재 여부 ===");
        System.out.println("'banana' 포함?: " + fruits.contains("banana"));
        System.out.println("'grape' 포함?: " + fruits.contains("grape"));

        System.out.println("\n=== 요소 제거 ===");
        fruits.remove("apple");
        System.out.println("제거 후: " + fruits);

        System.out.println("\n=== 정수 HashSet ===");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);  // 중복
        System.out.println("숫자: " + numbers);

        System.out.println("\n=== 순회 ===");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
