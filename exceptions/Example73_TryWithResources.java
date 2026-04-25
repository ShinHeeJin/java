package exceptions;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

// try-with-resources 학습
// AutoCloseable 리소스 자동 관리

public class Example73_TryWithResources {
    public static void main(String[] args) {
        System.out.println("=== try-with-resources ===");

        String data = "Line 1\nLine 2\nLine 3";
        
        try (BufferedReader reader = new BufferedReader(new StringReader(data))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("에러: " + e.getMessage());
        }
        // reader는 자동으로 close됨

        System.out.println("\n자동 리소스 정리 완료");
    }
}
