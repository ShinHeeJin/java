package dev.heejin.ch04;

public class NameLoop {

    public static void main() {
        Loop1 : for (int i = 2; i <= 9 ; i++) {
            Loop2 : for (int j = 1; j <= 9 ; j++) {
                if (j==5){
                    break Loop2;
                }
                System.out.println(i + " * " + j + " = " + i * j);
            }
            if (i==6){
                break Loop1;
            }
            System.out.println("=====================");
        }
    }
}
