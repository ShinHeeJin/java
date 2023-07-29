package dev.heejin.ch03;

public class StringComparison {
    public static void main() {

        String str = "str";
        System.out.println(str.equals("str")); // true
        System.out.println("str" == "str"); // true
        System.out.println("str" == new String("str")); // false
        System.out.println("str".equals("str")); // true
        System.out.println("str".equalsIgnoreCase("Str")); // true
    }
}
