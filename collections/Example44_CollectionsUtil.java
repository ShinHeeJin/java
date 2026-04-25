package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Collections 유틸리티 학습

public class Example44_CollectionsUtil {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        System.out.println("=== sort (정렬) ===");
        Collections.sort(numbers);
        System.out.println("정렬: " + numbers);

        System.out.println("\n=== reverse (역순) ===");
        Collections.reverse(numbers);
        System.out.println("역순: " + numbers);

        System.out.println("\n=== max/min ===");
        System.out.println("최대값: " + Collections.max(numbers));
        System.out.println("최소값: " + Collections.min(numbers));

        System.out.println("\n=== shuffle (섞기) ===");
        Collections.shuffle(numbers);
        System.out.println("섞인 후: " + numbers);

        System.out.println("\n=== frequency (빈도) ===");
        List<String> words = Arrays.asList("java", "python", "java", "c++");
        System.out.println("'java' 빈도: " + Collections.frequency(words, "java"));
    }
}
