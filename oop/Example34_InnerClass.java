package oop;

// 내부 클래스(Inner Class) 학습
// 클래스 내부에 선언된 클래스

class Outer {
    private String outerField = "외부 클래스 변수";
    public static String staticField = "정적 변수";

    // 인스턴스 내부 클래스
    public class InnerClass {
        private String innerField = "내부 클래스 변수";

        public void printInfo() {
            System.out.println("내부: " + innerField);
            System.out.println("외부에서 접근: " + outerField);
            System.out.println("정적: " + staticField);
        }
    }

    // 정적 내부 클래스
    public static class StaticInnerClass {
        private String staticInnerField = "정적 내부 클래스 변수";

        public void printInfo() {
            System.out.println("정적 내부: " + staticInnerField);
            System.out.println("정적: " + staticField);
            // System.out.println(outerField);  // 에러: 인스턴스 변수 접근 불가
        }
    }

    // 로컬 클래스 (메서드 내부)
    public void createLocalClass() {
        String localVariable = "로컬 변수";

        class LocalClass {
            void printInfo() {
                System.out.println("로컬: " + localVariable);
                System.out.println("외부: " + outerField);
            }
        }

        LocalClass local = new LocalClass();
        local.printInfo();
    }

    public void displayOuter() {
        System.out.println("외부 클래스 메서드: " + outerField);
    }
}

class Outer2 {
    private int value = 100;

    // 익명 내부 클래스 생성 메서드
    public Runnable createRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 실행, 외부 값: " + value);
            }
        };
    }
}

public class Example34_InnerClass {
    public static void main(String[] args) {
        System.out.println("=== 인스턴스 내부 클래스 ===");
        Outer outer = new Outer();
        Outer.InnerClass inner = outer.new InnerClass();
        inner.printInfo();

        System.out.println("\n=== 정적 내부 클래스 ===");
        Outer.StaticInnerClass staticInner = new Outer.StaticInnerClass();
        staticInner.printInfo();

        System.out.println("\n=== 로컬 클래스 ===");
        outer.createLocalClass();

        System.out.println("\n=== 외부 클래스 메서드 ===");
        outer.displayOuter();

        System.out.println("\n=== 익명 내부 클래스 ===");
        Outer2 outer2 = new Outer2();
        Runnable runnable = outer2.createRunnable();
        runnable.run();

        System.out.println("\n=== 내부 클래스의 장점 ===");
        System.out.println("- 논리적 그룹화");
        System.out.println("- 캡슐화 강화");
        System.out.println("- 외부 클래스의 private 멤버 접근 가능");
    }
}
