package lambda_expression.ex1;

public class Car {
    String brand;
    int age_of_manufacture;
    public Car(String brand, int age_of_manufacture){
        this.brand = brand;
        this.age_of_manufacture = age_of_manufacture;
        System.out.println("create car " + brand);
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", age_of_manufacture=" + age_of_manufacture +
                '}';
    }
}
