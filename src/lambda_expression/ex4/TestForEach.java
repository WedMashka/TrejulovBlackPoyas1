package lambda_expression.ex4;

import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        List<String> strList = List.of("one", "two", "three", "four", "five");
        System.out.println(strList);
        strList.forEach(str-> System.out.println(str));
    }
}
