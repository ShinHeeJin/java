package strings;

// String 메서드 학습

public class Example51_StringMethods {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        System.out.println("=== 기본 메서드 ===");
        System.out.println("길이: " + str.length());
        System.out.println("첫 문자: " + str.charAt(0));
        System.out.println("마지막 문자: " + str.charAt(str.length()-1));

        System.out.println("\n=== 부분 문자열 ===");
        System.out.println("substring(0, 5): " + str.substring(0, 5));
        System.out.println("substring(7): " + str.substring(7));

        System.out.println("\n=== 대소문자 변환 ===");
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());

        System.out.println("\n=== 검색 ===");
        System.out.println("indexOf('a'): " + str.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));
        System.out.println("contains('Java'): " + str.contains("Java"));

        System.out.println("\n=== 비교 ===");
        System.out.println("equals(\"Hello, Java!\"): " + str.equals("Hello, Java!"));
        System.out.println("equalsIgnoreCase(\"hello, java!\"): " + str.equalsIgnoreCase("hello, java!"));

        System.out.println("\n=== 문자 교체 ===");
        System.out.println("replace('a', 'A'): " + str.replace('a', 'A'));
        System.out.println("replace(\"Java\", \"Python\"): " + str.replace("Java", "Python"));

        System.out.println("\n=== 공백 제거 ===");
        String spaces = "  Hello  ";
        System.out.println("원본: '" + spaces + "'");
        System.out.println("trim(): '" + spaces.trim() + "'");
    }
}
