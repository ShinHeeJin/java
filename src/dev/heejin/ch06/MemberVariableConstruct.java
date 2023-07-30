package dev.heejin.ch06;

public class MemberVariableConstruct {

    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public MemberVariableConstruct(){
        System.out.println("MemberVariableConstruct() {}");
    }
    public static void main() {
        MemberVariableConstruct memberVariableConstruct = new MemberVariableConstruct();
        MemberVariableConstruct memberVariableConstruct1 = new MemberVariableConstruct();
    }
}
