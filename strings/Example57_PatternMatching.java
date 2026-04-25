package strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

// 패턴 매칭 학습

public class Example57_PatternMatching {
    public static void main(String[] args) {
        System.out.println("=== 이메일 검증 ===");
        String email = "test@example.com";
        String emailRegex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]+$";
        System.out.println(email + " 유효?: " + email.matches(emailRegex));

        System.out.println("\n=== 숫자 찾기 ===");
        String text = "I have 2 apples and 3 oranges";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("찾은 숫자: " + matcher.group());
        }

        System.out.println("\n=== 전화번호 검증 ===");
        String phone = "010-1234-5678";
        String phoneRegex = "^\\d{3}-\\d{4}-\\d{4}$";
        System.out.println(phone + " 유효?: " + phone.matches(phoneRegex));
    }
}
