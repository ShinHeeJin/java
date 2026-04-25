package basics;

// 변수 범위(Scope) 학습
// 변수가 유효한 범위

public class Example14_Scope {

    // 클래스 멤버 변수 (인스턴스 변수)
    public int instanceVar = 100;

    // 클래스 변수 (static 변수)
    public static int classVar = 200;

    public static void main(String[] args) {
        System.out.println("=== 전역 범위 (static) ===");
        System.out.println("classVar: " + classVar);

        System.out.println("\n=== 메서드 범위 (로컬 변수) ===");
        int localVar = 300;
        System.out.println("localVar: " + localVar);
        // 메서드가 끝나면 localVar는 메모리에서 해제됨

        System.out.println("\n=== 블록 범위 ===");
        {
            int blockVar = 400;
            System.out.println("blockVar: " + blockVar);
        }
        // blockVar는 여기서 접근 불가
        // System.out.println(blockVar);  // 컴파일 에러

        System.out.println("\n=== if 블록 내 범위 ===");
        if (localVar > 250) {
            int ifVar = 500;
            System.out.println("ifVar (if 내부): " + ifVar);
        }
        // ifVar는 여기서 접근 불가

        System.out.println("\n=== for 루프 범위 ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("i (for 내부): " + i);
        }
        // i는 여기서 접근 불가
        // System.out.println(i);  // 컴파일 에러

        System.out.println("\n=== 변수 우선순위 (Shadowing) ===");
        int var = 1000;
        System.out.println("외부 var: " + var);
        {
            int var2 = 2000;  // 다른 이름으로 변수 생성 (shadowing 방지)
            System.out.println("내부 var2: " + var2);
        }

        System.out.println("\n=== 메서드 호출과 범위 ===");
        testScope();

        System.out.println("\n=== 인스턴스 변수 접근 ===");
        Example14_Scope obj = new Example14_Scope();
        System.out.println("인스턴스 변수: " + obj.instanceVar);
    }

    public static void testScope() {
        int methodLocal = 600;
        System.out.println("testScope() 메서드 내 로컬 변수: " + methodLocal);
        System.out.println("testScope() 메서드 내 클래스 변수: " + classVar);
        // System.out.println(localVar);  // main의 localVar는 접근 불가
    }

    public void instanceMethod() {
        System.out.println("\n=== 인스턴스 메서드 내 범위 ===");
        System.out.println("인스턴스 변수: " + instanceVar);
        System.out.println("클래스 변수: " + classVar);

        int methodVar = 700;
        System.out.println("메서드 로컬 변수: " + methodVar);
    }
}
