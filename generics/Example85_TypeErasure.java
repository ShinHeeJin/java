package generics;

import java.util.ArrayList;
import java.util.List;

// 타입 소거 학습
// 컴파일 후 타입 정보는 제거됨

public class Example85_TypeErasure {
    public static void main(String[] args) {
        System.out.println("=== 타입 소거 ===");
        
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        List<Integer> integers = new ArrayList<>();
        integers.add(42);

        System.out.println("strings와 integers의 런타임 클래스는?");
        System.out.println(strings.getClass());
        System.out.println(integers.getClass());
        System.out.println("같은가?: " + strings.getClass().equals(integers.getClass()));

        System.out.println("\n=== 제네릭 타입 정보 얻기 ===");
        System.out.println("String 리스트 타입: " + strings.getClass().getGenericSuperclass());

        System.out.println("\n=== 런타임에는 제네릭 타입 확인 불가 ===");
        // List<String>과 List<Integer>는 런타임에 구별 불가
        // instanceof로도 List<String>인지 확인할 수 없음
        System.out.println("제네릭 타입은 런타임에 제거됨");
    }
}
