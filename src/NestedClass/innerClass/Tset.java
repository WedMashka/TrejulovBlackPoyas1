package NestedClass.innerClass;

public class Tset {
    public static void main(String[] args) {
        Car carInnnerClass = new Car("purple",(byte) 5,201);
        carInnnerClass.getstrEngine();
        System.out.println(carInnnerClass.toString());

        Car car2 = new Car("yelow",(byte) 3);
        Car.Engine eng = car2.new Engine(205);
        car2.setEngene(eng);
        System.out.println(car2.toString());
    }
}
