package dev.heejin.ch07.Practices;

class Product{
    int price;
    int bonusPoint;

    Product(){}
    Product(int price){
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product{
    Tv() {super();}

    @Override
    public String toString() {
        return "TV" + "(" + this.price + ")";
    }
}

public class ProductCompileError {
    public void main() {
        Tv tv = new Tv();
        System.out.println("tv = " + tv);
    }
}
