package strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

// 정규표현식 학습

public class Example56_RegularExpression {
    public static void main(String[] args) {
        System.out.println("=== 정규표현식 기본 ===");

        String email = "test@example.com";
        String emailRegex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+$";
        System.out.println(email + " 유효한가? " + email.matches(emailRegex));

        System.out.println("\n=== 패턴 매칭 ===");
        String text = "Hello 123 World 456";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            System.out.println("숫자 찾음: " + matcher.group());
        }

        System.out.println("\n=== 문자열 분할 ===");
        String csv = "apple,banana,cherry,date";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
