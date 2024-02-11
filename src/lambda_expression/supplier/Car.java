package lambda_expression.supplier;

public class Car {
    String brand;
    int number;
    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car" + number + "{" +
                "brand='" + brand +
                '}';
    }
}
