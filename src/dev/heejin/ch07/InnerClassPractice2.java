package dev.heejin.ch07;

class Outer{
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void method(){
        class LocalInner {
            int iv = 400;
        }
    }
}

public class InnerClassPractice2 {
    public void main() {

        Outer outer = new Outer();
        Outer.InstanceInner instanceInner = outer.new InstanceInner();

        System.out.println("instanceInner.iv = " + instanceInner.iv);
        System.out.println("Outer.StaticInner.cv = " + Outer.StaticInner.cv);

        Outer.StaticInner staticInner = new Outer.StaticInner();
        System.out.println("staticInner.iv = " + staticInner.iv);
    }
}
