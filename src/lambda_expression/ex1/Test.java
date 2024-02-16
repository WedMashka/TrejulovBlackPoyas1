package lambda_expression.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
        Collections.sort(listCar);
        System.out.println(listCar);
        Test t = new Test();
        t.printOverDate(listCar,2006);
        t.printUnderDate(listCar,2006);
        t.universalSelectMethod(listCar, new CarSelection() {
            @Override
            public boolean select(Car car) {
                return car.age_of_manufacture>2005 & car.age_of_manufacture<2008;
            }
        });

        System.out.println("with lambda");

        t.universalSelectMethod(listCar,(Car car)->{return car.age_of_manufacture>2005 & car.age_of_manufacture<2008;});

    }

    void printOverDate(List<Car> list, int date ){
        for (Car car:list){
            if(car.age_of_manufacture> date){
                System.out.print(car + " \\ ");
            }
        }
        System.out.println();
    }
    void printUnderDate(List<Car> list, int date ){
        for (Car car:list){
            if(car.age_of_manufacture< date){
                System.out.print(car + " \\");
            }
        }
        System.out.println();
    }

    void universalSelectMethod(List<Car> listCar, CarSelection cs){
        for (Car car: listCar){
            if(cs.select(car)){
                System.out.print(car);
            }
        }
        System.out.println();
    }


}

interface CarSelection{
    public boolean select(Car car);
}