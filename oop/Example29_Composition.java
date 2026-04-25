package oop;

// 구성(Composition) 학습
// "is-a" 관계 (상속) vs "has-a" 관계 (구성)

class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println(type + " 엔진이 시작되었습니다. 마력: " + horsepower);
    }

    public void stop() {
        System.out.println(type + " 엔진이 멈추었습니다");
    }
}

class Tire {
    private String brand;
    private int size;

    public Tire(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void rotate() {
        System.out.println(brand + " " + size + "인치 타이어가 회전합니다");
    }
}

class SportsCar {
    // 구성: SportsCar는 Engine과 Tire를 가지고 있다 (has-a)
    private Engine engine;
    private Tire[] tires;
    private String brand;

    public SportsCar(String brand) {
        this.brand = brand;
        this.engine = new Engine("터보 디젤", 500);
        this.tires = new Tire[4];
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire("미쉐린", 20);
        }
    }

    public void drive() {
        System.out.println(brand + " 스포츠카가 출발합니다");
        engine.start();
        for (Tire tire : tires) {
            tire.rotate();
        }
    }

    public void park() {
        System.out.println(brand + " 스포츠카가 주차합니다");
        engine.stop();
    }

    public void changeEngine(Engine newEngine) {
        engine = newEngine;
        System.out.println("엔진이 교체되었습니다");
    }
}

class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer(String cpuModel, int ramSize, int storageSize) {
        this.cpu = new CPU(cpuModel);
        this.ram = new RAM(ramSize);
        this.hardDrive = new HardDrive(storageSize);
    }

    public void powerOn() {
        System.out.println("컴퓨터를 켭니다");
        cpu.execute();
        ram.load();
        hardDrive.read();
    }

    public void powerOff() {
        System.out.println("컴퓨터를 끕니다");
    }
}

class CPU {
    private String model;

    public CPU(String model) {
        this.model = model;
    }

    public void execute() {
        System.out.println("CPU(" + model + ")가 명령을 실행합니다");
    }
}

class RAM {
    private int size;

    public RAM(int size) {
        this.size = size;
    }

    public void load() {
        System.out.println(size + "GB RAM이 데이터를 로드합니다");
    }
}

class HardDrive {
    private int storage;

    public HardDrive(int storage) {
        this.storage = storage;
    }

    public void read() {
        System.out.println(storage + "GB 하드드라이브에서 읽습니다");
    }
}

public class Example29_Composition {
    public static void main(String[] args) {
        System.out.println("=== 자동차 예제 (구성) ===");
        SportsCar car = new SportsCar("페라리");
        car.drive();
        System.out.println();
        car.park();

        System.out.println("\n=== 엔진 교체 ===");
        car.changeEngine(new Engine("하이브리드", 350));

        System.out.println("\n=== 컴퓨터 예제 (구성) ===");
        Computer computer = new Computer("Intel Core i9", 32, 1000);
        computer.powerOn();
        System.out.println();
        computer.powerOff();

        System.out.println("\n=== 구성의 장점 ===");
        System.out.println("- 더 유연한 구조");
        System.out.println("- 런타임에 동적으로 변경 가능");
        System.out.println("- 강한 결합도를 피함");
    }
}
