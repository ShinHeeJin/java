package dev.heejin.ch07;

public class InnerClass {

    class InstanceInnerClass {}
    static class StaticInnerClass {}

    void method(){
        class LocalInnerClass {}
    }
}
