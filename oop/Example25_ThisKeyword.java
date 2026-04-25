package oop;

// this 키워드 학습
// 현재 객체를 참조

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void increaseQuantity(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    public void displayInfo() {
        System.out.println("상품명: " + this.name);
        System.out.println("가격: " + this.price);
        System.out.println("수량: " + this.quantity);
    }

    public Product getThis() {
        return this;  // 현재 객체 반환
    }
}

class Builder {
    private String host;
    private int port;
    private String path;

    public Builder(String host) {
        this.host = host;
        this.port = 80;
        this.path = "/";
    }

    public Builder withPort(int port) {
        this.port = port;
        return this;  // 빌더 패턴 - this 반환
    }

    public Builder withPath(String path) {
        this.path = path;
        return this;  // 빌더 패턴 - this 반환
    }

    public String build() {
        return "http://" + this.host + ":" + this.port + this.path;
    }
}

public class Example25_ThisKeyword {
    public static void main(String[] args) {
        System.out.println("=== this로 인스턴스 변수 접근 ===");
        Product product1 = new Product("노트북", 1500000);
        product1.displayInfo();

        System.out.println("\n=== 오버로드된 생성자에서 this 사용 ===");
        Product product2 = new Product("마우스", 50000, 100);
        product2.displayInfo();

        System.out.println("\n=== this로 현재 객체 반환 ===");
        Product product3 = new Product("키보드", 80000);
        Product sameObject = product3.getThis();
        System.out.println("product3과 sameObject가 같은가? " + (product3 == sameObject));

        System.out.println("\n=== 빌더 패턴 (Builder Pattern) ===");
        String url1 = new Builder("www.example.com")
                        .withPort(8080)
                        .withPath("/api/users")
                        .build();
        System.out.println("URL1: " + url1);

        String url2 = new Builder("localhost")
                        .withPort(3000)
                        .build();
        System.out.println("URL2: " + url2);

        System.out.println("\n=== this를 이용한 메서드 연쇄 호출 ===");
        product1.setPrice(1200000);
        product1.increaseQuantity(50);
        product1.displayInfo();
    }
}
