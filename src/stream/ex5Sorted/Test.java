package stream.ex5Sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arInt = {(int)(Math.random()*20)+10,(int)(Math.random()*20)+10,(int)(Math.random()*20)+10,(int)(Math.random()*20)+10,(int)(Math.random()*20)+10,(int)(Math.random()*20)+10,
                (int)(Math.random()*20)+10,(int)(Math.random()*20)+10,(int)(Math.random()*20)+10};

        System.out.println(Arrays.toString(arInt));

        arInt = Arrays.stream(arInt).sorted().toArray();
        System.out.println(Arrays.toString(arInt));

        Flovers rose = new Flovers("rose",15);
        Flovers dandelion = new Flovers("dandelion", 80);
        Flovers chamomile = new Flovers("chamomile", 53);
        Flovers chrysanthemum  = new Flovers("chrysanthemum", 4);

        List<Flovers> listFlovers = new ArrayList<>();
        listFlovers.add(rose);
        listFlovers.add(chamomile);
        listFlovers.add(dandelion);
        listFlovers.add(chrysanthemum);

        System.out.println(listFlovers);

        listFlovers =(List<Flovers>) listFlovers.stream().sorted().toList();
        System.out.println(listFlovers);
// если нет доступа к класу чтобы имплементировать comparable то можно использовать comparator  в атрибуте сорт

        Flover2 rose2 = new Flover2("rose",15);
        Flover2 dandelion2 = new Flover2("dandelion", 80);
        Flover2 chamomile2 = new Flover2("chamomile", 53);
        Flover2 chrysanthemum2  = new Flover2("chrysanthemum", 4);

        List<Flover2> listFlovers2 = new ArrayList<>();
        listFlovers2.add(rose2);
        listFlovers2.add(chamomile2);
        listFlovers2.add(dandelion2);
        listFlovers2.add(chrysanthemum2);
        System.out.println(listFlovers2);

        listFlovers2 = listFlovers2.stream().sorted((x,y)->{
            return x.value- y.value;
        }).toList();
        System.out.println(listFlovers2);



    }
}
