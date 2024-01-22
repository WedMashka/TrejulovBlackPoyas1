package comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Ivan");
        name.add("Mariya");
        name.add("Jonah");
        name.add("Marina");
        name.add("Pasha");
        name.add("Roman");
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);

        Car lanos =new Car(83, "Chevrolet", LocalDate.of(1998,1,1));
        Car vaz =new Car(76, "kalina",LocalDate.of(2013,1,1));
        Car bmw =new Car(153, "BMW 7series", LocalDate.of(2010,1,1));
        Car audi =new Car(120, "Audi", LocalDate.of(2000,1,1));
        List <Car> car = new ArrayList<>();
        car.add(lanos);
        car.add(vaz);
        car.add(bmw);
        car.add(audi);
        System.out.println(car);
        Collections.sort(car);
        System.out.println(car);
        Collections.sort(car,new BrandComporator());
        System.out.println(car);
        Collections.sort(car, new DateOfManucturer());

        LocalDate n = LocalDate.now();
        LocalDate l = LocalDate.of(2020,1,1);
        System.out.println(n.compareTo(l));







    }
}
