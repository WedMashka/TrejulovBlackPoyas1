package stream.ex8Distinct;

import java.util.stream.Stream;

public class TestDistinct {
    public static void main(String[] args) {

        Stream<Integer> en = Stream.of(2,4,6,8,4,8,12,6,4,6,46);
        en.distinct().forEach(System.out::println);

    }
}
