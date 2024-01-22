package collectionIsNotCollections.map.linkedhashMap;

import collectionIsNotCollections.map.hashMap.Student;

import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        Student din = new Student("Din", "Winchester", 2);
        Student sem = new Student("Semuel", "Winchester", 1);
        Student bob = new Student("Bobby", "Sinchler",4 );
        Student croulee = new Student("Croulee", "Demon", 7);
        Student cas = new Student("Castiel", "Angel", 5);
        Student abadon = new Student("Abadone", "Demon", 6);
        Student charlie = new Student("Charlie", "Snow", 8);
        LinkedHashMap<Double,Student> lhmStudents =
                new LinkedHashMap<>(16, (float) 0.75, true);
        lhmStudents.put(4.2,din);
        lhmStudents.put(3.2,sem);
        lhmStudents.put(4.0,croulee);
        lhmStudents.put(2.2,cas);
        System.out.println(lhmStudents);
        System.out.println(lhmStudents.get(3.2));
        System.out.println(lhmStudents);


    }
}
