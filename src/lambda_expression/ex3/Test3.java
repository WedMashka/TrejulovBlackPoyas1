package lambda_expression.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < 11; i++){
            listInt.add(i*i);
        }

        System.out.println(listInt);
        listInt.removeIf(i->i>50);
        System.out.println(listInt);

        Predicate<Integer> pr = i->i<10;

        listInt.removeIf(pr);
        System.out.println(listInt);

    }



}
