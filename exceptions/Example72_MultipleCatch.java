package exceptions;

// 다중 catch 블록 학습

public class Example72_MultipleCatch {
    public static void main(String[] args) {
        System.out.println("=== 다중 catch ===");

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과");
        } catch (NullPointerException e) {
            System.out.println("null 참조");
        }

        System.out.println("\n=== 다양한 예외 처리 ===");
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("숫자 또는 산술 예외: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("기타 예외");
        }
    }
}
