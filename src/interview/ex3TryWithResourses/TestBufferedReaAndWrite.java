package interview.ex3TryWithResourses;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestBufferedReaAndWrite {

    public static String getGoodPathIn(String pathBefore){
        String sep = File.separator;
        String[] arStringPath = pathBefore.split("\\\\");
        StringBuilder pathInPre = new StringBuilder();
        for (int i = 0; i < arStringPath.length; i++) {
            if((i + 1) == arStringPath.length){
                pathInPre.append(arStringPath[i]);
            } else {
                pathInPre.append(arStringPath[i] + sep);
            }

        }

        String pathIn = pathInPre.toString();
        return pathIn;
    }

    public static String getGoodPathOut(String pathBefore){
        String[] pathOut1 = pathBefore.split("\\\\");
        String sep = File.separator;
        for (int i = 0; i < pathOut1.length; i++) {
            if( (i+1) == pathOut1.length){
                StringBuilder editName = new StringBuilder(pathOut1[i]);
                editName.insert(0, "копия ");
                pathOut1[i] = editName.toString();
            }
        }
        String pathOut = Stream.of(pathOut1).collect(Collectors.joining(sep));
        return pathOut;
    }

    public static void main(String[] args) {
        String pathInBefore = "C:\\Users\\regul\\OneDrive\\Документы\\цитаты дамболдора.txt";
        String pathIn = getGoodPathIn(pathInBefore);
        String pathOut = getGoodPathOut(pathInBefore);
        File fileIn =new File(pathIn);
        File fileOut =new File(pathOut);


        try(BufferedReader read = new BufferedReader(new FileReader(fileIn));
            BufferedWriter write = new BufferedWriter(new FileWriter(fileOut));
            ) {
//            int character;
//
//            while ((character = read.read()) != -1){
//                write.write((char) character);
            String line;

            while ((line = read.readLine()) !=null){
                write.write(line);
                write.write("\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }




}


