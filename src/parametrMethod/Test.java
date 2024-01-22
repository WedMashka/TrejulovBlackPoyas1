package parametrMethod;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(8);
        ParMeth.getFirstEl(l);
        Integer i = ParMeth.getFirstEl(l);
        System.out.println(i);

        List<String> l2 = new ArrayList<>();
        l2.add(" is string 2");
        l2.add("3");
        l2.add("8");
        String s = ParMeth.getFirstEl(l2);
        System.out.println(s);


    }
}
