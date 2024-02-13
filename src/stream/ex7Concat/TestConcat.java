package stream.ex7Concat;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestConcat {
    public static void main(String[] args) {


        Stream<Integer> ne =Stream.of(1,3,5,7);
        Stream<Integer> e =Stream.of(2,4,6,8);

        Stream.concat(ne,e).forEach(el-> System.out.println(el));
    }
}
