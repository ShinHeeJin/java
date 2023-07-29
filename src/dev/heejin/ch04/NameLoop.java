package dev.heejin.ch04;

public class NameLoop {

    public static void main() {
        // Named For Loop
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

        // Named While Loop
        int a = 1;
        System.out.println("start - a = " + a);
        outer:
        while (true){
            System.out.println("==================");
            if ( a == 5 ){
                break;
            } else if ( a == 6 ) {
                continue outer;
            }
            a++;

            inner:
            while (true) {
                System.out.println("------------------");
                System.out.println("a = " + a);
                if (a == 7) {
                    System.out.println("a is 7");
                    break outer;
                }
                a++;
            }
        }
    }
}
