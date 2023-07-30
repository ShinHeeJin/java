package dev.heejin.ch07.Practices;

class Outer {
    class Inner {
        int iv = 100;
    }
}

public class InnerClass01 {
    public void main() {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.iv);
    }
}
