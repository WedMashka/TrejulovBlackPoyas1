package stream.ex2;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamFilterTest {
    static ArrayList<Flovers> createFlovers(Supplier<Flovers> supFlovers, Function<Flovers,Flovers> funFlovers, String[] names){
        ArrayList<Flovers> listFlovers = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            listFlovers.add(supFlovers.get());
            listFlovers.get(i).name = names[i];
            funFlovers.apply(listFlovers.get(i));
        }

        return listFlovers;
    };
    public static void main(String[] args) {

        String[] fl = {"dandelion", "rose", "chamomile", "buttercup"};

        ArrayList<Flovers> listFlovers = createFlovers(
                ()->{
                    return new Flovers("1",0);
                },
                (flo)->{
                    flo.value = flo.name.length();
                    return flo;
                },
                fl
        );

        System.out.println(listFlovers);

        ArrayList<Flovers> filteredFlovers = (ArrayList<Flovers>) listFlovers.stream().filter((fl1)->{return fl1.value>5;}).collect(Collectors.toList());
        System.out.println(filteredFlovers);

    }
}
