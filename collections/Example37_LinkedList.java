package collections;

import java.util.LinkedList;
import java.util.Queue;

// LinkedList 학습
// 양방향 연결 리스트

public class Example37_LinkedList {
    public static void main(String[] args) {
        System.out.println("=== LinkedList 생성 ===");
        LinkedList<String> list = new LinkedList<>();

        System.out.println("=== 요소 추가 ===");
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println("리스트: " + list);

        System.out.println("\n=== 첫/마지막에 추가 ===");
        list.addFirst("zero");
        list.addLast("fourth");
        System.out.println("수정 후: " + list);

        System.out.println("\n=== 첫/마지막 요소 접근 ===");
        System.out.println("첫 번째: " + list.getFirst());
        System.out.println("마지막: " + list.getLast());

        System.out.println("\n=== 첫/마지막 요소 제거 ===");
        list.removeFirst();
        list.removeLast();
        System.out.println("제거 후: " + list);

        System.out.println("\n=== Queue로 사용 ===");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);  // enqueue
        queue.offer(20);
        queue.offer(30);
        System.out.println("큐: " + queue);

        System.out.println("첫 요소: " + queue.peek());
        System.out.println("제거: " + queue.poll());  // dequeue
        System.out.println("큐 후: " + queue);
    }
}
