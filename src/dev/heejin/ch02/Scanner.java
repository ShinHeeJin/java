package dev.heejin.ch02;

public class Scanner {
    public static void main(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input Integer => ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println(input);
        System.out.printf("num = %d%n", num);
    }
}
