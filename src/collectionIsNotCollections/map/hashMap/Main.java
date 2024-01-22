package collectionIsNotCollections.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> person = new HashMap<>();
        person.put(33,"Jonah");
        person.put(29,"Pasha");
        person.put(27,"Marina");
        person.put(35,"Mariya");
        person.put(37,"Yra");
        person.put(null,"Kirill");
        person.put(3,null);
        System.out.println(person);
        System.out.println(person.get(29));
        person.putIfAbsent(35,"125454");
        System.out.println(person);
        System.out.println(person.containsValue("Jonah"));
        System.out.println(person.containsKey(22));
        System.out.println(person.keySet());
        System.out.println(person.values());




    }
}
