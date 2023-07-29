package dev.heejin.ch04;

import java.util.Scanner;

public class Practice {
    public static void main() {

        int answer = (int)(Math.random() * 100) + 1;
        int input;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        outer:
        do {
            count++;
            System.out.print("1 ~ 100 사이의 정수를 입력하세요 : ");
            input = scanner.nextInt();
            if (input == answer) {
                System.out.println("정답입니다." + count + "번 만입니다.");
                break outer;
            }
            else if(input > answer){
                System.out.println("더 작은값을 입력하세요.");
            } else {
                System.out.println("더 큰값을 입력햊세요.");
            }
        } while (true);
    }
}
