package collections;

import java.util.Stack;

// Stack 학습
// LIFO (Last In First Out)

public class Example50_Stack {
    public static void main(String[] args) {
        System.out.println("=== Stack 생성 ===");
        Stack<Integer> stack = new Stack<>();

        System.out.println("=== 요소 추가 (push) ===");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("스택: " + stack);

        System.out.println("\n=== 요소 확인 (peek) ===");
        System.out.println("맨 위 요소: " + stack.peek());

        System.out.println("\n=== 요소 제거 (pop) ===");
        System.out.println("제거된 요소: " + stack.pop());
        System.out.println("스택: " + stack);

        System.out.println("\n=== 비어있는지 확인 ===");
        System.out.println("비어있는가?: " + stack.empty());
        System.out.println("크기: " + stack.size());

        System.out.println("\n=== 괄호 맞추기 예제 ===");
        String expr = "({})";
        System.out.println("식: " + expr);
        System.out.println("유효한가?: " + isValidExpression(expr));
    }

    public static boolean isValidExpression(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
