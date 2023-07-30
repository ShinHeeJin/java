package dev.heejin.ch07;

class OuterClass{
    int value = 10;

    class InnerClass {
        int value = 20;

        void method(){
            int value = 30;
            System.out.println("value = " + value); // 30
            System.out.println("this.val = " + this.value); // 20
            System.out.println("OuterClass.this.value = " + OuterClass.this.value); // 10
        }
    }
}

public class InnerClassPractice3 {
    public void main() {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.method();

    }
}
