package interview.ex3TryWithResourses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScaner {
    public static void main(String[] args) {
        File file = new File("source.txt");
        try (Scanner read = new Scanner(file)) {
            int counter = 1;

            while (read.hasNext()){
//                String marker = read.nextLine();
                if(read.nextLine().equalsIgnoreCase("вернуть номер этой строки") ){
                    System.out.println(counter);
                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
