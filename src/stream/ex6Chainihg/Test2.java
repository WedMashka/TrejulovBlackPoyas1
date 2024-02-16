package stream.ex6Chainihg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {

        Person p1 = new Person("Jonah","mail",33);
        Person p2 = new Person("Mariya","women",35);
        Person p3 = new Person("Ivan","mail",4);
        Person p4 = new Person("Marina","women",27);
        Person p5 = new Person("Roman","mail",4);
        Person p6 = new Person("Pasha","mail",39);
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        listPerson.add(p6);
        System.out.println(listPerson);
        Predicate<Person> p = pe->pe.gender.equals("women");
        Function<Person,Person> f = (pe)->{
           pe.name = pe.name.toUpperCase();
            return pe;
        };
        Comparator<Person> co = (person,o)->{
            return person.age-o.age;
        };



        List<Person>listWomenSort = listPerson.stream().filter(p).map(f).sorted(co).toList();
        System.out.println(listWomenSort);




    }
}
