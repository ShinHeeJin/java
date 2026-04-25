package oop;

// static 키워드 학습
// 클래스 변수와 클래스 메서드

class Counter {
    // static 변수: 모든 인스턴스가 공유
    static int totalCount = 0;

    // 인스턴스 변수
    int id;
    String name;

    // static 변수: 모든 인스턴스가 공유
    static double interest = 0.03;

    public Counter(String name) {
        this.name = name;
        this.id = ++totalCount;  // static 변수 사용
    }

    public void display() {
        System.out.println("ID: " + id + ", 이름: " + name);
    }

    // static 메서드: 인스턴스 변수 접근 불가
    static void printTotalCount() {
        System.out.println("총 생성된 객체: " + totalCount);
    }

    static void setInterest(double rate) {
        interest = rate;
    }

    static double getInterest() {
        return interest;
    }
}

class BankAccount2 {
    // static 변수
    static int accountCount = 0;
    static final String BANK_NAME = "은행";

    // 인스턴스 변수
    private String accountNumber;
    private double balance;

    public BankAccount2(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        accountCount++;  // static 변수 증가
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    // static 메서드
    static int getAccountCount() {
        return accountCount;
    }

    static String getBankName() {
        return BANK_NAME;
    }

    public void printInfo() {
        System.out.println("계좌번호: " + accountNumber + ", 잔액: " + balance);
    }
}

public class Example20_StaticKeyword {
    public static void main(String[] args) {
        System.out.println("=== static 변수 ===");
        Counter cnt1 = new Counter("첫 번째");
        cnt1.display();
        Counter.printTotalCount();

        System.out.println();
        Counter cnt2 = new Counter("두 번째");
        cnt2.display();
        Counter.printTotalCount();

        System.out.println();
        Counter cnt3 = new Counter("세 번째");
        cnt3.display();
        Counter.printTotalCount();

        System.out.println("\n=== 모든 인스턴스가 static 변수 공유 ===");
        System.out.println("cnt1의 totalCount: " + Counter.totalCount);
        System.out.println("cnt2의 totalCount: " + Counter.totalCount);
        System.out.println("cnt3의 totalCount: " + Counter.totalCount);

        System.out.println("\n=== static 메서드 ===");
        Counter.setInterest(0.05);
        System.out.println("이자율: " + Counter.getInterest());

        System.out.println("\n=== BankAccount2 예제 ===");
        System.out.println("은행명: " + BankAccount2.getBankName());
        System.out.println("계좌 개수: " + BankAccount2.getAccountCount());

        BankAccount2 account1 = new BankAccount2("123-456", 10000);
        System.out.println("계좌 개수: " + BankAccount2.getAccountCount());

        BankAccount2 account2 = new BankAccount2("789-012", 20000);
        System.out.println("계좌 개수: " + BankAccount2.getAccountCount());

        BankAccount2 account3 = new BankAccount2("345-678", 30000);
        System.out.println("계좌 개수: " + BankAccount2.getAccountCount());

        System.out.println("\n=== static final (상수) ===");
        System.out.println("은행명: " + BankAccount2.BANK_NAME);
        // BankAccount2.BANK_NAME = "다른은행";  // 컴파일 에러
    }
}
