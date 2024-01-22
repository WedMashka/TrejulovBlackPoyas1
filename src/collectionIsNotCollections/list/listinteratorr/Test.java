package collectionIsNotCollections.list.listinteratorr;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        String mad = "madam";
        List<Character> list = new LinkedList<>();
        for (char s: mad.toCharArray()){
            list.add(s);
        }
        System.out.println(list);

        ListIterator<Character> startInt = list.listIterator();
        ListIterator<Character> endInt = list.listIterator(list.size());

        while (startInt.hasNext() && endInt.hasPrevious()){
            if(startInt.next() != endInt.previous()){
                System.out.println("not palindrome ");
                break;
            }
        }

    }
}
