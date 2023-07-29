package dev.heejin.ch03;

public class Operation {

    public static void main() {
        int x, y, z;
        x = 4;
        z = x = y = 5;
        System.out.println("z = " + z); // 5

        int i = 5, j = 0;
        j = i++;
        System.out.println("i, j = " + i + "," + j); // 6, 5

        i = 5;
        j = 0;
        j = ++i;
        System.out.println("i, j = " + i + "," + j); // 6, 6

        i = 5; j = 0;
        System.out.println(i++); // 5
        System.out.println(++j); // 1
        System.out.println("i, j = " + i + "," + j); // 6, 1
        System.out.println("--i = " + --i); // 5

        // 자동 형변환
        float f = 1234;
        // byte b = 1000; compile error ( -128 ~ 127 )
        byte b = (byte)1000; // -24, 값 손실
        System.out.println("f = " + f);
        System.out.println("b = " + b);

        // 사칙연산자
        System.out.println(10 / 4); // 2
        System.out.println(10 / 4.0); // 2.5
        System.out.println(10 / (float)4); // 2.5

        // 산술변환
        byte a = 10;
        byte bb = 30;
//        byte c = a + bb; compile error
        byte c = (byte)(a + bb);
        System.out.println("c = " + c); // 40
        byte d = (byte) (a * bb);
        System.out.println("d = " + d); // 44 ( 값 손실 )

        int aaa = 1_000_000;
        int bbb = 2_000_000;
        long ccc = aaa * bbb; // overflow
        System.out.println("ccc = " + ccc); // -1454759936
        long cccc = (long)aaa * bbb;
        System.out.println("cccc = " + cccc); // 2000000000000
    }
}
