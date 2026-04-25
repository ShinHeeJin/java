package strings;

// Character 클래스 학습

public class Example60_CharacterClass {
    public static void main(String[] args) {
        System.out.println("=== 문자 확인 ===");
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Character.isLetter('a'): " + Character.isLetter('a'));
        System.out.println("Character.isUpperCase('A'): " + Character.isUpperCase('A'));
        System.out.println("Character.isLowerCase('a'): " + Character.isLowerCase('a'));
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' '));

        System.out.println("\n=== 문자 변환 ===");
        System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A'): " + Character.toLowerCase('A'));

        System.out.println("\n=== 숫자 변환 ===");
        System.out.println("Character.getNumericValue('5'): " + Character.getNumericValue('5'));
        System.out.println("Character.digit('F', 16): " + Character.digit('F', 16));
    }
}
