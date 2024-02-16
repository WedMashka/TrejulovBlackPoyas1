package exTest.ex1;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

public class TestScaner {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Public\\books\\sours.txt";
        String path2 = "C:\\Users\\Public\\books\\sours2.txt";
        File f2 = new File(path2);
        File f = new File(path);
        Scanner in = new Scanner(Path.of(path), StandardCharsets.UTF_8);
        
        Map<String, Integer>  mapOnTree = new HashMap<>();


        List<Integer> listValue = new ArrayList<>();
        List<String> listKey = new ArrayList<>();


        while (in.hasNextLine()){
            String str = in.nextLine().trim();
            if (str.matches(".*\\d.*")) {
                char[] arCar = str.toCharArray();
                boolean defis = false;
                for (int i =0; i < arCar.length; i++){//check defis
                    if(arCar[i] =='-'){
                        defis = true;
                    }
                }

                if(defis){
                    String[] arstr = str.split("-");
                    listValue.add(Integer.parseInt(arstr[0]));
                } else {
                    listValue.add(Integer.parseInt(str));
                }


            } else if (!str.isEmpty()) {
                listKey.add(str);
            }
        }
        System.out.println(listValue);
        System.out.println(listKey);
        System.out.println(listValue.size());
        System.out.println(listKey.size());

        Map<String, Integer> ageTree = new HashMap<>();

        for (int i = 0; i < listKey.size(); i++) {
            ageTree.putIfAbsent(listKey.get(i),listValue.get(i));
        }

        System.out.println(ageTree);
        PrintWriter out = new PrintWriter(f2);
        out.print(ageTree);
        out.close();



    }
}
