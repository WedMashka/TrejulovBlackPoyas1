package InteratorTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> abc = new ArrayList<>();
        for (int i = 0; i<26;i++){
            char c = (char) (97 +i);
            String s = String.valueOf(c).toUpperCase();
            abc.add(s);
        }
        System.out.println(abc);

        Iterator<String> interator1 = abc.iterator();
        while (interator1.hasNext()){
            System.out.println(interator1.next());
        }
    }
}
