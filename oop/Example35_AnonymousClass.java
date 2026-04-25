package oop;

// 익명 클래스(Anonymous Class) 학습
// 이름이 없는 클래스

interface Greeting {
    void sayHello();
}

interface Calculator {
    int calculate(int a, int b);
}

abstract class Animal3 {
    abstract void speak();

    public void sleep() {
        System.out.println("자고 있습니다");
    }
}

class AnonymousClassExample {
    public void demonstrateInterface() {
        // 익명 클래스로 인터페이스 구현
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("인터페이스 익명 클래스: 안녕하세요!");
            }
        };

        greeting.sayHello();
    }

    public void demonstrateAbstractClass() {
        // 익명 클래스로 추상 클래스 구현
        Animal3 animal = new Animal3() {
            @Override
            void speak() {
                System.out.println("추상 클래스 익명 클래스: 동물 소리");
            }
        };

        animal.speak();
        animal.sleep();
    }

    public void demonstrateCalculator() {
        // 덧셈
        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // 곱셈
        Calculator multiply = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        System.out.println("5 + 3 = " + add.calculate(5, 3));
        System.out.println("5 * 3 = " + multiply.calculate(5, 3));
    }

    public Runnable createRunnable(String message) {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 Runnable: " + message);
            }
        };
    }
}

public class Example35_AnonymousClass {
    public static void main(String[] args) {
        AnonymousClassExample example = new AnonymousClassExample();

        System.out.println("=== 인터페이스 익명 클래스 ===");
        example.demonstrateInterface();

        System.out.println("\n=== 추상 클래스 익명 클래스 ===");
        example.demonstrateAbstractClass();

        System.out.println("\n=== 함수형 인터페이스 익명 클래스 ===");
        example.demonstrateCalculator();

        System.out.println("\n=== Runnable 익명 클래스 ===");
        Runnable runnable1 = example.createRunnable("첫 번째 메시지");
        Runnable runnable2 = example.createRunnable("두 번째 메시지");

        runnable1.run();
        runnable2.run();

        System.out.println("\n=== 배열 초기화 익명 클래스 ===");
        Greeting[] greetings = {
            new Greeting() {
                @Override
                public void sayHello() {
                    System.out.println("안녕하세요!");
                }
            },
            new Greeting() {
                @Override
                public void sayHello() {
                    System.out.println("Hello!");
                }
            },
            new Greeting() {
                @Override
                public void sayHello() {
                    System.out.println("Hola!");
                }
            }
        };

        for (Greeting greeting : greetings) {
            greeting.sayHello();
        }

        System.out.println("\n=== 익명 클래스의 장점과 단점 ===");
        System.out.println("장점:");
        System.out.println("- 한 번만 사용하는 클래스에 적합");
        System.out.println("- 코드가 간결함");
        System.out.println("\n단점:");
        System.out.println("- 가독성 저하 가능");
        System.out.println("- 코드가 길어질 수 있음");
    }
}
