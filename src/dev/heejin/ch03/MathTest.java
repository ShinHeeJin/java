package dev.heejin.ch03;

import static java.lang.Math.*;

public class MathTest {

    public static void main() {

        // 반올림
        double pi = 3.141592;
        System.out.println(round(pi)); // 3, 소숫점 1번째 반올림
        System.out.println(round(pi * 1000) / 1000.0); // 3.142, 소숫점 3번째 반올림

    }
}
