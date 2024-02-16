package stream.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        ArrayList<String> listTree = new ArrayList<>();
        listTree.add("ear");
        listTree.add("nose");
        listTree.add("eyes");
        listTree.add("lips");
        listTree.add("cheeks");
        System.out.println(listTree);
        ArrayList<String> al =(ArrayList<String>) listTree.stream().map((el)->{
            el = el +" = " + el.length();
            return el;
        }).collect(Collectors.toList());

        System.out.println(al);

        int[] arInt ={2,541,659,55,625,85,596,24,458,156,415,5848,1};
        for (int i: arInt){
            System.out.print(i + " ,");
        }

        int[] arIntEven = Arrays.stream(arInt).map((el)->{
            int el2 = 0;
            if (el%2==0){
                el2 = el;
            }
           return el2;
        }).toArray();
        System.out.println();
        for (int i: arIntEven){
            System.out.print(i + " ,");
        }


    }
}
