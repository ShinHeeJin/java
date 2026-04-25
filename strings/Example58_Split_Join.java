package strings;

import java.util.Arrays;

// split과 join 학습

public class Example58_Split_Join {
    public static void main(String[] args) {
        System.out.println("=== split ===");
        String csv = "apple,banana,cherry,date";
        String[] fruits = csv.split(",");
        System.out.println("분할 결과:");
        for (String fruit : fruits) {
            System.out.println("  " + fruit);
        }

        System.out.println("\n=== split (공백) ===");
        String text = "Hello    World    Java";
        String[] words = text.split("\\s+");
        System.out.println("단어: " + Arrays.toString(words));

        System.out.println("\n=== String.join ===");
        String[] items = {"apple", "banana", "cherry"};
        String joined = String.join(", ", items);
        System.out.println("연결: " + joined);

        System.out.println("\n=== String.join (배열) ===");
        String joined2 = String.join("-", "2024", "01", "25");
        System.out.println("날짜: " + joined2);
    }
}
