package dev.heejin.ch08;

import java.io.File;

public class MethodThrowException {
    public void main() {
        try {
            File file = createFile("./test.txt");
            System.out.println(file.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static File createFile(String fileName) throws Exception {

        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }

        File file = new File(fileName);
        file.createNewFile();
        return file;
    }
}
