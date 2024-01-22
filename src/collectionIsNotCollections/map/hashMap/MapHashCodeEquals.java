package collectionIsNotCollections.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapHashCodeEquals {
    public static void main(String[] args) {
        Map<Student,Double> studentMap = new HashMap<>();
        Student din = new Student("Din", "Winchester", 2);
        Student sem = new Student("Semuel", "Winchester", 2);
        Student bob = new Student("Bobby", "Sinchler",4 );
        Student diablo = new Student("Croulee", "Demon", 5);
        studentMap.put(din,3.1);
        studentMap.put(sem,4.9);
        studentMap.put(bob,4.1);
        studentMap.put(diablo,5.0);
        System.out.println(studentMap);
        Student dinClone = new Student("Din", "Winchester", 2);
        boolean result = studentMap.containsKey(dinClone);
        System.out.println(result);
        System.out.println(din.hashCode());
        System.out.println(dinClone.hashCode());

        for (Map.Entry<Student,Double> entry: studentMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }


    }


}

