package dev.heejin.ch02;

public class TypeConvert {

    public static void main(){
        String str = "39";

        System.out.println(str.charAt(1));
        System.out.println('3' - '0' + 4); // 문자 - 문자 -> 숫자
        System.out.println(Integer.parseInt("3"));
        System.out.println(Double.parseDouble("3.14"));
        System.out.println('3' + ""); // 문자 + empty string -> string
    }
}
