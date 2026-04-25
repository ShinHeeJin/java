package strings;

// trim과 strip 학습

public class Example59_Trim_Strip {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        System.out.println("=== trim ===");
        System.out.println("원본: '" + str + "'");
        System.out.println("trim: '" + str.trim() + "'");

        System.out.println("\n=== strip (Java 11+) ===");
        String str2 = "\n\tHello\n\t";
        System.out.println("원본: '" + str2 + "'");
        System.out.println("strip: '" + str2.strip() + "'");

        System.out.println("\n=== 차이점 ===");
        String mixedSpaces = "   Hello   ";  // non-breaking space
        System.out.println("trim: '" + mixedSpaces.trim() + "'");
        System.out.println("strip: '" + mixedSpaces.strip() + "'");
    }
}
