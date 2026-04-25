package collections;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque 학습
// Double Ended Queue

public class Example49_Deque {
    public static void main(String[] args) {
        System.out.println("=== Deque 생성 ===");
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("=== 양쪽 끝에 추가 ===");
        deque.addFirst(1);
        deque.addLast(3);
        deque.addFirst(0);
        System.out.println("Deque: " + deque);

        System.out.println("\n=== 양쪽 끝에서 제거 ===");
        System.out.println("앞에서 제거: " + deque.removeFirst());
        System.out.println("뒤에서 제거: " + deque.removeLast());
        System.out.println("Deque: " + deque);

        System.out.println("\n=== Stack처럼 사용 (LIFO) ===");
        Deque<String> stack = new ArrayDeque<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
    }
}
