package basics;

// 문자열 기초 학습
// String의 주요 메서드들

public class Example13_StringBasics {
    public static void main(String[] args) {
        System.out.println("=== 문자열 생성 ===");
        String str1 = "Hello, Java!";
        String str2 = new String("Hello, Java!");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("\n=== 문자열 길이 ===");
        System.out.println("길이: " + str1.length());

        System.out.println("\n=== 문자열 접근 ===");
        System.out.println("첫 문자: " + str1.charAt(0));
        System.out.println("마지막 문자: " + str1.charAt(str1.length() - 1));

        System.out.println("\n=== 부분 문자열 ===");
        System.out.println("substring(0, 5): " + str1.substring(0, 5));
        System.out.println("substring(7): " + str1.substring(7));

        System.out.println("\n=== 문자열 검색 ===");
        System.out.println("'Java' 위치: " + str1.indexOf("Java"));
        System.out.println("'a' 마지막 위치: " + str1.lastIndexOf("a"));
        System.out.println("'Python' 포함: " + str1.contains("Python"));

        System.out.println("\n=== 문자열 대소문자 변환 ===");
        System.out.println("대문자: " + str1.toUpperCase());
        System.out.println("소문자: " + str1.toLowerCase());

        System.out.println("\n=== 문자열 비교 ===");
        String str3 = "Hello, Java!";
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(\"HELLO, JAVA!\"): " +
                         str1.equalsIgnoreCase("HELLO, JAVA!"));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));

        System.out.println("\n=== 공백 제거 ===");
        String spaces = "  Hello  ";
        System.out.println("원본: '" + spaces + "'");
        System.out.println("trim: '" + spaces.trim() + "'");

        System.out.println("\n=== 문자 교체 ===");
        System.out.println("replace('a', 'A'): " + str1.replace('a', 'A'));
        System.out.println("replace(\"Java\", \"Python\"): " +
                         str1.replace("Java", "Python"));

        System.out.println("\n=== 문자열 분할 ===");
        String csv = "apple,banana,cherry,date";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== 문자열 연결 ===");
        String result = "Hello" + " " + "World";
        System.out.println(result);

        System.out.println("\n=== 빈 문자열 확인 ===");
        String empty = "";
        String notEmpty = "text";
        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("notEmpty.isEmpty(): " + notEmpty.isEmpty());

        System.out.println("\n=== 문자열 시작/끝 확인 ===");
        System.out.println("startsWith(\"Hello\"): " + str1.startsWith("Hello"));
        System.out.println("endsWith(\"!\"): " + str1.endsWith("!"));
    }
}
