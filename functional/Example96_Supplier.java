package functional;

import java.util.function.Supplier;

// Supplier 함수형 인터페이스 학습

public class Example96_Supplier {
    public static void main(String[] args) {
        System.out.println("=== Supplier: 랜덤 숫자 ===");
        Supplier<Integer> randomNumber = () -> (int)(Math.random() * 100);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumber.get());
        }

        System.out.println("\n=== Supplier: 문자열 생성 ===");
        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        System.out.println("\n=== Supplier: 현재 시간 ===");
        Supplier<Long> currentTime = System.currentTimeMillis()::longValue;
        System.out.println("시간 1: " + System.currentTimeMillis());
        System.out.println("시간 2: " + System.currentTimeMillis());
    }
}
