package exceptions;

// 사용자 정의 예외 학습

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    private double shortage;

    public InsufficientFundsException(String message, double shortage) {
        super(message);
        this.shortage = shortage;
    }

    public double getShortage() {
        return shortage;
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("잔액 부족", amount - balance);
        }
        balance -= amount;
        System.out.println("출금 완료: " + amount);
    }
}

public class Example76_CustomException {
    public static void main(String[] args) {
        System.out.println("=== 사용자 정의 예외 ===");

        Account account = new Account(10000);
        
        try {
            account.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println("에러: " + e.getMessage());
            System.out.println("부족액: " + e.getShortage());
        }
    }
}
