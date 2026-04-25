package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator 학습
// 정렬 순서 정의

class Student implements Comparable<Student> {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return this.score - other.score;  // 점수 오름차순
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class Example46_Comparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kim", 85));
        students.add(new Student("Lee", 92));
        students.add(new Student("Park", 78));

        System.out.println("=== Comparable (compareTo) ===");
        Collections.sort(students);
        System.out.println("점수순: " + students);

        System.out.println("\n=== Comparator (내림차순) ===");
        Collections.sort(students, (s1, s2) -> s2.score - s1.score);
        System.out.println("점수 내림차순: " + students);

        System.out.println("\n=== Comparator (이름순) ===");
        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("이름순: " + students);
    }
}
