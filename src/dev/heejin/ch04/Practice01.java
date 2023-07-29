package dev.heejin.ch04;

public class Practice01 {
    public static void main() {
        int num = 123456;
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = " + sum); // 21
    }
}
