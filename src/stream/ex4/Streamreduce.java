package stream.ex4;

import java.util.ArrayList;
import java.util.Optional;

public class Streamreduce {
    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            listInt.add((int) ((Math.random()*4)+1));
        }
        System.out.println(listInt);

        int i = listInt.stream().reduce((accumulator,element)->{
            return accumulator*element;
        }).get();
        System.out.println(i);

        int startValue = 10;//стартовое значение аккумулятора



        int i2 = listInt.stream().reduce(startValue,(accumulator,element)->{// если указанно стартовое значение акуумулятора то метод гет не требуется
            return accumulator*element;
        });
        System.out.println(i2);


    }
}
