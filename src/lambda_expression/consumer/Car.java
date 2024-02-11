package lambda_expression.consumer;

public class Car {
    private String brand;
    private int number;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car"+number+" {" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }
}
