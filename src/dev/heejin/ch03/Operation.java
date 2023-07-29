package dev.heejin.ch03;

public class Operation {

    public static void main() {
        int x, y, z;
        x = 4;
        z = x = y = 5;
        System.out.println("z = " + z); // 5
    }
}
