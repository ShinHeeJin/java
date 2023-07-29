package dev.heejin.ch02;

public class Practice {
    public static void main() {
        System.out.println("1" + "2");
        System.out.println(true + "");
        System.out.println('A' + 'B'); // 131, 65 + 66
        System.out.println('1' + 2); // 51, 49 + 2
        System.out.println('1' + '2'); // 99, 49 + 50
        System.out.println('J' + "ava"); // Java
//        System.out.println(true + null); // compile error
        System.out.printf("%d, %d, %d", (int)'A', (int)'B', (int)'1');
    }
}
