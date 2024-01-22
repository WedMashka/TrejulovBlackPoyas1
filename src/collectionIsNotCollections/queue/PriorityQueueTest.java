package collectionIsNotCollections.queue;

import collectionIsNotCollections.map.hashMap.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> abc = new PriorityQueue<>();
        abc.add(2);
        abc.add(5);
        abc.add(1);
        abc.add(0);
        abc.add(9);
        abc.add(22);
        abc.add(15);
        System.out.println(abc);
        abc.remove();
        System.out.println(abc);
        PriorityQueue<Student> studentPriorityQueue= new PriorityQueue<>();
        Student din = new Student("Din", "Winchester", 2);
        Student sem = new Student("Semuel", "Winchester", 2);
        Student bob = new Student("Bobby", "Sinchler",4 );
        Student diablo = new Student("Croulee", "Demon", 5);
        studentPriorityQueue.add(din);
        studentPriorityQueue.add(diablo);
        studentPriorityQueue.add(bob);
        studentPriorityQueue.add(sem);
        System.out.println(studentPriorityQueue);



    }
}
