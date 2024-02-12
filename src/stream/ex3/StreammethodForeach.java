package stream.ex3;

import java.util.ArrayList;
import java.util.Random;

public class StreammethodForeach {


    public static void main(String[] args) {

        ArrayList<Integer> listInt =new ArrayList<>();

        listInt.add((int) (Math.random()*10));
        listInt.add((int) (Math.random()*10));
        listInt.add((int) (Math.random()*10));
        listInt.add((int) (Math.random()*10));
        listInt.add((int) (Math.random()*10));

        System.out.println(listInt);

        listInt.stream().forEach((el)->{
            el =el*el;
            System.out.println(el);
        });
        System.out.println(listInt);

        listInt.stream().forEach(Abc::ab);
        System.out.println(listInt);



    }
}

class Abc{
    static void ab(int i){
        i *=i;
        System.out.println(i);
    }
}
