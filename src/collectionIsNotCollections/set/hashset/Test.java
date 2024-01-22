package collectionIsNotCollections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Jonah");
        name.add("Ivan");
        name.add("Mariya");
        name.add("Mariya");
        name.add("Mariya");
        name.add("Alex");
        System.out.println(name);
        name.remove("Mariya");
        System.out.println(name);

        HashSet<Integer> num = new HashSet<>();
        num.add(2);
        num.add(5);
        num.add(1);
        num.add(9);
        System.out.println("num " +num);
        HashSet<Integer> num1 = new HashSet<>();
        num1.add(2);
        num1.add(7);
        num1.add(1);
        num1.add(5);
        num1.add(8);
        num1.add(3);
        System.out.println("num1 " +num1);

        HashSet<Integer> union = new HashSet<>(num);
        union.addAll(num1);
        System.out.println("union " +union);
        HashSet<Integer> intersect = new HashSet<>(num);
        intersect.retainAll(num1);
        System.out.println("intersect " +intersect);
        HashSet<Integer> substract = new HashSet<>(num);
        substract.removeAll(num1);
        System.out.println("substract " +substract);





    }
}
