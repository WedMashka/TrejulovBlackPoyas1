package lambda_expression.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Test {
    static ArrayList<Car> createCar(Supplier<Car> supCar, int value){
        List<Car> listCar = new ArrayList<>();
        for (int i = 0; i<value;i++){
            listCar.add(supCar.get());
            listCar.get(i).number = i+1;
        }
        return (ArrayList<Car>) listCar;
    }

    public static void main(String[] args) {
        List<Car> listCar = createCar(()->{
            return new Car("Chevrolet");
        },6);
        System.out.println(listCar);
    }



}
