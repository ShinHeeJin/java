package strings;

// StringBuffer 학습
// StringBuilder와 유사하나 thread-safe

public class Example53_StringBuffer {
    public static void main(String[] args) {
        System.out.println("=== StringBuffer ===");
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("=== append ===");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());

        System.out.println("\n=== insert ===");
        sb.insert(5, ",");
        System.out.println(sb.toString());

        System.out.println("\n=== delete ===");
        sb.delete(5, 6);
        System.out.println(sb.toString());

        System.out.println("\n=== reverse ===");
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println(sb2.reverse().toString());
    }
}
