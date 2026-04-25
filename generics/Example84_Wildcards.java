package generics;

import java.util.ArrayList;
import java.util.List;

// 와일드카드 학습

public class Example84_Wildcards {
    
    // ? : 모든 타입 가능
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // ? extends Number : Number와 그 서브타입만
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // ? super Integer : Integer와 그 슈퍼타입만
    public static void addInteger(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        System.out.println("=== 와일드카드 ? ===");
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        printList(strings);

        System.out.println("\n=== ? extends Number ===");
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        System.out.println("합계: " + sumNumbers(integers));

        System.out.println("\n=== ? super Integer ===");
        List<Number> numbers = new ArrayList<>();
        addInteger(numbers);
        System.out.println(numbers);
    }
}
