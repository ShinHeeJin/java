package oop;

// 캡슐화(Encapsulation) 학습
// 데이터 보호와 접근 제어

class BankAccount3 {
    private String accountNumber;
    private double balance;
    private String accountHolder;
    private static final double MINIMUM_BALANCE = 0;
    private static final double MAXIMUM_WITHDRAWAL = 1000000;

    public BankAccount3(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 잔액 조회 (읽기만 가능)
    public double getBalance() {
        return balance;
    }

    // 계좌 소유자 조회
    public String getAccountHolder() {
        return accountHolder;
    }

    // 입금
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금액은 양수여야 합니다");
        }
        balance += amount;
        System.out.println("입금 완료: " + amount + "원, 잔액: " + balance);
    }

    // 출금 (유효성 검사 포함)
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금액은 양수여야 합니다");
        }
        if (amount > MAXIMUM_WITHDRAWAL) {
            throw new IllegalArgumentException("일일 출금 한도(" + MAXIMUM_WITHDRAWAL + ")를 초과할 수 없습니다");
        }
        if (balance - amount < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("잔액이 부족합니다");
        }
        balance -= amount;
        System.out.println("출금 완료: " + amount + "원, 잔액: " + balance);
    }

    // 계좌 정보 (일부 정보만 공개)
    public String getAccountInfo() {
        return "계좌번호: " + accountNumber.substring(0, 3) + "-****-****-****\n" +
               "계좌소유자: " + accountHolder + "\n" +
               "잔액: " + balance + "원";
    }
}

class Rectangle2 {
    private double width;
    private double height;
    private static final double MIN_SIZE = 0;
    private static final double MAX_SIZE = 1000;

    public Rectangle2(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= MIN_SIZE || width > MAX_SIZE) {
            throw new IllegalArgumentException("너비는 0 초과 1000 이하여야 합니다");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= MIN_SIZE || height > MAX_SIZE) {
            throw new IllegalArgumentException("높이는 0 초과 1000 이하여야 합니다");
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Example30_Encapsulation {
    public static void main(String[] args) {
        System.out.println("=== 캡슐화된 계좌 ===");
        BankAccount3 account = new BankAccount3("1234-5678-9012", "김철수", 100000);

        System.out.println(account.getAccountInfo());

        System.out.println("\n=== 입금 ===");
        account.deposit(50000);

        System.out.println("\n=== 출금 ===");
        account.withdraw(30000);

        System.out.println("\n=== 캡슐화된 사각형 ===");
        Rectangle2 rect = new Rectangle2(10, 20);
        System.out.println("너비: " + rect.getWidth());
        System.out.println("높이: " + rect.getHeight());
        System.out.println("넓이: " + rect.getArea());

        System.out.println("\n=== 유효성 검사 ===");
        try {
            account.withdraw(150000);  // 잔액 부족
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }

        try {
            rect.setWidth(-5);  // 유효하지 않은 너비
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
        }

        System.out.println("\n=== 캡슐화의 장점 ===");
        System.out.println("- 데이터 보호: 유효하지 않은 상태 방지");
        System.out.println("- 유지보수 용이: 내부 구현 변경 가능");
        System.out.println("- 제어된 접근: 규칙에 따른 접근만 가능");
    }
}
