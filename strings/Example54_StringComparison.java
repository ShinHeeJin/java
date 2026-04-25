package strings;

// 문자열 비교 학습

public class Example54_StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("=== == 연산자 (참조 비교) ===");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        System.out.println("\n=== equals (값 비교) ===");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        System.out.println("\n=== equalsIgnoreCase ===");
        System.out.println("str1.equalsIgnoreCase(\"hello\"): " + 
                          str1.equalsIgnoreCase("hello"));

        System.out.println("\n=== compareTo ===");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("\"Apple\".compareTo(\"Banana\"): " + 
                          "Apple".compareTo("Banana"));
    }
}
