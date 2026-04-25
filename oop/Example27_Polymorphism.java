package oop;

// 다형성(Polymorphism) 학습
// 같은 메서드 호출이 다른 동작을 수행

abstract class PaymentMethod {
    abstract void pay(double amount);
    abstract void refund(double amount);
}

class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제합니다");
    }

    @Override
    void refund(double amount) {
        System.out.println("신용카드로 " + amount + "원 환불합니다");
    }
}

class DebitCard extends PaymentMethod {
    private String accountNumber;

    public DebitCard(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    void pay(double amount) {
        System.out.println("직불카드로 " + amount + "원 결제합니다");
    }

    @Override
    void refund(double amount) {
        System.out.println("직불카드로 " + amount + "원 환불합니다");
    }
}

class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    void pay(double amount) {
        System.out.println("PayPal로 " + amount + "원 결제합니다 (" + email + ")");
    }

    @Override
    void refund(double amount) {
        System.out.println("PayPal로 " + amount + "원 환불합니다");
    }
}

class Bitcoin extends PaymentMethod {
    private String walletAddress;

    public Bitcoin(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    void pay(double amount) {
        System.out.println("비트코인으로 " + amount + "원 결제합니다");
    }

    @Override
    void refund(double amount) {
        System.out.println("비트코인으로 " + amount + "원 환불합니다");
    }
}

public class Example27_Polymorphism {
    public static void main(String[] args) {
        System.out.println("=== 다형성 예제 ===");

        // 다양한 결제 방법 객체 생성
        PaymentMethod[] methods = {
            new CreditCard("1234-5678-9012-3456", "Kim Chulsu"),
            new DebitCard("123-456-789"),
            new PayPal("user@example.com"),
            new Bitcoin("1A1z7agoat2YLZW9Uoc96pts6pq5THdjJ")
        };

        double amount = 100000;

        System.out.println("=== 결제 처리 ===");
        for (PaymentMethod method : methods) {
            method.pay(amount);
        }

        System.out.println("\n=== 환불 처리 ===");
        for (PaymentMethod method : methods) {
            method.refund(amount);
        }

        System.out.println("\n=== 특정 메서드 호출 ===");
        PaymentMethod creditCard = new CreditCard("9876-5432-1098-7654", "Lee Younghee");
        creditCard.pay(50000);
        creditCard.refund(50000);
    }
}
