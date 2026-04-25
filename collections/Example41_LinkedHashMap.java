package collections;

import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashMap 학습
// 삽입 순서를 유지하는 Map

public class Example41_LinkedHashMap {
    public static void main(String[] args) {
        System.out.println("=== LinkedHashMap 생성 ===");
        Map<String, Integer> map = new LinkedHashMap<>();

        System.out.println("=== 요소 추가 (삽입 순서 유지) ===");
        map.put("third", 3);
        map.put("first", 1);
        map.put("second", 2);
        map.put("fourth", 4);

        System.out.println("HashMap 출력 (일반 HashMap은 순서 미보장):");
        System.out.println(map);

        System.out.println("\n=== 순회 (삽입 순서) ===");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
