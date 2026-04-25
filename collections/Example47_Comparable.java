package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparable 인터페이스 학습

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Example47_Comparable {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Kim", 25));
        people.add(new Person("Lee", 30));
        people.add(new Person("Park", 20));

        System.out.println("=== 정렬 전 ===");
        System.out.println(people);

        System.out.println("\n=== 정렬 후 (나이순) ===");
        Collections.sort(people);
        System.out.println(people);
    }
}
