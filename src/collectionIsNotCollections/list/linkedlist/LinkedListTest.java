package collectionIsNotCollections.list.linkedlist;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> llStr = new LinkedList<>();
        for (int i = 0; i<10000000;i++){
            llStr.add(String.valueOf(i));
        }
        System.out.println(llStr);

        LocalTime start2 = LocalTime.now();
        System.out.println(start2);
        System.out.println(llStr.get(9900000));
        System.out.println(LocalTime.now());
        Duration time2 = Duration.between(start2, LocalTime.now());
        System.out.println(time2);

    }
}
