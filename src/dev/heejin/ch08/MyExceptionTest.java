package dev.heejin.ch08;

class MyException extends Exception {

    private final int ERROR_CODE;

    public MyException(String message, int error_code) {
        super(message);
        ERROR_CODE = error_code;
    }

    public MyException(String message) {
        this(message, 100);
    }

    public int getErrorCode(){
        return ERROR_CODE;
    }
}


public class MyExceptionTest {
    public static void main() {
        try {
            throw new MyException("MyException!");
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getErrorCode()); // 100
            System.out.println(e.getMessage()); // MyException!
        }
    }
}
