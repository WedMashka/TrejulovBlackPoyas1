package interview.ex7Seriralization.in;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Car implements Serializable {
    private String brand;
    private LocalDate dateManufacturer;

    public Car(String brand, LocalDate dateManufacturer) {
        this.brand = brand;
        this.dateManufacturer = dateManufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getDateManufacturer() {
        return dateManufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(dateManufacturer, car.dateManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, dateManufacturer);
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", dateManufacturer=" + dateManufacturer +
                '}';
    }


}
