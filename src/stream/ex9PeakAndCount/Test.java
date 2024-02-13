package stream.ex9PeakAndCount;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1,3,5,48,96,3,25,4);
        System.out.println(numbers.distinct().peek(System.out::println).count());

    }
}
