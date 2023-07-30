package dev.heejin.ch07.Practices;

class Outer3{
    int value = 10;

    class Inner3 {
        int value = 20;

        void method(){
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer3.this.value); // ***** //

        }
    }
}

public class InnerClass03 {
    public static void main() {

        Outer3 outer3 = new Outer3();
        Outer3.Inner3 inner = outer3.new Inner3();
        inner.method();
    }
}
