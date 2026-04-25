package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Function 함수형 인터페이스 학습

public class Example94_Function {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("=== Function: 2배 ===");
        Function<Integer, Integer> doubleIt = n -> n * 2;
        numbers.stream()
               .map(doubleIt)
               .forEach(System.out::println);

        System.out.println("\n=== Function: 정수를 문자열로 ===");
        Function<Integer, String> toStr = String::valueOf;
        numbers.stream()
               .map(toStr)
               .forEach(System.out::println);

        System.out.println("\n=== Function 조합 ===");
        Function<Integer, Integer> double2x = n -> n * 2;
        Function<Integer, Integer> addOne = n -> n + 1;
        Function<Integer, Integer> composed = double2x.andThen(addOne);
        
        numbers.stream()
               .map(composed)
               .forEach(System.out::println);
    }
}
