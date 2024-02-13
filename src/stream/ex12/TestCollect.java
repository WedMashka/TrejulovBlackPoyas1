package stream.ex12;

import stream.ex11FlatMap.Car;
import stream.ex11FlatMap.Parking;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollect {
    public static void main(String[] args) {

        Car car1 = new Car("Lanos");
        Car car2 = new Car("Lanos");
        Car car3 = new Car("Lanos");
        Car car4 = new Car("Lanos");
        Car car5 = new Car("Audi");
        Car car6 = new Car("Bmw");
        Car car7 = new Car("Toyota");

        Parking park1 = new Parking(car1,car2,car3,car4,car5,car6,car7);

        List<Car> carList = park1.getCarlist();
        System.out.println(carList);


       Map<String,List<Car>> carMap = carList.stream().sorted((car, ob)->{
           return car.getBrand().length() - ob.getBrand().length();
       }).map((car)->{
           car.setBrand(car.getBrand().toUpperCase());
           return car;
       }).peek(el-> System.out.println(el)).collect(Collectors.groupingBy(el->el.getBrand()));

       for (Map.Entry<String,List<Car>> entry: carMap.entrySet()){
           System.out.println(entry.getKey() + " - " + entry.getValue().toString());
       }




        Parking park11 = new Parking(car1,car2,car3,car4,car5,car6,car7);

        List<Car> carList2 = park1.getCarlist();
        System.out.println(carList);

        Map<Boolean,List<Car>> cerMap2 = carList2.stream().collect(Collectors.partitioningBy(el->el.getBrand().length()>4));

        for (Map.Entry<Boolean,List<Car>> entry: cerMap2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
