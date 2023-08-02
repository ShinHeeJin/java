package dev.heejin.ch09;

public class StringToNumber {
    public static void main() {

        int i = new Integer("100").intValue();  // 100
        int i2 = Integer.parseInt("100");  // 100
        int i3 = Integer.valueOf("100"); // 100

        int i4 = Integer.parseInt("100", 2); // 4
        int i5 = Integer.parseInt("100", 10); // 100

    }
}
