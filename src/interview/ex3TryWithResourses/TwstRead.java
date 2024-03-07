package interview.ex3TryWithResourses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TwstRead {
    public static void main(String[] args) {
        StringBuilder result= new StringBuilder();

        File file = new File("quote.txt");
        File file2 = new File("sorse.txt");

        try(FileReader read = new FileReader(file);
            FileReader read2 = new FileReader(file2);) {
            int val ;

            while ((val = read.read()) !=-1){
                result.append((char) val);
            }


            while ((val = read2.read()) !=-1){
                result.append((char) val);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);

    }
}
