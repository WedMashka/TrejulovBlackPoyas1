package lambda_expression.ex1;

import java.util.Objects;

public class Car implements Comparable<Car> {
    String brand;
    int age_of_manufacture;

    public Car(String brand, int age_of_manufacture){
        this.brand = brand;
        this.age_of_manufacture = age_of_manufacture;
        System.out.println("create car " + brand);
    }

    @Override
    public String toString() {
        return "{" + brand + " : " + age_of_manufacture + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age_of_manufacture == car.age_of_manufacture && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, age_of_manufacture);
    }

    @Override
    public int compareTo(Car car) {
        if(this.age_of_manufacture == car.age_of_manufacture){
            return this.brand.compareTo(car.brand);
        }else {
            return this.age_of_manufacture - car.age_of_manufacture;
        }
    }
}
