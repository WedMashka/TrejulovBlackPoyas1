package collectionIsNotCollections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>(99);
        listInt.add(2);
        listInt.add(4);
        listInt.add(15);
        System.out.println("capacity of listInt = "+ 99 + " size is " + listInt.size());
        listInt.add(1,99954);
        System.out.println(listInt);
        System.out.println(listInt.get(1));
        listInt.set(1,77777);
        System.out.println(listInt);
        System.out.println(listInt.get(1));
        listInt.remove(0);
        System.out.println(listInt);
        System.out.println(listInt.get(1));
        List<Integer> listInt2 = new ArrayList<>();
        listInt2.add(442);
        listInt2.add(24);
        listInt2.add(115);
        System.out.println("listInt " + listInt);
        System.out.println("listInt2 " +listInt2);
        listInt2.addAll(2,listInt);
        System.out.println("listInt2 " +listInt2);




    }
}

