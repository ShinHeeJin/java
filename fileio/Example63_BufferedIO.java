package fileio;

import java.io.*;

// 버퍼링된 I/O 학습

public class Example63_BufferedIO {
    public static void main(String[] args) {
        System.out.println("=== BufferedWriter/Reader ===");

        // 파일에 데이터 쓰기
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
            writer.write("First line\n");
            writer.write("Second line\n");
            writer.write("Third line");
            System.out.println("파일 작성 완료");
        } catch (IOException e) {
            System.out.println("쓰기 에러");
        }

        // 파일에서 데이터 읽기
        try (BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("읽은 내용: " + line);
            }
        } catch (IOException e) {
            System.out.println("읽기 에러");
        }
    }
}
