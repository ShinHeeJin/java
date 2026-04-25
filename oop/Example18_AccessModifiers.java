package oop;

// 접근 제어자 학습
// public, private, protected, default

class BankAccount {
    // private: 같은 클래스 내에서만 접근
    private String accountNumber;
    private double balance;

    // protected: 같은 패키지 또는 상속받은 클래스에서 접근
    protected String accountHolder;

    // default (접근제어자 없음): 같은 패키지 내에서만 접근
    String accountType;

    // public: 어디서나 접근
    public String bank;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountType = "통상 계좌";
        this.bank = "국민은행";
    }

    // public 메서드: 외부에서 접근 가능
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 입금되었습니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " 출금되었습니다.");
        } else {
            System.out.println("출금 불가능합니다.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // private 메서드: 같은 클래스 내에서만 사용
    private void logTransaction(String description) {
        System.out.println("[거래 기록] " + description);
    }

    public void printStatement() {
        logTransaction("계좌 조회");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance);
    }
}

public class Example18_AccessModifiers {
    public static void main(String[] args) {
        System.out.println("=== 접근 제어자 테스트 ===");
        BankAccount account = new BankAccount("123-456-789", 10000, "김철수");

        System.out.println("public 접근:");
        System.out.println("은행: " + account.bank);

        System.out.println("\ndefault 접근 (같은 패키지):");
        System.out.println("계좌 타입: " + account.accountType);

        System.out.println("\nprotected 접근 (같은 패키지):");
        System.out.println("계좌 소유자: " + account.accountHolder);

        System.out.println("\npublic 메서드 사용:");
        account.deposit(5000);
        account.withdraw(3000);
        account.printStatement();

        System.out.println("\npublic getter 사용:");
        System.out.println("현재 잔액: " + account.getBalance());
        System.out.println("계좌번호: " + account.getAccountNumber());

        // private 접근 불가
        // System.out.println(account.accountNumber);  // 컴파일 에러
        // account.logTransaction("테스트");  // 컴파일 에러
    }
}
