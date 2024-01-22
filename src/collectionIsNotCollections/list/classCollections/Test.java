package collectionIsNotCollections.list.classCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arL = new ArrayList<>();
        for (int i =0; i<40;i++){
            arL.add(i*i);
        }

        int k = Collections.binarySearch(arL,625); // Работает только с отсортированным массивом.
        System.out.println(k);
    }
}
