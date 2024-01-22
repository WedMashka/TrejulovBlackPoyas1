package NestedClass.staticClass;

public class Tset {
    public static void main(String[] args) {
        Car.Engine eng = new Car.Engine(83);
        Car chevrolet = new Car("cherry", (byte) 4,eng);
        System.out.println(chevrolet.toString());
        eng.getstrCar();
        chevrolet.getstrEngine();
    }
}
