package collectionIsNotCollections.map.treeMap;

import collectionIsNotCollections.map.hashMap.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Double> studentMap = new TreeMap<>();
//        TreeMap<Student, Double> studentMap2 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Student din = new Student("Din", "Winchester", 2);
        Student sem = new Student("Semuel", "Winchester", 1);
        Student bob = new Student("Bobby", "Sinchler",4 );
        Student croulee = new Student("Croulee", "Demon", 7);
        Student cas = new Student("Castiel", "Angel", 5);
        Student abadon = new Student("Abadone", "Demon", 6);
        Student charlie = new Student("Charlie", "Snow", 8);
        studentMap.put(croulee,3.3);
        studentMap.put(din,2.5);
        studentMap.put(sem,4.2);
        studentMap.put(bob,3.1);
        studentMap.put(cas,1.2);
        studentMap.put(abadon,4.5);
        studentMap.put(charlie,5.5);
        System.out.println(studentMap);
        System.out.println(studentMap.descendingMap());
        System.out.println(studentMap);



    }
}
