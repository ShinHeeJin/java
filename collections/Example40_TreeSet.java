package collections;

import java.util.Set;
import java.util.TreeSet;

// TreeSet 학습
// 정렬된 집합

public class Example40_TreeSet {
    public static void main(String[] args) {
        System.out.println("=== TreeSet 생성 (정렬) ===");
        Set<Integer> numbers = new TreeSet<>();

        System.out.println("=== 요소 추가 ===");
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);
        System.out.println("숫자: " + numbers);  // 자동 정렬

        System.out.println("\n=== 문자열 TreeSet ===");
        Set<String> fruits = new TreeSet<>();
        fruits.add("cherry");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("date");
        System.out.println("과일: " + fruits);  // 알파벳순 정렬

        System.out.println("\n=== 첫/마지막 요소 ===");
        TreeSet<Integer> treeSet = new TreeSet<>(numbers);
        System.out.println("첫 번째: " + treeSet.first());
        System.out.println("마지막: " + treeSet.last());

        System.out.println("\n=== 범위 조회 ===");
        System.out.println("20 이상 80 미만: " + treeSet.subSet(20, 80));
    }
}
