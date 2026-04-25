package generics;

// 제네릭 클래스 학습

class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void show() {
        System.out.println("Item: " + item);
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void display() {
        System.out.println(key + " -> " + value);
    }
}

public class Example81_GenericClass {
    public static void main(String[] args) {
        System.out.println("=== 제네릭 클래스 사용 ===");

        Box<String> stringBox = new Box<>();
        stringBox.put("Hello");
        stringBox.show();

        Box<Integer> intBox = new Box<>();
        intBox.put(42);
        intBox.show();

        System.out.println("\n=== 두 개의 타입 ===");
        Pair<String, Integer> pair1 = new Pair<>("Kim", 85);
        pair1.display();

        Pair<String, String> pair2 = new Pair<>("Korea", "Seoul");
        pair2.display();
    }
}
