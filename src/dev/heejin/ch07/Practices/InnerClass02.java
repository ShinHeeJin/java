package dev.heejin.ch07.Practices;

class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}

public class InnerClass02 {
    public static void main() {
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        System.out.println(inner2.iv);

    }
}
