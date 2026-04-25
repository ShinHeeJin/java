package oop;

// final 키워드 학습
// final 클래스, 메서드, 변수

final class ImmutableClass {
    private final int value;
    private final String name;

    public ImmutableClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

class Constants {
    // 상수 (final 변수)
    public static final double PI = 3.14159265359;
    public static final String COMPANY_NAME = "Java Company";
    public static final int MAX_USERS = 100;

    private final String id;

    public Constants(String id) {
        this.id = id;  // final 변수는 생성자에서 초기화 가능
    }

    public final void printId() {
        System.out.println("ID: " + id);
    }
}

class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    // final 메서드: 오버라이딩 불가
    public final void cannotOverride() {
        System.out.println(name + ": 이 메서드는 오버라이드할 수 없습니다");
    }

    public void canOverride() {
        System.out.println(name + ": 이 메서드는 오버라이드할 수 있습니다");
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    // 이 메서드는 오버라이드 가능
    @Override
    public void canOverride() {
        System.out.println(name + ": 오버라이드되었습니다");
    }

    // 다음 코드는 컴파일 에러
    // @Override
    // public void cannotOverride() {  // final 메서드이므로 오버라이드 불가
    // }
}

public class Example26_FinalKeyword {
    public static void main(String[] args) {
        System.out.println("=== final 클래스 ===");
        ImmutableClass obj = new ImmutableClass(42, "test");
        System.out.println("값: " + obj.getValue());
        System.out.println("이름: " + obj.getName());
        // 다음 코드는 컴파일 에러
        // class Extended extends ImmutableClass {}  // final 클래스이므로 상속 불가

        System.out.println("\n=== final 상수 ===");
        System.out.println("PI: " + Constants.PI);
        System.out.println("회사명: " + Constants.COMPANY_NAME);
        System.out.println("최대 사용자: " + Constants.MAX_USERS);

        System.out.println("\n=== final 변수 ===");
        Constants constants = new Constants("001");
        // constants.id = "002";  // 컴파일 에러: final 변수는 수정 불가

        System.out.println("\n=== final 메서드 ===");
        Parent parent = new Parent("부모");
        parent.cannotOverride();
        parent.canOverride();

        System.out.println();
        Child child = new Child("자식");
        child.cannotOverride();  // final 메서드는 오버라이드 안 됨
        child.canOverride();  // 오버라이드된 메서드
    }
}
