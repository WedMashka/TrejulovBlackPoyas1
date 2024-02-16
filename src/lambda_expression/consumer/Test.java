package lambda_expression.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    private static ArrayList<Car> createCarList(Supplier<Car> supCar, int value){
        ArrayList<Car> carList= new ArrayList<>();
        for (int i = 0; i < value; i++) {
            carList.add(supCar.get());
            carList.get(i).setNumber(i+1);
        }
        return carList;
    }

    private  static void changeCar (Consumer<Car>  consumerCar, ArrayList<Car> listCar){
        for (int i = 0; i < listCar.size(); i++) {
            consumerCar.accept(listCar.get(i));
            i++;
        }
    }

    public static void main(String[] args) {
        String color = "Cherry";
        String color2 = "Ultramarine";
        String brand = "Chevrolet";
        Supplier<Car> supplierCar = ()->{return new Car(brand,color);};
        ArrayList<Car> carList = createCarList(supplierCar,9);
        System.out.println(carList);
        Consumer<Car> consumerCar = (car)->{car.setColor(color2);};
        changeCar(consumerCar,carList);
        System.out.println(carList);


//        ArrayList<Car> carList = createCarList(()->{
//            return new Car("Chevrolet","cherry");
//        },9);
    }

}
