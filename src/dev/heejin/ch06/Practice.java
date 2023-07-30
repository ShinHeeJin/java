package dev.heejin.ch06;

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math;
    }

    public int getTotal() {
        return this.kor + this.eng + this.math;
    }

    public double getAverage() {
        double avg = this.getTotal() / 3.0;
        return Math.round(avg * 10) / 10.0;
    }
}

public class Practice {
    public static void main() {
        Student student = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = student.info();
        int total = student.getTotal();
        double avg = student.getAverage();

        System.out.println("total = " + total);
        System.out.println("avg = " + avg);
    }
}
