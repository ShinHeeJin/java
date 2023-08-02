package dev.heejin.ch08;

public class PracticeException {

    public static void method(boolean input){
        try {
            if (input) {
                throw new ArithmeticException();
            }
        } catch (RuntimeException runtimeException) {
            System.out.println(1);
            return;
        } catch (Exception exception) {
            System.out.println(2);
            return;
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    }


    public static void main() {
        method(true); // 1, 3
        System.out.println();
        method(false); // 3, 4
    }

}
