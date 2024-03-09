package interview.ex7Seriralization.in;

import java.io.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Chevrolet Lanos", LocalDate.of(2006,12,30));
        Car car2 = new Car("BMW X7", LocalDate.of(2022,1,8));
        Car car3 = new Car("Shelby", LocalDate.of(1967,2,4));
        Car car4 = new Car("Audi 80", LocalDate.of(1980,8,8));

        List<Car> listCar = new ArrayList<>();

        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);

        for (int i = 0; i < listCar.size(); i++) {
            System.out.println(listCar.get(i));
        }

        Collections.sort(listCar, (c1,c2)->{
            int val =0;
            if (c1.getDateManufacturer().isEqual(c2.getDateManufacturer())){
                val = 0;
            } else if (c1.getDateManufacturer().isAfter(c2.getDateManufacturer())) {
                val = 1;
            } else if (c1.getDateManufacturer().isBefore(c2.getDateManufacturer())) {
                val = -1;
            }
            return val;
        });


        String pathOut = "copyTestSerialization.bin";
        File fileOut = new File(pathOut);




        try(ObjectOutputStream writerData = new ObjectOutputStream(new FileOutputStream(fileOut))) {

            writerData.writeObject(listCar);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
