package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

// 파일 쓰기 학습

public class Example62_FileWriting {
    public static void main(String[] args) {
        System.out.println("=== 파일 쓰기 ===");

        System.out.println("\n=== Files.write() ===");
        try {
            Files.write(Paths.get("output.txt"),
                       "Hello, World!\nJava File I/O".getBytes());
            System.out.println("파일 작성 완료: output.txt");
        } catch (IOException e) {
            System.out.println("파일을 쓸 수 없습니다");
        }

        System.out.println("\n=== BufferedWriter ===");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));
            writer.write("Line 1\n");
            writer.write("Line 2\n");
            writer.write("Line 3");
            writer.close();
            System.out.println("파일 작성 완료: output2.txt");
        } catch (IOException e) {
            System.out.println("파일을 쓸 수 없습니다");
        }
    }
}
