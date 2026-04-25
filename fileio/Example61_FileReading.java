package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// 파일 읽기 학습

public class Example61_FileReading {
    public static void main(String[] args) {
        System.out.println("=== 파일 읽기 예제 ===");

        System.out.println("\n=== Files.readAllLines() ===");
        try {
            // 파일이 없으면 에러가 발생하므로, 생성 로직은 생략
            System.out.println("파일 읽기: Files.readAllLines()");
            List<String> lines = Files.readAllLines(Paths.get("sample.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일이 없거나 읽을 수 없습니다");
        }

        System.out.println("\n=== BufferedReader ===");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다");
        }

        System.out.println("\n파일 읽기 예제 완료");
    }
}
