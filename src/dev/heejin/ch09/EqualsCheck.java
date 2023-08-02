package dev.heejin.ch09;

class Person {
    int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return this.id == ((Person) obj).id;
        }
        return false;
    }
}

public class EqualsCheck {
    public static void main() {

        Person person = new Person(10000);
        Person person1 = new Person(10000);
        System.out.println(person.equals(person1));

    }
}
