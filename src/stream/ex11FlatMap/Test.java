package stream.ex11FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car("Lanos");
        Car car2 = new Car("Vaz");
        Car car3 = new Car("Uaz");
        Car car4 = new Car("Gaz");
        Car car5 = new Car("Audi");
        Car car6 = new Car("Bmw");
        Car car7 = new Car("Toyota");

        Parking park1 = new Parking(car1,car2,car3,car4);
        Parking park2 = new Parking(car5,car6,car7);
        System.out.println(park1.getCarlist());

        List<Parking> listParking = new ArrayList<>();
        listParking.add(park1);
        listParking.add(park2);

        listParking.stream().flatMap(
                parking-> {return parking.getCarlist().stream();})
                .forEach(el-> System.out.println(el.brand));


    }
}
