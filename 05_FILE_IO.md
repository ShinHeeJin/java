# 파일 I/O - 3개 예제

## Example 61: 파일 읽기

파일에서 데이터를 읽습니다.

### 코드
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example61_FileReading {
    public static void main(String[] args) {
        System.out.println("=== Files.readAllLines() ===");
        try {
            List<String> lines = Files.readAllLines(Paths.get("sample.txt"));
            System.out.println("파일 내용:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일이 없습니다");
        }

        System.out.println("\n=== BufferedReader ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("읽은 내용: " + line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다");
        }
    }
}
```

### 실행 결과
```
=== Files.readAllLines() ===
파일 내용:
First line
Second line
Third line

=== BufferedReader ===
읽은 내용: First line
읽은 내용: Second line
읽은 내용: Third line
```

---

## Example 62: 파일 쓰기

파일에 데이터를 씁니다.

### 코드
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example62_FileWriting {
    public static void main(String[] args) {
        System.out.println("=== Files.write() ===");
        try {
            Files.write(Paths.get("output.txt"),
                       "Hello, World!\nJava File I/O".getBytes());
            System.out.println("파일 작성 완료: output.txt");
        } catch (IOException e) {
            System.out.println("파일을 쓸 수 없습니다");
        }

        System.out.println("\n=== BufferedWriter ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"))) {
            writer.write("Line 1\n");
            writer.write("Line 2\n");
            writer.write("Line 3");
            System.out.println("파일 작성 완료: output2.txt");
        } catch (IOException e) {
            System.out.println("파일을 쓸 수 없습니다");
        }
    }
}
```

### 실행 결과
```
=== Files.write() ===
파일 작성 완료: output.txt

=== BufferedWriter ===
파일 작성 완료: output2.txt
```

---

## Example 63: 버퍼링된 I/O

성능을 향상시키는 버퍼링을 학습합니다.

### 주요 특징
- BufferedReader: 문자 입력 버퍼링
- BufferedWriter: 문자 출력 버퍼링
- 자동 flush 또는 close 시 플러시

