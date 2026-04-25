package generics;

// 제한된 타입 파라미터 학습

class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

    public void display() {
        System.out.println("값: " + value);
    }
}

public class Example83_BoundedTypeParameter {
    public static <T extends Number> double getDoubleValue(T value) {
        return value.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("=== 제한된 타입 파라미터 ===");

        NumberBox<Integer> intBox = new NumberBox<>(42);
        intBox.display();
        System.out.println("double 값: " + intBox.doubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>(3.14);
        doubleBox.display();

        System.out.println("\n=== 메서드의 타입 제한 ===");
        System.out.println("Integer: " + getDoubleValue(100));
        System.out.println("Double: " + getDoubleValue(3.14));
        System.out.println("Long: " + getDoubleValue(1000L));
    }
}
