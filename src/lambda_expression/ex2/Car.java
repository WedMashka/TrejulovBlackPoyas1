package lambda_expression.ex2;

import java.util.Objects;

public class Car {
    String brand;
    int age_of_manufacture;

    public Car(String brand, int age_of_manufacture){
        this.brand = brand;
        this.age_of_manufacture = age_of_manufacture;
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

}
