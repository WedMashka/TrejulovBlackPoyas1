package stream.ex18ParallelStream;

import java.util.ArrayList;
import java.util.List;

public class TestParallelStrim {
    public static void main(String[] args) {
        List<Double> listInt = new ArrayList<>();
        for (int i =  30; i > 5; i-=5) {
            listInt.add((double) i);
        }

        System.out.println(listInt.get(2));
//неправильно  работает с делением
        Double res = listInt.parallelStream().reduce((a,e)->{return a+e;}).get();
        System.out.println(res);



    }
}
