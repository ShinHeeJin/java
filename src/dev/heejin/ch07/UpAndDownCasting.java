package dev.heejin.ch07;

public class UpAndDownCasting {

    class Car {
        String color;
        int door;
        void drive() {
            System.out.println("drive !!!");
        }
        void stop() {
            System.out.println("stop !!!");
        }
    }

    class FireEngine extends Car {
        void water() {
            System.out.println("water !!!");
        }
    }

    public void main() {
        Car car;
        FireEngine fireEngine = new FireEngine();
        fireEngine.water();

        car = fireEngine; // UpCasting, (Car) 생략 가능
        System.out.println("car = " + car);
        System.out.println("fireEngine = " + fireEngine);
        System.out.println("car == fireEngine -> " + (car == fireEngine));

//        car.water(); // compile error

        FireEngine fe2 = (FireEngine)car; // DownCasting, (FireEngine) 생략 불가능
        fe2.water();
    }
}
