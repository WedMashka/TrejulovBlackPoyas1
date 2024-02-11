package lambda_expression.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Test {
    public static void main(String[] args) {

        Car vas = new Car("vas", 2009);
        Car uaz = new Car("uaz", 2002);
        Car audi = new Car("a6", 2011);
        Car ford = new Car("focus", 2009);
        Car ford1 = new Car("focus", 2002);
        Car bmw = new Car("x5", 2009);
        Car toyota = new Car("raw4", 2009);
        Car nisan = new Car("sun", 2000);
        Car zaz = new Car("lanos", 2006);
        Car ford2 = new Car("raptor", 2009);
        Car ford3 = new Car("scorpion", 2009);


        List<Car> listCar = new ArrayList<>();
        listCar.add(vas);
        listCar.add(uaz);
        listCar.add(audi);
        listCar.add(ford);
        listCar.add(ford1);
        listCar.add(bmw);
        listCar.add(toyota);
        listCar.add(nisan);
        listCar.add(zaz);
        listCar.add(ford2);
        listCar.add(ford3);
        System.out.println(listCar);
        carSelection.infoCar(listCar,(Car car)->{return car.age_of_manufacture> 2008;});
        listCar.removeIf((Car car)->{return car.age_of_manufacture>2010; });
        carSelection.infoCar(listCar,(Car car)->{return car.age_of_manufacture> 2008;});
        listCar.removeIf(car->car.age_of_manufacture<2006);
        System.out.println(listCar);


    }
}

class carSelection{

    static void infoCar(List<Car> carList, Predicate<Car> p){
        for (int i =0;i<carList.size(); i++){
            if(p.test(carList.get(i))){
                System.out.print(carList.get(i));
            }
        }
        System.out.println();
    }

}

