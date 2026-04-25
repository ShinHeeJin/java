package collections;

import java.util.TreeMap;
import java.util.Map;

// TreeMap 학습
// 정렬된 Map

public class Example42_TreeMap {
    public static void main(String[] args) {
        System.out.println("=== TreeMap 생성 ===");
        TreeMap<String, Integer> scores = new TreeMap<>();

        System.out.println("=== 요소 추가 (정렬됨) ===");
        scores.put("David", 85);
        scores.put("Alex", 92);
        scores.put("Bob", 78);
        scores.put("Charlie", 88);
        System.out.println("점수: " + scores);

        System.out.println("\n=== 첫/마지막 엔트리 ===");
        System.out.println("첫 번째: " + scores.firstEntry());
        System.out.println("마지막: " + scores.lastEntry());

        System.out.println("\n=== 범위 조회 ===");
        System.out.println("Alex부터 Bob까지: " + scores.subMap("Alex", "Charlie"));
    }
}
