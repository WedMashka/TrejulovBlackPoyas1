package collectionIsNotCollections.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SubListTest {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println(l);
        List<String> subL = l.subList(2,4);
        System.out.println(l);
        System.out.println(subL);
        subL.add("25");
        System.out.println(l);
        System.out.println(subL);
        l.add("625");
     //   System.out.println(l); НЕ СРАБОТАЕТ




    }
}
