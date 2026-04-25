package collections;

import java.util.LinkedList;
import java.util.Queue;

// Queue 학습
// FIFO (First In First Out)

public class Example48_Queue {
    public static void main(String[] args) {
        System.out.println("=== Queue 생성 ===");
        Queue<String> queue = new LinkedList<>();

        System.out.println("=== 요소 추가 (enqueue) ===");
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        System.out.println("큐: " + queue);

        System.out.println("\n=== 첫 요소 확인 (peek) ===");
        System.out.println("첫 요소: " + queue.peek());

        System.out.println("\n=== 요소 제거 (dequeue) ===");
        System.out.println("제거된 요소: " + queue.poll());
        System.out.println("큐: " + queue);

        System.out.println("\n=== 크기와 비어있는지 확인 ===");
        System.out.println("크기: " + queue.size());
        System.out.println("비어있는가?: " + queue.isEmpty());
    }
}
