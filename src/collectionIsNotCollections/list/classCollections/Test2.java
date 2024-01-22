package collectionIsNotCollections.list.classCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Emploee jonah = new Emploee(1, "Jonah",50000);
        Emploee mary = new Emploee(2, "Mary",3000);
        Emploee ivan = new Emploee(5, "Ivan",2000);
        Emploee pasha = new Emploee(3, "Pasha",55000);
        Emploee marina = new Emploee(4, "Marina",33000);
        Emploee roma = new Emploee(6, "Roman",2000);
        List<Emploee> listEmploee = new ArrayList<>();
        listEmploee.add(jonah);
        listEmploee.add(mary);
        listEmploee.add(ivan);
        listEmploee.add(pasha);
        listEmploee.add(marina);
        listEmploee.add(roma);
        System.out.println(listEmploee);
        Collections.sort(listEmploee);
        System.out.println(listEmploee);
        int i = Collections.binarySearch(listEmploee, new Emploee(1, "Jonah",50000));
        System.out.println(i);



    }
}

class Emploee implements Comparable<Emploee>{
    int id;
    String name;
    int salary;

    public Emploee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emploee o) {
        int result = this.id - o.id;
        return  result;
    }
}

