package comparable;

import java.time.LocalDate;
import java.util.Comparator;

public class Car
        implements Comparable<Car>
{
    int power;
    String brand;

    LocalDate dateOfManufacturer;

    public Car(int power, String brand, LocalDate dateOfManufacturer) {
        this.power = power;
        this.brand = brand;
        this.dateOfManufacturer = dateOfManufacturer;
    }



//
//    @Override
//    public int compareTo(Car someCar) {
//        if(this.power == someCar.power){
//            return 0;
//        } else if (this.power > someCar.power) {
//            return 1;
//        }else {
//            return -1;
//        }
//    }
    @Override
    public int compareTo(Car someCar) {
       return this.power-someCar.power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", brand='" + brand + '\'' +
                ", dateOfManufacturer=" + dateOfManufacturer +
                '}';
    }
}

 class BrandComporator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return car1.brand.compareTo(car2.brand);
    }
}

class DateOfManucturer implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        if(car1.dateOfManufacturer.isBefore(car2.dateOfManufacturer)){
            return -1;
        } else if (car1.dateOfManufacturer.isAfter(car2.dateOfManufacturer)) {
            return 1;
        } else  {
            return 0;
        }
    }
}




