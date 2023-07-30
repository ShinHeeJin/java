package dev.heejin.ch07;

public class InterfaceDefaultMethod {

    interface MyInterface {
        default void method1(){
            System.out.println("method1() in MyInterface");
        }
        default void method2(){
            System.out.println("method2() in MyInterface");
        }

        static void staticMethod(){
            System.out.println("staticMethod() in MyInterface");
        }
    }

    interface MyInterface2 {
        default void method1(){
            System.out.println("method1() in MyInterface2");
        }

        static void staticMethod(){
            System.out.println("staticMethod() in MyInterface2");
        }
    }

    class Parent {
         public void method2(){
            System.out.println("method2() in Parent3");
        }
    }

    class Child extends Parent implements MyInterface, MyInterface2{

        @Override
        public void method1() {
            System.out.println("method1() in Child");
        }
    }
    public void main() {
        Child child = new Child();
        child.method1();
        child.method2();;
        MyInterface.staticMethod();
        MyInterface2.staticMethod();

    }
}
