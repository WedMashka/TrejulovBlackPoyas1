package collectionIsNotCollections.set.treeSet;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>();
        num.add(2);
        num.add(5);
        num.add(8);
        num.add(9);
        num.add(0);
        System.out.println(num);
        num.remove(8);
        System.out.println(num);
        System.out.println(num.isEmpty());
        System.out.println(num.contains(8));


        Car vaz = new Car(1988,"VAZ");
        Car zaz = new Car(1978,"ZAZ");
        Car toyota = new Car(1968,"Toyota");
        Car uaz = new Car(1987,"UAZ");
        Car audi = new Car(1999,"Audi");
        Car tesla = new Car(2002,"Tesla");

        TreeSet<Car> setCar = new TreeSet<>();
        setCar.add(vaz);
        setCar.add(zaz);
        setCar.add(toyota);
        setCar.add(uaz);
        setCar.add(audi);
        setCar.add(tesla);

        System.out.println(setCar);
        Car toyota2 = new Car(1968,"Toyota");
        System.out.println("all before " +setCar.headSet(new Car(1988,"ZAZ")));
        System.out.println("all after " +setCar.tailSet(new Car(1978,"ZAZ")));
        System.out.println("all between " +setCar.subSet(new Car(1978,"ZAZ"),new Car(1999,"Audi")));


        System.out.println(toyota.equals(toyota2));
        System.out.println(toyota.compareTo(toyota2));
        System.out.println(toyota.hashCode() == toyota2.hashCode());



    }
}

class Car implements Comparable<Car>{
    int age;
    String brand;
    public Car(int age, String brand) {
        this.age = age;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, brand);
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(this.age - o.age ==0){
            return this.brand.compareTo(o.brand);
        }
        return this.age - o.age;
    }
}
