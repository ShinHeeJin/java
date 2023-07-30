package dev.heejin.ch07;

public class InnerClassPractice { // OuterClass

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInnerClass {
        int iiv = outerIv; // private이어도 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInnerClass {
//        스태틱 클래스는 외부 클래스의 인스턴스에멤버에 접근할 수 없다.
//        int siv = outerIv;
        static int siv = outerCv;
    }

    void method(){
        int lv = 0;
        final int LV = 0;

        class LocalInnerClass {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv; // JDK1.8부터 에러아님
            int liv4 = LV;
        }
    }
}
