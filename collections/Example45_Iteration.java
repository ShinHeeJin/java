package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// 컬렉션 반복 학습

public class Example45_Iteration {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("=== for-each 루프 ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== Iterator ===");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n=== ListIterator (역순) ===");
        ListIterator<String> lit = fruits.listIterator(fruits.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println("\n=== forEach 메서드 ===");
        fruits.forEach(f -> System.out.println(f));
    }
}
