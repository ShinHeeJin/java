package dev.heejin.ch09;

import java.util.StringJoiner;

public class StringJoinerCheck {
    public static void main() {

        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        String[] arr = {"1", "2", "3"};

        for (String s : arr) {
            stringJoiner.add(s);
        }
        System.out.println("stringJoiner = " + stringJoiner.toString()); // stringJoiner = [1,2,3]

    }
}
