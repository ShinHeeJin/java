package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashMap 학습

public class Example43_LinkedHashMap {
    public static void main(String[] args) {
        System.out.println("=== HashMap (순서 보장 X) ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("third", 3);
        hashMap.put("first", 1);
        hashMap.put("second", 2);
        System.out.println(hashMap);

        System.out.println("\n=== LinkedHashMap (삽입 순서) ===");
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("third", 3);
        linkedMap.put("first", 1);
        linkedMap.put("second", 2);
        System.out.println(linkedMap);
    }
}
