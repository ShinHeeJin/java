package collections;

import java.util.HashMap;
import java.util.Map;

// HashMap 학습
// key-value 쌍으로 데이터를 저장

public class Example39_HashMap {
    public static void main(String[] args) {
        System.out.println("=== HashMap 생성 ===");
        Map<String, Integer> scores = new HashMap<>();

        System.out.println("=== 요소 추가 (put) ===");
        scores.put("Kim", 85);
        scores.put("Lee", 92);
        scores.put("Park", 78);
        scores.put("Choi", 88);
        System.out.println("점수: " + scores);

        System.out.println("\n=== 값 조회 (get) ===");
        System.out.println("Kim의 점수: " + scores.get("Kim"));
        System.out.println("Lee의 점수: " + scores.get("Lee"));

        System.out.println("\n=== 키 존재 여부 ===");
        System.out.println("'Kim' 존재?: " + scores.containsKey("Kim"));
        System.out.println("'Jung' 존재?: " + scores.containsKey("Jung"));

        System.out.println("\n=== 값 수정 ===");
        scores.put("Kim", 90);
        System.out.println("수정 후: " + scores);

        System.out.println("\n=== 요소 제거 ===");
        scores.remove("Park");
        System.out.println("제거 후: " + scores);

        System.out.println("\n=== 모든 키 조회 ===");
        System.out.println("모든 이름: " + scores.keySet());

        System.out.println("\n=== 모든 값 조회 ===");
        System.out.println("모든 점수: " + scores.values());

        System.out.println("\n=== 순회 ===");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }
}
